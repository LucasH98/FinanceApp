package com.app.ctrl_financial_expenses_app.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ganho implements Serializable{

private static final long serialVersionUID = 1L;

@Id	
private Long id;	
private String nome;
private String descricao;
private Double valor ;

public Ganho() {
	
}

public Ganho(Long id, String nome, String descricao, Double valor) {
	
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	this.valor = valor;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ganho other = (Ganho) obj;
	return Objects.equals(id, other.id);
}


	
}
