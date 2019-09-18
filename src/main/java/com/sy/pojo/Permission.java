package com.sy.pojo;

import java.io.Serializable;

public class Permission implements Serializable {
    //权限id
    private Integer permissionid;
//父节点id
    private Integer parentid;
//权限名称
    private String permissionname;
//权限简介
    private String permissiondesc;

    private String permissionurl;
//是否有效
    private Integer ifvalid;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public String getPermissiondesc() {
        return permissiondesc;
    }

    public void setPermissiondesc(String permissiondesc) {
        this.permissiondesc = permissiondesc == null ? null : permissiondesc.trim();
    }

    public String getPermissionurl() {
        return permissionurl;
    }

    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl == null ? null : permissionurl.trim();
    }

    public Integer getIfvalid() {
        return ifvalid;
    }

    public void setIfvalid(Integer ifvalid) {
        this.ifvalid = ifvalid;
    }
}