package com.gaokun.e3.mapper;

import com.gaokun.e3.pojo.TbContent;
import com.gaokun.e3.pojo.TbContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int countByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int deleteByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int insert(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int insertSelective(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    List<TbContent> selectByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int updateByPrimaryKeyWithBLOBs(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Tue Jul 18 09:28:44 PKT 2017
     */
    int updateByPrimaryKey(TbContent record);
}