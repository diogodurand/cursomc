package com.diogodurand.cursomc.domain.enums;

public enum Perfil {

	ADMIN(1, "ROLE_ADMIN"),
	CLIENTE(2, "ROLE_CLIENTE");
	
	private int cod;
	private String descricao;
	
	private Perfil(int pCod, String pDescricao) {
		
		this.cod = pCod;
		this.descricao = pDescricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum(Integer pCod) {
		if (pCod == null) {
			return null;
		}
		
		for (Perfil x : Perfil.values()) {
			if (pCod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + pCod);
	}
}
