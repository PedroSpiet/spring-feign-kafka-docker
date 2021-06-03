package com.spiet.address.controllers;

import com.spiet.address.gateway.dtos.ViaCepResponse;
import com.spiet.address.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("{cep}")
    public ResponseEntity<ViaCepResponse> getCep(@PathVariable String cep) {
        return cepService.getCep(cep);
    }
}
