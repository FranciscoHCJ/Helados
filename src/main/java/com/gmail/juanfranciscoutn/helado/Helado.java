package com.gmail.juanfranciscoutn.helado;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "HELADO")
public class Helado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HEL_ID")
    private Integer id;
    
    @NotNull
    @Size(min = 4, max = 255)
    @Column(name = "HEL_SABOR")
    private String sabor;
    
    @NotNull
    @Size(min = 4, max = 255)
    @Column(name = "HEL_COLOR")
    private String color;
    
    @NotNull
    @Size(min = 5, max = 255)
    @Column(name = "HEL_TIPO_SABOR")
    private String tipoSabor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoSabor() {
        return tipoSabor;
    }

    public void setTipoSabor(String tipoSabor) {
        this.tipoSabor = tipoSabor;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Helado)) {
            return false;
        }
        Helado other = (Helado) object;
        if((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.gmail.juanfranciscoutn.Helado[ id =" + id + " ]";
    }
}
