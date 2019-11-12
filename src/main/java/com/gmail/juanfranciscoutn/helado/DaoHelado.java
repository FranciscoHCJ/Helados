package com.gmail.juanfranciscoutn.helado;

import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
@Dependent
public class DaoHelado {
    @Inject
    private EntityManager em;
    
    public List<Helado> consulta() {
        return em.createQuery("SELECT c FROM Helado c ORDER BY c.sabor", Helado.class).getResultList();
    }
    
    public Helado busca(Integer id) {
        return em.find(Helado.class, id);
    }
    
    public void agrega(Helado modelo) {
        em.persist(modelo);
    }
    
    public void modifica(Helado modelo) {
        em.persist(modelo);
    }
    
    public void elimina(Helado modelo) {
        final Helado anterior = em.find(Helado.class, modelo.getId());
        
        if (anterior != null) {
            em.remove(anterior);
        }
    }
}
