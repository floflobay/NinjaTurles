package com.testProjet.Bean;
import java.io.Serializable;
//import java.util.Date;
import java.sql.Timestamp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.testProjet.entities.Utilisateur;

@ManagedBean
//(name="bonjourBean")//nom par defaut 
@RequestScoped
public class creerCompteBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Utilisateur user;
    public creerCompteBean(){
    	user = new Utilisateur();
    	initialiserDateInscription();
    }
    public Utilisateur getUser() {
		return user;
	}
	private void initialiserDateInscription() {
        Timestamp date = new Timestamp( System.currentTimeMillis() );
        user.setDateInscription( date );
    }
    
}