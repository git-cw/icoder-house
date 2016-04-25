package com.icoder.jxhouse.pojo.po.sysuser;

import com.icoder.jxhouse.pojo.po.base.Base;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by congwangshi on 16/4/24.
 */
@Entity
@Table(name = "sys_user")

public class SysUser extends Base{
    private String cnname;
    private String username;
    private String password;
    private Integer id;
    private Date createDate;
    private Date updateDate;
    private boolean delFlag= false;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "del_flag",columnDefinition = "smallint default 0")
    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    @Column(name = "update_date",columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    public Date getUpdateDate() {
        return updateDate;
    }


    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "create_date",columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "cnname",length =50)
    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    @Column(name = "username",length =50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password",length =200 )
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
