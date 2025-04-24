package com.anurag.tools.mtlui.repository;


import com.anurag.tools.mtlui.model.Exception;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExceptionRepository {
    private static List<Exception> exceptions = new ArrayList<>();

    // Initializing some sample data
    static {
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

        exceptions.add(exception1);
        exceptions.add(exception2);
    }

    // Save Exception
    public Exception save(Exception exception) {
        exceptions.add(exception);
        return exception;
    }

    // Find All Exceptions
    public List<Exception> findAll() {
        return exceptions;
    }

    // Find by Index
    public Exception findById(int index) {
        return exceptions.get(index);
    }

    // Delete Exception by Index
    public void delete(int index) {
        exceptions.remove(index);
    }
}
