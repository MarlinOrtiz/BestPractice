package com.softtek.academia.model;

import java.util.ArrayList;
import java.util.List;

public enum Y {
	
	A(Output.II, Output.I), B(Output.I), C(Output.II);
	
	private List<Output> valor = new ArrayList<Output>();
	
	private Y(Output valor1, Output valor2){
		valor.add(valor1);
		valor.add(valor2);
	}
	
	private Y(Output valor1){
		valor.add(valor1);
	}

	public List<Output> getValor() {
		return valor;
	}

	public void setValor(List<Output> valor) {
		this.valor = valor;
	}
	
	

}
