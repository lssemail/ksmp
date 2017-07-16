package com.kusion.monitor.platform.model;

import com.kusion.monitor.platform.model.business.Business;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/16.
 */
@Entity
@Table(name = "data_company")
public class Company extends BaseModel{

    private String name;

    private String code;

    private String phone;

    private String contact;

    private String description;

    @OneToMany(mappedBy = "company")
    private Set<Business> sites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Business> getSites() {
        return sites;
    }

    public void setSites(Set<Business> sites) {
        this.sites = sites;
    }
}
