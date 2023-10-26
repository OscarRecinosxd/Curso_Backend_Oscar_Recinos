package com.example.facturacliente.controller;

import com.example.facturacliente.models.dao.IClienteDao;
import com.example.facturacliente.models.entity.Cliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("cliente")
public class ClienteController {
    @Autowired
    private IClienteDao clienteDao;

    @RequestMapping(value = "/listar",method = RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo","listado de clientes");
        model.addAttribute("clientes",clienteDao.findAll());
        return  "listar";
    }











}
