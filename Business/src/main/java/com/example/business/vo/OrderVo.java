package com.example.business.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liuyongtao
 * @since 2021-3-2 11:31
 */
@Data
@Accessors(chain = true)
public class OrderVo implements Serializable {

    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;

}
