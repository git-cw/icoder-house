package com.icoder.jxhouse.pojo.po.user;

/**
 * Created by congwangshi on 16/4/25.
 */
public class Permission {
    private Integer id;
    private String permissionName;
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
