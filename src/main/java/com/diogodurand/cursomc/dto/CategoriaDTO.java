package com.diogodurand.cursomc.dto;

import java.io.Serializable;

import com.diogodurand.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	
	public CategoriaDTO() {
	}
	
	public CategoriaDTO(Categoria obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer pId) {
		id = pId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String pNome) {
		nome = pNome;
	}
	
	

}
