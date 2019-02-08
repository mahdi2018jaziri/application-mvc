package com.application.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {

	
	@Id
	@GeneratedValue
	private Long idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String photo;
	private String mail;
	
	

	@OneToMany(mappedBy="client")
private List<CommandeClient> commandeclients;
	public Client() {
		super();
		
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long id) {
		this.idClient = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<CommandeClient> getCommandeclients() {
		return commandeclients;
	}

	public void setCommandeclients(List<CommandeClient> commandeclients) {
		this.commandeclients = commandeclients;
	}
	
}
