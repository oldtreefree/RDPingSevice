package com.rd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IpServerList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ip_address, module;


    public IpServerList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String title) {
        this.ip_address = title;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String anons) {
        this.module = anons;
    }


    public IpServerList(String ip_address, String module) {
        this.ip_address = ip_address;
        this.module = module;
    }
}
