/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cardapio.Controller;

import com.example.cardapio.Model.CardapioBEAN;
import com.example.cardapio.Service.CardapioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api/cardapio")
public class CardapioAPIController {
    @Autowired
    private CardapioService Service;
    
    @GetMapping
    public List<CardapioBEAN> listarTodos(){
        return Service.lerTodos();
    }
    
    @PostMapping
    public String Criar(@RequestBody CardapioBEAN cardapio){
        Service.adicionar(cardapio);
        return "usuario";
    }
    
}
