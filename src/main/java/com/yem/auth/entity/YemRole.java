package com.yem.auth.entity;

import java.util.Date;
import java.util.Set;

public class YemRole {
    private String roleId;

    private Long roleCode;

    private String roleName;

    private Boolean valid;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
    
    private Set<YemPermission> permissions;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Long getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Long roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

	public Set<YemPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<YemPermission> permissions) {
		this.permissions = permissions;
	}
    
}