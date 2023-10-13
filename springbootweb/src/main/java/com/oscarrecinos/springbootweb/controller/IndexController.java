package com.oscarrecinos.springbootweb.controller;

import com.oscarrecinos.springbootweb.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index","/","/home"})
    public String index(Model model){
        model.addAttribute("titulo","Cader hola");
        return "index";
        //this is the name of your view

    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario("Oscar","Recinos");
        usuario.setEmail("osa@mail.com");
        model.addAttribute("usuario",usuario);
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        List<Usuario> usuarios = new ArrayList<>();
        float a = 0f;
        int b = 5;
        System.out.println(a+b);

        usuarios.add(new Usuario("Oscar","Recinos"));
        usuarios.add(new Usuario("Macol","Keider","hola@gmail.com"));
        usuarios.add(new Usuario("Emely","Lazo", null));
        usuarios.add(null);

        model.addAttribute("titulo","Listado de usuarios");
        model.addAttribute("usuarios", usuarios);

        return "listar";
    }


}
