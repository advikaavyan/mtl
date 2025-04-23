package com.anurag.tools.mtiui.controller;

import java.util.List;

public class MtlRequest {
    private String mtlId;
    private String mtlName;
    private String mtlPath;
    private List<Long> associatedMtls; // List of associated MTL IDs
    private List<Long> associatedExceptions; // List of associated Exception IDs

    // Getters and Setters
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

    public List<Long> getAssociatedMtls() {
        return associatedMtls;
    }

    public void setAssociatedMtls(List<Long> associatedMtls) {
        this.associatedMtls = associatedMtls;
    }

    public List<Long> getAssociatedExceptions() {
        return associatedExceptions;
    }

    public void setAssociatedExceptions(List<Long> associatedExceptions) {
        this.associatedExceptions = associatedExceptions;
    }
}
