package com.diogodurand.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int pCod, String pDescricao) {
		
		this.cod = pCod;
		this.descricao = pDescricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer pCod) {
		if (pCod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (pCod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + pCod);
	}
}
