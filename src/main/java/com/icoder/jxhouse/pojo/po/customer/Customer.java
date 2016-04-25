package com.icoder.jxhouse.pojo.po.customer;

import javax.persistence.*;

/**
 * Created by congwangshi on 16/4/25.
 */

@Entity
@Table(name = "customer")
public class Customer {

    private Integer id;
    private Integer cnname;
    private String gender;
    private String tel;
    private String address;
    private String area;
    private String idCard;
    private String job;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "cnname",length =50)
    public Integer getCnname() {
        return cnname;
    }

    public void setCnname(Integer cnname) {
        this.cnname = cnname;
    }

    @Column(name = "gender",length =10)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "tel",length =50)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
