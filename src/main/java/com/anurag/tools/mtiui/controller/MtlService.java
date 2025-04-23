package com.anurag.tools.mtiui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlService {
    @Autowired
    private MtlRepository mtlRepository;

    @Autowired
    private ExceptionRepository exceptionRepository;

    public List<Mtl> getAllMtls() {
        return mtlRepository.findAll();
    }

    public List<Exception> getAllExceptions() {
        return exceptionRepository.findAll();
    }


    @Autowired
    private MtlAssociationRepository mtlAssociationRepository; // A repository for associations if needed

    public void saveMtl(MtlRequest mtlRequest) {
        // Create a new Mtl object
        Mtl mtl = new Mtl();
        mtl.setMtlId(mtlRequest.getMtlId());
        mtl.setMtlName(mtlRequest.getMtlName());
        mtl.setMtlPath(mtlRequest.getMtlPath());

        // Save the MTL entity
        mtlRepository.save(mtl);

        // Associate MTLs - if any are selected
        if (mtlRequest.getAssociatedMtls() != null && !mtlRequest.getAssociatedMtls().isEmpty()) {
            for (Long mtlId : mtlRequest.getAssociatedMtls()) {
                Mtl associatedMtl = mtlRepository.findById(mtlId).orElse(null);
                if (associatedMtl != null) {
                    // Logic to associate the MTL (depending on your DB design)
                }
            }
        }

        // Associate Exceptions - if any are selected
        if (mtlRequest.getAssociatedExceptions() != null && !mtlRequest.getAssociatedExceptions().isEmpty()) {
            for (Long exceptionId : mtlRequest.getAssociatedExceptions()) {
                Exception exception = exceptionRepository.findById(exceptionId).orElse(null);
                if (exception != null) {
                    // Logic to associate the Exception (depending on your DB design)
                }
            }
        }
    }

}
