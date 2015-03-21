package com.softtek.academia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.academia.model.Input;
import com.softtek.academia.model.Output;
import com.softtek.academia.model.X;
import com.softtek.academia.model.Y;
import com.softtek.academia.model.Z;
import com.softtek.academia.service.BestPracticeService;

@Service
public class OperacionIServiceImpl implements BestPracticeService {

	@Override
	public Output evalua(Input i) {
		X x = i.getX();
		Y y = i.getY();
		Z z = i.getZ();
		
		List<Output> valorX = x.getValor();
		List<Output> valorY = y.getValor();
		List<Output> valorZ = z.getValor();
		
		for(int k =0; k < valorX.size(); k++)
			for(int j=0; j< valorY.size();j++)
				if(valorX.get(k).equals(valorY.get(j)))
					return valorY.get(j);
		
		for(int k=0; k< valorY.size(); k++)
			for(int j=0; j<valorZ.size(); j++)
				if(valorY.get(j).equals(valorZ.get(j)))
					return valorZ.get(j);
		
		return Output.Invalido;
	}

	/*@Override
	public Output evalua(Input i) {
		if(!i.equals(null)){
			if( (i.equals(X.Dos) || i.equals(X.Cero) ) && i.equals(Y.letraB))
				return Output.I;
			else
				if( ( i.equals(X.Dos) || i.equals(X.Tres) || i.equals(X.Cero) ) && i.equals(Y.letraA) )
					return Output.I;
		}
		return Output.Invalido;
	}*/
}