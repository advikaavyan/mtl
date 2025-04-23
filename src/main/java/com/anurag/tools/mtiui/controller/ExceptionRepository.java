package com.anurag.tools.mtiui.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExceptionRepository extends JpaRepository<Exception, Long> {
    List<Exception> findAll(); // To get all Exceptions
}