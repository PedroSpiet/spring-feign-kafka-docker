package com.spiet.address.gateway.services;

import com.spiet.address.gateway.ViaCepGateway;
import com.spiet.address.gateway.dtos.ViaCepResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ViaCepService {

    @Autowired
    private ViaCepGateway viaCepGateway;

    public ResponseEntity<ViaCepResponse> getCep(String cep) {
        try {
            return ResponseEntity.ok(viaCepGateway.getCep(cep));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.notFound().build();
    }
}
