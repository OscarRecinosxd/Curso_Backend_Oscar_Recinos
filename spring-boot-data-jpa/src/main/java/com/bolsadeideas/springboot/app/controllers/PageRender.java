package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.util.PageItem;
import org.springframework.data.domain.Page;

import java.util.List;

public class PageRender<T> {
    private String url;
    private Page<T> page;
    private int totalPaginas;
    private int numElementosPorPagina;

    private int paginaActual;

    private List<PageItem> paginas;

    public boolean isfirst(){
        return page.hasNext();
    }
    public PageRender(String url, Page<T> page) {
        this.url = url;
        this.page = page;
        numElementosPorPagina = page.getSize();
        totalPaginas = page.getTotalPages();

        paginaActual = page.getNumber() +1;

        int desde,hasta;
        if(totalPaginas <= numElementosPorPagina){
            desde = 1;
            hasta = totalPaginas;
        } else{
            if (paginaActual <= numElementosPorPagina/2){
                desde = 1;
                hasta = totalPaginas;
            } else if (paginaActual >= totalPaginas - numElementosPorPagina) {
                desde = totalPaginas - numElementosPorPagina +1;
                hasta = numElementosPorPagina;
            } else {
                desde = paginaActual - numElementosPorPagina/2;
                hasta = numElementosPorPagina;
            }
        }
        for(int i = 0; i < hasta; i++) {
            paginas.add(new PageItem(desde+i,paginaActual==desde+i));
        }
    }
}
