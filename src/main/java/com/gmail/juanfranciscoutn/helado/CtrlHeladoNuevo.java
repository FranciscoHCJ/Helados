package com.gmail.juanfranciscoutn.helado;

import com.gmail.juanfranciscoutn.web.Mensajes;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named
@ViewScoped
public class CtrlHeladoNuevo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Inject
    private Mensajes mensajes;
    @Inject
    private DaoHelado dao;
    private Helado modelo;
    
    @PostConstruct
    void init() {
        modelo = new Helado();
    }
    
    public Helado getModelo() {
        return modelo;
    }
    
    public String guarda() {
        try {
            dao.agrega(modelo);
            return "index?faces-redirect=true";
        } catch (Exception ex) {
            mensajes.procesa(ex);
            return null;
        }
    }
}
