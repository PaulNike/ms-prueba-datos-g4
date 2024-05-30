package com.codigo.mspruebadatos.controller;

import com.codigo.mspruebadatos.response.Persona;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/persona")
@RequiredArgsConstructor
@RefreshScope
public class PersonaController {
    @Value("${propiedad.test}")
    private String valorPropiedad;

    @GetMapping("/hola")
    public ResponseEntity<String> getValor(){
        return ResponseEntity.ok(valorPropiedad);
    }

    @GetMapping("/infoPersona")
    public Persona getPersona(){
        Persona persona = Persona.builder()
                .nombre("Paul Rodriguez")
                .edad(27)
                .email("prodriguez@ntt.com")
                .build();
        return  persona;
    }
}
