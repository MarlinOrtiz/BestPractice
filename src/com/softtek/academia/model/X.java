package com.softtek.academia.model;

import java.util.ArrayList;
import java.util.List;

public enum X { 
	
	CERO(Output.I, Output.III), UNO(Output.III), DOS(Output.I), TRES(Output.I);
	
	private List<Output> valor = new ArrayList<Output>();
	
	private X(Output valor1, Output valor2){
		valor.add(valor1);
		valor.add(valor2);
	}
	private X(Output valor1){
		valor.add(valor1);
	}
	
	public List<Output> getValor() {
		return valor;
	}
	public void setValor(List<Output> valor) {
		this.valor = valor;
	}
	
	
}
