package com.softtek.academia.model;

import java.util.ArrayList;
import java.util.List;

public enum Z {
	
	ALPHA(Output.II), BETA(Output.III);
	
	private List<Output> valor = new ArrayList<Output>();

	private Z(Output valor1){
		valor.add(valor1);
	}
	public List<Output> getValor() {
		return valor;
	}
	public void setValor(List<Output> valor) {
		this.valor = valor;
	}
	
	

}
