package com.diogodurand.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.diogodurand.cursomc.services.validation.ClienteInsert;


@ClienteInsert
public class ClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	@NotEmpty(message="Preenchimento Obrigatório!")
	@Length(min=5 , max=120, message = "O tamanho deve ser entre 5 e 120 caracteres!")
	private String nome;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	private String cpfOuCnpj;
	private Integer tipo;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	private String senha;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	private String logradouro;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	private String numero;
	
	private String complemento;
	private String bairro;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	private String cep;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	private String telefone1;
	private String telefone2;
	private String telefone3;
	
	private Integer cidadeId;
	
	
	public ClienteNewDTO() {
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String pNome) {
		nome = pNome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String pEmail) {
		email = pEmail;
	}


	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}


	public void setCpfOuCnpj(String pCpfOuCnpj) {
		cpfOuCnpj = pCpfOuCnpj;
	}


	public Integer getTipo() {
		return tipo;
	}


	public void setTipo(Integer pTipo) {
		tipo = pTipo;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String pLogradouro) {
		logradouro = pLogradouro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String pNumero) {
		numero = pNumero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String pComplemento) {
		complemento = pComplemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String pBairro) {
		bairro = pBairro;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String pCep) {
		cep = pCep;
	}


	public String getTelefone1() {
		return telefone1;
	}


	public void setTelefone1(String pTelefone1) {
		telefone1 = pTelefone1;
	}


	public String getTelefone2() {
		return telefone2;
	}


	public void setTelefone2(String pTelefone2) {
		telefone2 = pTelefone2;
	}


	public String getTelefone3() {
		return telefone3;
	}


	public void setTelefone3(String pTelefone3) {
		telefone3 = pTelefone3;
	}


	public Integer getCidadeId() {
		return cidadeId;
	}


	public void setCidadeId(Integer pCidadeId) {
		cidadeId = pCidadeId;
	}
	
}
