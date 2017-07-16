package com.kusion.monitor.platform.model.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kusion.monitor.platform.model.BaseModel;
import com.kusion.monitor.platform.model.Company;
import com.kusion.monitor.platform.model.enums.EnumBusiness;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/16.
 */
@Entity
@Table(name = "data_business")
public class Business extends BaseModel {

    private String url;

    private Date validDate;

    private String remark;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "comp_id")
    private Company company;

    @Enumerated(value = EnumType.STRING)
    private EnumBusiness type;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public EnumBusiness getType() {
        return type;
    }

    public void setType(EnumBusiness type) {
        this.type = type;
    }
}
