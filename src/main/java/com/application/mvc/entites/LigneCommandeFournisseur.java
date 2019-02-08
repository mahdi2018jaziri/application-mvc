package com.application.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable {

	
	public Long getIdLigneCmdFs() {
		return idLigneCmdFs;
	}

	public void setIdLigneCmdFs(Long id) {
		this.idLigneCmdFs = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	@Id
	@GeneratedValue
	private Long idLigneCmdFs;
	
	
	@ManyToOne
	@JoinColumn(name=" IdArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
}
