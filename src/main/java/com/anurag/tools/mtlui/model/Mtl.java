package com.anurag.tools.mtlui.model;

import java.util.List;

public class Mtl {
    private String mtlName;
    private String mtlPath;
    private String mtlDescription;
    private List<String> associatedMtls;
    private List<String> associatedExceptions;

    // Getters and Setters
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

    public String getMtlDescription() {
        return mtlDescription;
    }

    public void setMtlDescription(String mtlDescription) {
        this.mtlDescription = mtlDescription;
    }

    public List<String> getAssociatedMtls() {
        return associatedMtls;
    }

    public void setAssociatedMtls(List<String> associatedMtls) {
        this.associatedMtls = associatedMtls;
    }

    public List<String> getAssociatedExceptions() {
        return associatedExceptions;
    }

    public void setAssociatedExceptions(List<String> associatedExceptions) {
        this.associatedExceptions = associatedExceptions;
    }
}
