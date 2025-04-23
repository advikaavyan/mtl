package com.anurag.tools.mtiui.controller;

import javax.persistence.*;

@Entity
public class MtlAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mtl_id")
    private Mtl mtl;

    @ManyToOne
    @JoinColumn(name = "exception_id")
    private Exception exception;

    // Getters and Setters
}
