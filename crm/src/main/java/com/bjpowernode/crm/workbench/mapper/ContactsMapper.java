package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.Contacts;

public interface ContactsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts
     *
     * @mbggenerated Sun Jul 23 17:00:49 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts
     *
     * @mbggenerated Sun Jul 23 17:00:49 CST 2023
     */
    int insert(Contacts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts
     *
     * @mbggenerated Sun Jul 23 17:00:49 CST 2023
     */
    int insertSelective(Contacts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts
     *
     * @mbggenerated Sun Jul 23 17:00:49 CST 2023
     */
    Contacts selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts
     *
     * @mbggenerated Sun Jul 23 17:00:49 CST 2023
     */
    int updateByPrimaryKeySelective(Contacts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts
     *
     * @mbggenerated Sun Jul 23 17:00:49 CST 2023
     */
    int updateByPrimaryKey(Contacts record);

    /**
     * 保存创建的联系人
     * @param contacts
     * @return
     */
    int insertContacts(Contacts contacts);
}
