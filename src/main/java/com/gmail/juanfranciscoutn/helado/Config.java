package com.gmail.juanfranciscoutn.helado;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.faces.annotation.FacesConfig;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Dependent
@FacesConfig
public class Config {
    @Produces
    @PersistenceContext
    EntityManager em;
}
