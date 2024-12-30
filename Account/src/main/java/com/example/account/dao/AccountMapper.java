package com.example.account.dao;

import com.example.account.dto.AccountDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 12:23
 */
@Repository
@Mapper
public interface AccountMapper {
    /**
     * 根据用户id查询单行
     * @param userId
     * @return
     */
    @Select("SELECT * FROM account WHERE user_id = #{userId}   limit 1 ")
    AccountDO findOneByUserId(Long userId);

    /**
     * 冻结钱
     * @param userId 用户id
     * @param residue 剩余额度
     * @param frozen 冻结额度
     */
    @Update(" UPDATE account SET `residue`=#{residue},`frozen`=#{frozen} WHERE `user_id`=#{userId}")
    void updateFrozen( Long userId,  BigDecimal residue, BigDecimal frozen);

    /**
     * 将冻结的钱，转换为已使用
     * @param userId
     * @param money
     */
    @Update(" UPDATE account SET `frozen`=frozen-#{money} WHERE `user_id`=#{userId}")
    void updateFrozenToUsed(@Param("userId") Long userId, @Param("money") BigDecimal money);

    /**
     * 将冻结的钱，还原为库存
     * @param userId
     * @param money
     */

    @Update("  UPDATE account SET `frozen`=`frozen`-#{money}, `residue`=`residue`+#{money} WHERE `user_id`=#{userId}")
    void updateFrozenToResidue(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
