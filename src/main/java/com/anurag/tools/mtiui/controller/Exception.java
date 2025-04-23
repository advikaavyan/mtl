package com.anurag.tools.mtiui.controller;

import javax.persistence.*;

@Entity
public class Exception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exceptionName;
    public Exception() {
    }

    // Constructor with String parameter
    public Exception(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    // Getter and setter methods
    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }
}