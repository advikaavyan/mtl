package com.anurag.tools.mtlui.service;

import com.anurag.tools.mtlui.model.Exception;
import com.anurag.tools.mtlui.repository.ExceptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExceptionService {
    @Autowired
    private ExceptionRepository exceptionRepository;

    // Save Exception
    public Exception saveException(Exception exception) {
        return exceptionRepository.save(exception);
    }

    // Get All Exceptions
    public List<Exception> getAllExceptions() {
        return exceptionRepository.findAll();
    }

    // Delete Exception
    public void deleteException(int index) {
        exceptionRepository.delete(index);
    }
}
