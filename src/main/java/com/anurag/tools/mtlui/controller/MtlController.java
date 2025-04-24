package com.anurag.tools.mtlui.controller;

import com.anurag.tools.mtlui.model.Mtl;
import com.anurag.tools.mtlui.service.MtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mtls")
public class MtlController {

    @Autowired
    private MtlService mtlService;

    // Get all MTLs
    @GetMapping
    public List<Mtl> getAllMtls() {
        return mtlService.getAllMtls();
    }

    // Save MTL
    @PostMapping
    public Mtl saveMtl(@RequestBody Mtl mtl) {
        return mtlService.saveMtl(mtl);
    }

    // Delete MTL
    @DeleteMapping("/{index}")
    public void deleteMtl(@PathVariable int index) {
        mtlService.deleteMtl(index);
    }
}
