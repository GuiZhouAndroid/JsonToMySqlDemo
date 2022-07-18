package com.example.demo.entity;

import java.io.Serializable;

/**
 * @Created: by 2022-07-18 11:05
 * @Description:
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class MdCodeValueMapping implements Serializable {

    /**
     * 逻辑主键
     */
    private Long id;

    /**
     * 要翻译的资产路径
     */
    private String mappingAssetsPath;

    /**
     * 用来翻译的码值目录主键
     */
    private Long cvCatalogueId;

    private static final long serialVersionUID = 1L;

    /**
     * 逻辑主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 逻辑主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 要翻译的资产路径
     */
    public String getMappingAssetsPath() {
        return mappingAssetsPath;
    }

    /**
     * 要翻译的资产路径
     */
    public void setMappingAssetsPath(String mappingAssetsPath) {
        this.mappingAssetsPath = mappingAssetsPath;
    }

    /**
     * 用来翻译的码值目录主键
     */
    public Long getCvCatalogueId() {
        return cvCatalogueId;
    }

    /**
     * 用来翻译的码值目录主键
     */
    public void setCvCatalogueId(Long cvCatalogueId) {
        this.cvCatalogueId = cvCatalogueId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MdCodeValueMapping other = (MdCodeValueMapping) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMappingAssetsPath() == null ? other.getMappingAssetsPath() == null
                : this.getMappingAssetsPath().equals(other.getMappingAssetsPath()))
                && (this.getCvCatalogueId() == null ? other.getCvCatalogueId() == null
                : this.getCvCatalogueId().equals(other.getCvCatalogueId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMappingAssetsPath() == null) ? 0
                : getMappingAssetsPath().hashCode());
        result =
                prime * result + ((getCvCatalogueId() == null) ? 0 : getCvCatalogueId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mappingAssetsPath=").append(mappingAssetsPath);
        sb.append(", cvCatalogueId=").append(cvCatalogueId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
