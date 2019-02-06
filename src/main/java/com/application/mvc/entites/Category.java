package com.application.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category implements Serializable {

@Id
@GeneratedValue
private Long id;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
}
