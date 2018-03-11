package com.cjkj.entity;

public class Basics {
    /**
     * 公司基础信息表
     */
    private Long basicsId;

    /**
     * 公司名称
     */
    private String basicsName;

    /**
     * 公司地址
     */
    private String basicsAddress;

    /**
     * 公司经营范围
     */
    private String basicsRange;

    /**
     * 联系电话1
     */
    private String basicsPhone1;

    /**
     * 联系电话2
     */
    private String basicsPhone2;

    /**
     * 其他说明
     */
    private String basicsMsg;

    /**
     * 公司基础信息表
     * @return basics_id 公司基础信息表
     */
    public Long getBasicsId() {
        return basicsId;
    }

    /**
     * 公司基础信息表
     * @param basicsId 公司基础信息表
     */
    public void setBasicsId(Long basicsId) {
        this.basicsId = basicsId;
    }

    /**
     * 公司名称
     * @return basics_name 公司名称
     */
    public String getBasicsName() {
        return basicsName;
    }

    /**
     * 公司名称
     * @param basicsName 公司名称
     */
    public void setBasicsName(String basicsName) {
        this.basicsName = basicsName == null ? null : basicsName.trim();
    }

    /**
     * 公司地址
     * @return basics_address 公司地址
     */
    public String getBasicsAddress() {
        return basicsAddress;
    }

    /**
     * 公司地址
     * @param basicsAddress 公司地址
     */
    public void setBasicsAddress(String basicsAddress) {
        this.basicsAddress = basicsAddress == null ? null : basicsAddress.trim();
    }

    /**
     * 公司经营范围
     * @return basics_range 公司经营范围
     */
    public String getBasicsRange() {
        return basicsRange;
    }

    /**
     * 公司经营范围
     * @param basicsRange 公司经营范围
     */
    public void setBasicsRange(String basicsRange) {
        this.basicsRange = basicsRange == null ? null : basicsRange.trim();
    }

    /**
     * 联系电话1
     * @return basics_phone1 联系电话1
     */
    public String getBasicsPhone1() {
        return basicsPhone1;
    }

    /**
     * 联系电话1
     * @param basicsPhone1 联系电话1
     */
    public void setBasicsPhone1(String basicsPhone1) {
        this.basicsPhone1 = basicsPhone1 == null ? null : basicsPhone1.trim();
    }

    /**
     * 联系电话2
     * @return basics_phone2 联系电话2
     */
    public String getBasicsPhone2() {
        return basicsPhone2;
    }

    /**
     * 联系电话2
     * @param basicsPhone2 联系电话2
     */
    public void setBasicsPhone2(String basicsPhone2) {
        this.basicsPhone2 = basicsPhone2 == null ? null : basicsPhone2.trim();
    }

    /**
     * 其他说明
     * @return basics_msg 其他说明
     */
    public String getBasicsMsg() {
        return basicsMsg;
    }

    /**
     * 其他说明
     * @param basicsMsg 其他说明
     */
    public void setBasicsMsg(String basicsMsg) {
        this.basicsMsg = basicsMsg == null ? null : basicsMsg.trim();
    }
}