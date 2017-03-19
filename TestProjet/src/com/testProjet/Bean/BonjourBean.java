package com.testProjet.Bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
//(name="bonjourBean")//nom par defaut 
@RequestScoped
public class BonjourBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String            nom ="nomParDefaut";

    public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }
}