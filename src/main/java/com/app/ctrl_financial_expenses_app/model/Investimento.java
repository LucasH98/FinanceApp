package com.app.ctrl_financial_expenses_app.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Investimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String nomeFundoInvestimento;
	private String descricao;
	private Double valorInvestido;
	private Double taxa;
	private LocalDate DataInvestimento;
	private LocalDate DataResgate;

	public Investimento() {

	}

	public Investimento(Long id, String nomeFundoInvestimento, String descricao, Double valorInvestido, Double taxa,
			LocalDate dataInvestimento, LocalDate dataResgate) {

		this.id = id;
		this.nomeFundoInvestimento = nomeFundoInvestimento;
		this.descricao = descricao;
		this.valorInvestido = valorInvestido;
		this.taxa = taxa;
		DataInvestimento = dataInvestimento;
		DataResgate = dataResgate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFundoInvestimento() {
		return nomeFundoInvestimento;
	}

	public void setNomeFundoInvestimento(String nomeFundoInvestimento) {
		this.nomeFundoInvestimento = nomeFundoInvestimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(Double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public LocalDate getDataInvestimento() {
		return DataInvestimento;
	}

	public void setDataInvestimento(LocalDate dataInvestimento) {
		DataInvestimento = dataInvestimento;
	}

	public LocalDate getDataResgate() {
		return DataResgate;
	}

	public void setDataResgate(LocalDate dataResgate) {
		DataResgate = dataResgate;
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
		Investimento other = (Investimento) obj;
		return Objects.equals(id, other.id);
	}

}
