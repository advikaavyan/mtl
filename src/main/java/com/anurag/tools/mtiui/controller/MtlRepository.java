package com.anurag.tools.mtiui.controller;

import com.anurag.tools.mtiui.controller.Mtl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MtlRepository extends JpaRepository<Mtl, Long> {
    List<Mtl> findByActiveTrue();
}