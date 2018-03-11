package com.cjkj.entity;

public class GoodsType {
    /**
     * 商品类型表（图片保存在goods_img)
     */
    private Long typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型别名
     */
    private String typeNickname;

    /**
     * 1-实体商品，2-虚拟商品
     */
    private String typeIsreal;

    /**
     * 商品类型表（图片保存在goods_img)
     * @return type_id 商品类型表（图片保存在goods_img)
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 商品类型表（图片保存在goods_img)
     * @param typeId 商品类型表（图片保存在goods_img)
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 类型名称
     * @return type_name 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 类型名称
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 类型别名
     * @return type_nickname 类型别名
     */
    public String getTypeNickname() {
        return typeNickname;
    }

    /**
     * 类型别名
     * @param typeNickname 类型别名
     */
    public void setTypeNickname(String typeNickname) {
        this.typeNickname = typeNickname == null ? null : typeNickname.trim();
    }

    /**
     * 1-实体商品，2-虚拟商品
     * @return type_isreal 1-实体商品，2-虚拟商品
     */
    public String getTypeIsreal() {
        return typeIsreal;
    }

    /**
     * 1-实体商品，2-虚拟商品
     * @param typeIsreal 1-实体商品，2-虚拟商品
     */
    public void setTypeIsreal(String typeIsreal) {
        this.typeIsreal = typeIsreal == null ? null : typeIsreal.trim();
    }
}