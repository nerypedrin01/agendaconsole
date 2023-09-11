package com.pedro.agendaconsole.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "PESSOA")
@Table(name = "PESSOA")
public class Pessoa {

	private Long codPessoa;
	private String nomeRazaoSocial;
	private String celular;

	public Pessoa(Long codPessoa, String nomeRazaoSocial, String celular) {

		this.codPessoa = codPessoa;
		this.nomeRazaoSocial = nomeRazaoSocial;
		this.celular = celular;
	}

	public Pessoa() {

	}

	@Id
	@Column(name = "COD_PESSOA")
	public Long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	@Column(name = "NOME_RAZAO_SOCIAL")
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	@Column(name = "CELULAR")
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "COD PESSOA = " + this.codPessoa + ", nome = " + nomeRazaoSocial + ", celular = " + celular;
	}
}
