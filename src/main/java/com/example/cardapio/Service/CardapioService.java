/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cardapio.Service;

import com.example.cardapio.Model.CardapioBEAN;
import com.example.cardapio.Repository.CardapioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class CardapioService {
    @Autowired
    private CardapioDAO repository;
    
    public List<CardapioBEAN> lerTodos(){
      return repository.lerTodos();
    }
    
    public void adicionar(CardapioBEAN cardapio){
        repository.adicionar(cardapio);
    }
}
