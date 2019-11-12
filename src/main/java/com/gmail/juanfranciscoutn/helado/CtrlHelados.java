package com.gmail.juanfranciscoutn.helado;

import com.gmail.juanfranciscoutn.web.Mensajes;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Named
@RequestScoped
public class CtrlHelados {
    @Inject
    private Mensajes mensajes;
    @Inject 
    private DaoHelado dao;
    private List<Helado> instancias;
    
    @PostConstruct
    void init() {
        try {
            instancias = dao.consulta();
        } catch (Exception ex) {
            mensajes.procesa(ex);
        }
    }
    
    public List<Helado> getInstancias() {
        return instancias;
    }
}
