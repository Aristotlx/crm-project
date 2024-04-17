package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.ContactsRemark;

import java.util.List;

public interface ContactsRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_remark
     *
     * @mbggenerated Sun Jul 23 22:34:52 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_remark
     *
     * @mbggenerated Sun Jul 23 22:34:52 CST 2023
     */
    int insert(ContactsRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_remark
     *
     * @mbggenerated Sun Jul 23 22:34:52 CST 2023
     */
    int insertSelective(ContactsRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_remark
     *
     * @mbggenerated Sun Jul 23 22:34:52 CST 2023
     */
    ContactsRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_remark
     *
     * @mbggenerated Sun Jul 23 22:34:52 CST 2023
     */
    int updateByPrimaryKeySelective(ContactsRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_remark
     *
     * @mbggenerated Sun Jul 23 22:34:52 CST 2023
     */
    int updateByPrimaryKey(ContactsRemark record);

    /**
     * 批量保存创建的联系人备注
     * @param list
     * @return
     */
    int insertContactsRemarkByList(List<ContactsRemark> list);
}