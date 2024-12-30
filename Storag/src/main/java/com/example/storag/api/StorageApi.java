package com.example.storag.api;

import com.example.storag.service.StorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuyongtao
 * @since 2021-3-2 11:36
 */
@RestController
public class StorageApi {

    @Autowired
    private StorageService storageService;

    @PostMapping("/{commodityCode}")
    public boolean subStorage(@PathVariable("commodityCode") String commodityCode, @RequestParam("count") Integer count) {
        return storageService.subStorage(commodityCode, count);
    }
    @PostMapping("/decrease-storage")
    public String decreaseStorage(@RequestParam("productId") Long productId,@RequestParam("count") Integer count)  {
        storageService.decreaseStorage(productId,count);
        return "减少商品库存成功！";
    }

}
