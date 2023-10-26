package com.oscarrecinos.evaluacion2.service;

import com.oscarrecinos.evaluacion2.model.Factura;

import java.util.List;

public interface FacturaService {
    void  agregarFactura(Factura factura);
    List<Factura> getAllFacturas();
}
