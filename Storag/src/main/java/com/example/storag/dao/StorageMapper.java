package com.example.storag.dao;

import com.example.storag.dto.StorageDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 12:46
 */

@Mapper
public interface StorageMapper {
    /**
     * 根据id，查询单条记录
     * @param productId
     * @return
     */
    @Select("SELECT * FROM storage WHERE product_id = #{productId}   limit 1 ")
    StorageDO findOneByProductId(@Param("productId")Long productId);

    /**
     * 冻结库存
     * @param productId
     * @param residue
     * @param frozen
     */
    @Update("   UPDATE storage SET residue=#{residue},frozen=#{frozen} WHERE product_id=#{productId} ")
    void updateFrozen(@Param("productId") Long productId, @Param("residue") Integer residue, @Param("frozen") Integer frozen);

    /**
     * 提交时，把冻结量修改到已售出
     * @param productId
     * @param count
     */
    @Update("  UPDATE storage SET frozen=frozen-#{count} WHERE product_id=#{productId} ")
    void updateFrozenToUsed(@Param("productId") Long productId, @Param("count") Integer count);

    /**
     * 回滚时，把冻结量修改到可用库存
     * @param productId
     * @param count
     */
    @Update("  UPDATE storage SET frozen=frozen-#{count}, residue=residue+#{count} WHERE product_id=#{productId}  ")
    void updateFrozenToResidue(@Param("productId") Long productId, @Param("count") Integer count);
}
