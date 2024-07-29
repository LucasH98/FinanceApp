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
	private Operacao valorOperacao;
	private LocalDate dataInvestimento;
	private LocalDate dataResgate;
	private Double valorResgateDouble;

	public Investimento() {

	}

	
	public Investimento(Long id, String nomeFundoInvestimento, String descricao, Double valorInvestido,
			Operacao valorOperacao, LocalDate dataInvestimento, LocalDate dataResgate, Double valorResgateDouble) {
		
		this.id = id;
		this.nomeFundoInvestimento = nomeFundoInvestimento;
		this.descricao = descricao;
		this.valorInvestido = valorInvestido;
		this.valorOperacao = valorOperacao;
		this.dataInvestimento = dataInvestimento;
		this.dataResgate = dataResgate;
		this.valorResgateDouble = valorResgateDouble;
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

	public Operacao getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(Operacao valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public LocalDate getDataInvestimento() {
		return dataInvestimento;
	}

	public void setDataInvestimento(LocalDate dataInvestimento) {
		this.dataInvestimento = dataInvestimento;
	}

	public LocalDate getDataResgate() {
		return dataResgate;
	}

	public void setDataResgate(LocalDate dataResgate) {
		this.dataResgate = dataResgate;
	}

	public Double getValorResgateDouble() {
		return valorResgateDouble;
	}

	public void setValorResgateDouble(Double valorResgateDouble) {
		this.valorResgateDouble = valorResgateDouble;
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
