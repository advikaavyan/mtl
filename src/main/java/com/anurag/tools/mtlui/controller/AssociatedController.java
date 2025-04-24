package com.anurag.tools.mtlui.controller;

import com.anurag.tools.mtlui.model.Mtl;
import com.anurag.tools.mtlui.service.ExceptionService;
import com.anurag.tools.mtlui.service.MtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/associated")
public class AssociatedController {
    @Autowired
    private ExceptionService exceptionService;

    @Autowired
    private MtlService mtlService;

    // Get all MTLs
    @GetMapping
    public Map<String, List> getAllMtls() {
        Map associatedMtlsSelect = new HashMap();
        associatedMtlsSelect.put("mtls", mtlService.getAllMtls());
        associatedMtlsSelect.put("exceptions", exceptionService.getAllExceptions());

        return associatedMtlsSelect;
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
