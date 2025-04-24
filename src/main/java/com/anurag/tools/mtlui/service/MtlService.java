package com.anurag.tools.mtlui.service;

import com.anurag.tools.mtlui.model.Mtl;
import com.anurag.tools.mtlui.repository.MtlRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlService {
    @Autowired
    private MtlRepository mtlRepository;

    // Save MTL
    public Mtl saveMtl(Mtl mtl) {
        return mtlRepository.save(mtl);
    }

    // Get All MTLs
    public List<Mtl> getAllMtls() {
        return mtlRepository.findAll();
    }

    // Delete MTL
    public void deleteMtl(int index) {
        mtlRepository.delete(index);
    }
}
