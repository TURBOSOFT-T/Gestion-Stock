package com.gestion.gi.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCmdClt implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLigneCmdClt;
	
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient cmdClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	public LigneCmdClt() {
		
	}

	public Long getIdLigneCmdClt() {
		return idLigneCmdClt;
	}

	public void setIdLigneCmdClt(Long idLigneCmdClt) {
		this.idLigneCmdClt = idLigneCmdClt;
	}
	
	
	
	

}
