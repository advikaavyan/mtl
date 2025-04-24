package com.anurag.tools.mtlui.controller;

import com.anurag.tools.mtlui.model.Exception;
import com.anurag.tools.mtlui.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exceptions")
public class ExceptionController {

    @Autowired
    private ExceptionService exceptionService;

    // Get all Exceptions
    @GetMapping
    public List<Exception> getAllExceptions() {
        return exceptionService.getAllExceptions();
    }

    // Save Exception
    @PostMapping
    public Exception saveException(@RequestBody Exception exception) {
        return exceptionService.saveException(exception);
    }

    // Delete Exception
    @DeleteMapping("/{index}")
    public void deleteException(@PathVariable int index) {
        exceptionService.deleteException(index);
    }
}
