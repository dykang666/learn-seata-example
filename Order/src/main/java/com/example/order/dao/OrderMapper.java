package com.example.order.dao;

import com.example.order.dto.OrderDO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 11:40
 */

@Mapper
public interface OrderMapper {
    /**
     * 新增
     * @return
     */
    @Insert("INSERT INTO  `order` (order_no, user_id, product_id, amount, money, status) VALUES (#{orderNo}, #{userId}, #{productId}, #{amount}, #{money}, #{status})")
    void saveData(OrderDO order);

    /**
     * 根据id，更新状态
     * @param orderNo
     * @param status
     */
    @Delete(" update `order` set status=#{status} WHERE order_no=#{orderNo} ")
    void updateStatusByOrderNo( String orderNo,  Integer status);

    /**
     * 根据id，删除
     * @param orderNo
     */
    @Delete(" DELETE FROM  `order` WHERE order_no = #{orderNo}")
    void deleteByOrderNo(String orderNo);
}
