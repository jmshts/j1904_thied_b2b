package com.sy.pojo;

import java.io.Serializable;

public class PermissionWithBLOBs extends Permission implements Serializable {
    private String url;

    private String icon;

    private static final long serialVersionUID = 1L;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}