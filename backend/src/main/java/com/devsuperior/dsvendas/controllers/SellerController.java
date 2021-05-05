package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.Services.SellerService;
import com.devsuperior.dsvendas.dto.SellerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }
    
}
