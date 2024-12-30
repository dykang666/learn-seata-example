package com.example.storag.dto;

import lombok.Data;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 12:47
 */
@Data
public class StorageDO {
    private Long id;
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 剩余库存
     */
    private Integer residue;
    /**
     * TCC事务锁定的库存
     */
    private Integer frozen;
}
