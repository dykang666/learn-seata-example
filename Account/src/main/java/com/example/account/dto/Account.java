package com.example.account.dto;

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
@TableName("account_tbl")
public class Account implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String userId;
    private Integer money;

}
