package com.example.demo.entity;

/**
 * @Created: by 2022-07-18 11:06
 * @Description:
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class MdCodeValue {

    /**
     * 逻辑主键
     */
    private Long id;

    /**
     * 码值目录主键
     */
    private Long cvCatalogueId;

    /**
     * 码
     */
    private String cvCode;

    /**
     * 值
     */
    private String cvValue;

    /**
     * 父级码值主键
     */
    private Long cvParentId;

    /**
     * 描述
     */
    private String cvDesc;

    /**
     * 是否启用
     */
    private Boolean enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCvCatalogueId() {
        return cvCatalogueId;
    }

    public void setCvCatalogueId(Long cvCatalogueId) {
        this.cvCatalogueId = cvCatalogueId;
    }

    public String getCvCode() {
        return cvCode;
    }

    public void setCvCode(String cvCode) {
        this.cvCode = cvCode;
    }

    public String getCvValue() {
        return cvValue;
    }

    public void setCvValue(String cvValue) {
        this.cvValue = cvValue;
    }

    public Long getCvParentId() {
        return cvParentId;
    }

    public void setCvParentId(Long cvParentId) {
        this.cvParentId = cvParentId;
    }

    public String getCvDesc() {
        return cvDesc;
    }

    public void setCvDesc(String cvDesc) {
        this.cvDesc = cvDesc;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * toString
     *
     * @return String String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cvCatalogueId=").append(cvCatalogueId);
        sb.append(", cvCode=").append(cvCode);
        sb.append(", cvValue=").append(cvValue);
        sb.append(", cvParentId=").append(cvParentId);
        sb.append(", cvDesc=").append(cvDesc);
        sb.append(", enabled=").append(enabled);
        sb.append("]");
        return sb.toString();
    }

    /**
     * equals
     *
     * @param that that
     * @return boolean boolean
     */
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
        MdCodeValue other = (MdCodeValue) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCvCatalogueId() == null ? other.getCvCatalogueId() == null
                : this.getCvCatalogueId().equals(other.getCvCatalogueId()))
                && (this.getCvCode() == null ? other.getCvCode() == null
                : this.getCvCode().equals(other.getCvCode()))
                && (this.getCvValue() == null ? other.getCvValue() == null
                : this.getCvValue().equals(other.getCvValue()))
                && (this.getCvParentId() == null ? other.getCvParentId() == null
                : this.getCvParentId().equals(other.getCvParentId()))
                && (this.getCvDesc() == null ? other.getCvDesc() == null
                : this.getCvDesc().equals(other.getCvDesc()))
                && (this.getEnabled() == null ? other.getEnabled() == null
                : this.getEnabled().equals(other.getEnabled()));
    }

    /**
     * hashCode
     *
     * @return int int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result =
                prime * result + ((getCvCatalogueId() == null) ? 0 : getCvCatalogueId().hashCode());
        result = prime * result + ((getCvCode() == null) ? 0 : getCvCode().hashCode());
        result = prime * result + ((getCvValue() == null) ? 0 : getCvValue().hashCode());
        result = prime * result + ((getCvParentId() == null) ? 0 : getCvParentId().hashCode());
        result = prime * result + ((getCvDesc() == null) ? 0 : getCvDesc().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return result;
    }

}
