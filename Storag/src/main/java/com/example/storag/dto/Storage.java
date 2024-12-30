package com.example.storag.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liuyongtao
 * @since 2021-3-2 11:31
 */
@Data

@Accessors(chain = true)
@TableName("storage_tbl")
public class Storage implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String commodityCode;
    private Integer count;

}
