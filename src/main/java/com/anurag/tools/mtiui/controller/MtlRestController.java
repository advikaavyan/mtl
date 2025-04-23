package com.anurag.tools.mtiui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/mtls")
public class MtlRestController {

    @Autowired
    private MtlService mtlService;

    @GetMapping("/mtls")
    public List<Mtl> getMtls() {
        return mtlService.getAllMtls();
    }



    @PostMapping("/")
    public ResponseEntity<String> saveMtl(@RequestBody MtlRequest mtlRequest) {
        // Logic to save MTL with associated MTLs and exceptions
        // Save logic goes here
        return ResponseEntity.ok("MTL saved successfully");
    }



    @GetMapping("/exceptions")
    public List<String> getSampleExceptions() {
        return Arrays.asList("Exception1", "Exception2", "Exception3", "Exception4", "Exception5", "Exception6", "Exception7", "Exception8", "Exception9", "Exception10");
    }

    @GetMapping("/associated-mtls")
    public List<String> getSampleAssociatedMtls() {
        return Arrays.asList("MTL-A", "MTL-B", "MTL-C", "MTL-D");
    }

}
