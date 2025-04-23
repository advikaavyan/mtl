package com.anurag.tools.mtiui.controller;

import javax.persistence.*;

@Entity
public class Mtl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mtlId;
    private String mtlName;
    private String mtlPath;
    private String associatedMtls;
    private String associatedExceptions;
    private boolean active = true;
    public Mtl() {
    }

    // Constructor with parameters
    public Mtl(String mtlName, String mtlPath) {
        this.mtlName = mtlName;
        this.mtlPath = mtlPath;
    }
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMtlId() {
        return mtlId;
    }

    public void setMtlId(String mtlId) {
        this.mtlId = mtlId;
    }

    public String getMtlName() {
        return mtlName;
    }

    public void setMtlName(String mtlName) {
        this.mtlName = mtlName;
    }

    public String getMtlPath() {
        return mtlPath;
    }

    public void setMtlPath(String mtlPath) {
        this.mtlPath = mtlPath;
    }

    public String getAssociatedMtls() {
        return associatedMtls;
    }

    public void setAssociatedMtls(String associatedMtls) {
        this.associatedMtls = associatedMtls;
    }

    public String getAssociatedExceptions() {
        return associatedExceptions;
    }

    public void setAssociatedExceptions(String associatedExceptions) {
        this.associatedExceptions = associatedExceptions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;

    }
}