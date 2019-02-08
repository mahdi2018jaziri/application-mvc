package com.application.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeClient implements Serializable {


@Id
@GeneratedValue
private Long idLigneCdeClt;
@ManyToOne
@JoinColumn(name="IdArticle")
private Article article;
@ManyToOne
@JoinColumn(name="idCommandeClient")
private CommandeClient commandeClient;

public Long getIdLigneCdeClt() {
	return idLigneCdeClt;
}

public void setIdLigneCdeClt(Long id) {
	this.idLigneCdeClt = id;
}

public Article getArticle() {
	return article;
}

public void setArticle(Article article) {
	this.article = article;
}

public CommandeClient getCommandeClient() {
	return commandeClient;
}

public void setCommandeClient(CommandeClient commandeClient) {
	this.commandeClient = commandeClient;
}



}
