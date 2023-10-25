package com.oscarrecinos.evaluacion2.service;

import com.oscarrecinos.evaluacion2.model.Factura;
import com.oscarrecinos.evaluacion2.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    public void agregarFactura(Factura factura){
        FacturaRepository.facturasGuardadas.add(factura);
    }

    public List<Factura> getAllFacturas(){
        return FacturaRepository.facturasGuardadas;
    }

}
