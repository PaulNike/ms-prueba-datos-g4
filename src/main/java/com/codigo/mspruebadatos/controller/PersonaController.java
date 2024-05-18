package com.codigo.mspruebadatos.controller;

import com.codigo.mspruebadatos.response.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/persona")
public class PersonaController {

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
