package com.example.storag.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.storag.dao.StorageDao;
import com.example.storag.dto.Storage;
import com.example.storag.service.StorageService;
import com.example.storag.tcc.StorageTccAction;
import com.example.storag.tcc.impl.StorageTccActionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author liuyongtao
 * @since 2021-3-2 15:57
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageDao, Storage> implements StorageService {
    @Autowired
    private StorageTccAction storageTccAction;
    @Override
    @Transactional
    public boolean subStorage(String commodityCode, Integer count) {
        LambdaQueryWrapper<Storage> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(Storage::getCommodityCode, commodityCode);
        List<Storage> list = this.list(wrapper);


        if(list.size() > 0){
            Storage storage = list.get(0);
            Integer c = storage.getCount() - count;
            if (c < 0) {
                throw new RuntimeException("库存不不足！！！");
            }
            storage.setCount(c);
            this.updateById(storage);
            return true;
        }
        return false;
    }

    @Override
    public void decreaseStorage(Long productId, Integer count) {
        storageTccAction.prepareDecreaseStorage(null, productId, count);
    }
}
