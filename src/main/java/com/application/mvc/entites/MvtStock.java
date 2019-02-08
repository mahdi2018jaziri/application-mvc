package com.application.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class MvtStock implements Serializable

{ public static final int ENTREE=1;
  public static final int SORTIE=2;

	@Id
	@GeneratedValue
	private Long idMvtStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	private BigDecimal quantite;
	private int typeMvt;

	@ManyToOne
	@JoinColumn(name="IdArticle")
	private Article article;

	public Long getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(Long id) {
		this.idMvtStock = id;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
}
