package com.example.storag.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.storag.dto.Storage;


/**
 * @author liuyongtao
 * @since 2021-3-2 11:36
 */
public interface StorageService extends IService<Storage> {

    boolean subStorage(String commodityCode, Integer count);

    void decreaseStorage(Long productId, Integer count);

}
