package com.icoder.jxhouse.pojo.po.user;

/**
 * Created by congwangshi on 16/4/25.
 */
public class Role {
    private Integer id;
    private String roleName;
    private Integer delFalg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getDelFalg() {
        return delFalg;
    }

    public void setDelFalg(Integer delFalg) {
        this.delFalg = delFalg;
    }
}
