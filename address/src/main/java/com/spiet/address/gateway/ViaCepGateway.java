package com.spiet.address.gateway;

import com.spiet.address.gateway.dtos.ViaCepResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepGateway {
    
    @GetMapping("/{cep}/json")
    ViaCepResponse getCep(@PathVariable("cep") String cep);
}
