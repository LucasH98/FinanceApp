package com.app.ctrl_financial_expenses_app.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String nomeCompra;
	private Double preco;
	private LocalDate dataCompra;
	private boolean ehParcelado;
	private Situacao situacao;

	public Compra() {

	}

	public Compra(Long id, String nomeCompra, Double preco, LocalDate dataCompra, boolean ehParcelado,
			Situacao situacao) {

		this.id = id;
		this.nomeCompra = nomeCompra;
		this.preco = preco;
		this.dataCompra = dataCompra;
		this.ehParcelado = ehParcelado;
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}

	public String getNomeCompra() {
		return nomeCompra;
	}

	public void setNomeCompra(String nomeCompra) {
		this.nomeCompra = nomeCompra;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public boolean isEhParcelado() {
		return ehParcelado;
	}

	public void setEhParcelado(boolean ehParcelado) {
		this.ehParcelado = ehParcelado;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
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
		Compra other = (Compra) obj;
		return Objects.equals(id, other.id);
	}

}
