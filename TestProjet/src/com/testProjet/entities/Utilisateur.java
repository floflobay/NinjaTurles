package com.testProjet.entities;

import java.sql.Timestamp;

public class Utilisateur {
	
    private String            nom ="nomParDefaut";
    private String            prenom ="prenomParDefaut";
    private String            adresseMail ="e-mailParDefaut";
    private String 			  naissance="JJ/MM/AAAA";		  
    private String 			  motDePasse="******";
    private Timestamp		  dateInscription;
    /* public Utilisateur(String n , String p , String m, String nai){
    	setNom(n);
    	setPrenom(p);
    	setAdresseMail(m);
    	setNaissance(nai);
    }*/
   /* public Utilisateur() {
		// TODO Auto-generated constructor stub
	}*/
	public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getNaissance() {
		return naissance;
	}

	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public void setDateInscription(Timestamp date) {
		// TODO Auto-generated method stub
		this.dateInscription = date;
	}
	public Timestamp getDateInscription( ) {
		// TODO Auto-generated method stub
		return this.dateInscription;
	}
}
