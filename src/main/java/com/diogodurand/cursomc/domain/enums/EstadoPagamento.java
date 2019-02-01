package com.diogodurand.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int pCod, String pDescricao) {
		
		this.cod = pCod;
		this.descricao = pDescricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer pCod) {
		if (pCod == null) {
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (pCod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + pCod);
	}
}
