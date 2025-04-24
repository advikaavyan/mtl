package com.anurag.tools.mtlui.repository;

import com.anurag.tools.mtlui.model.Mtl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MtlRepository {
    private static List<Mtl> mtls = new ArrayList<>();

    // Initializing some sample data
    static {
        Mtl mtl1 = new Mtl();
        mtl1.setMtlName("MTL1");
        mtl1.setMtlPath("/path/to/mtl1");
        mtl1.setMtlDescription("Sample description for MTL1");
        mtl1.setAssociatedMtls(List.of("MTL2", "MTL3"));
        mtl1.setAssociatedExceptions(List.of("Exception1", "Exception2"));

        Mtl mtl2 = new Mtl();
        mtl2.setMtlName("MTL2");
        mtl2.setMtlPath("/path/to/mtl2");
        mtl2.setMtlDescription("Sample description for MTL2");
        mtl2.setAssociatedMtls(List.of("MTL1"));
        mtl2.setAssociatedExceptions(List.of("Exception2", "Exception3"));

        mtls.add(mtl1);
        mtls.add(mtl2);
    }

    // Save MTL
    public Mtl save(Mtl mtl) {
        mtls.add(mtl);
        return mtl;
    }

    // Find All MTLs
    public List<Mtl> findAll() {
        return mtls;
    }

    // Find by Index
    public Mtl findById(int index) {
        return mtls.get(index);
    }

    // Delete MTL by Index
    public void delete(int index) {
        mtls.remove(index);
    }
}
