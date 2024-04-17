package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.settings.domain.DicValue;

import java.util.List;

public interface DicValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Jul 09 14:47:57 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Jul 09 14:47:57 CST 2023
     */
    int insert(DicValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Jul 09 14:47:57 CST 2023
     */
    int insertSelective(DicValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Jul 09 14:47:57 CST 2023
     */
    DicValue selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Jul 09 14:47:57 CST 2023
     */
    int updateByPrimaryKeySelective(DicValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Jul 09 14:47:57 CST 2023
     */
    int updateByPrimaryKey(DicValue record);

    /**
     * 根据typeCode查询数据字典值
     * @param typeCode
     * @return
     */
    List<DicValue> selectDicValueByTypeCode(String typeCode);
}
