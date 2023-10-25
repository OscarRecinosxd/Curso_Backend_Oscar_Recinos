package com.oscarrecinos.evaluacion2.controller;

import com.oscarrecinos.evaluacion2.model.Factura;
import com.oscarrecinos.evaluacion2.service.FacturaService;
import com.oscarrecinos.evaluacion2.utils.DummyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    FacturaService facturaService;


    @GetMapping("/ver")
    public String mostrarFactura(Model model){
        DummyData.agregarFacturas();

        List<Factura> facturas = facturaService.getAllFacturas();
        Factura factura1 = facturas.get(0);
        Factura factura2 = facturas.get(1);

        model.addAttribute("titulo","Lista de facturas");
        model.addAttribute("factura1", factura1);
        model.addAttribute("factura2", factura2);

        return "factura";
    }
}
