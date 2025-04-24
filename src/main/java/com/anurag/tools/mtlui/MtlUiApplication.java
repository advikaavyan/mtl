package com.anurag.tools.mtlui;

import com.anurag.tools.mtlui.model.Mtl;
import com.anurag.tools.mtlui.model.Exception;
import com.anurag.tools.mtlui.repository.MtlRepository;
import com.anurag.tools.mtlui.repository.ExceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MtlUiApplication implements CommandLineRunner {

    @Autowired
    private MtlRepository mtlRepository;

    @Autowired
    private ExceptionRepository exceptionRepository;

    public static void main(String[] args) {
        SpringApplication.run(MtlUiApplication.class, args);
    }

    @Override
    public void run(String... args) throws java.lang.Exception {
        // Sample MTLs
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

        mtlRepository.save(mtl1);
        mtlRepository.save(mtl2);

        // Sample Exceptions
        Exception exception1 = new Exception();
        exception1.setExceptionName("Exception1");
        exception1.setExceptionType("Type1");
        exception1.setProduct("Product1");
        exception1.setExceptionDetail("Sample exception detail 1");

        Exception exception2 = new Exception();
        exception2.setExceptionName("Exception2");
        exception2.setExceptionType("Type2");
        exception2.setProduct("Product2");
        exception2.setExceptionDetail("Sample exception detail 2");

        exceptionRepository.save(exception1);
        exceptionRepository.save(exception2);
    }
}
