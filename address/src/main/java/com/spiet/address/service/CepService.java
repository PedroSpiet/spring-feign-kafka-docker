package com.spiet.address.service;

import com.spiet.address.gateway.dtos.ViaCepResponse;
import com.spiet.address.gateway.services.ViaCepService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CepService {

    @Autowired
    private ViaCepService viaCepService;

    public ResponseEntity<ViaCepResponse> getCep(String cep) {
        return viaCepService.getCep(cep);
    }
}
