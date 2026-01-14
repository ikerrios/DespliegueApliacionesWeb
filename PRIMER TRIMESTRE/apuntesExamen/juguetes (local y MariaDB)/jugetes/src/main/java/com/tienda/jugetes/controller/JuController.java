package com.tienda.jugetes.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.tienda.jugetes.entity.Jugete;
import com.tienda.jugetes.repository.JuRepository;

@RestController
@RequestMapping("/ju")

public class JuController {

private JuRepository juRepository;

    public JuController(JuRepository juRepository) {
        this.juRepository = juRepository;
    }  


    @GetMapping ("/list")
    public List<Jugete> listado() {
        return juRepository.findAll();

    }


    
}