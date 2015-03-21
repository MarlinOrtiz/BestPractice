package com.softtek.academia.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.academia.model.Input;
import com.softtek.academia.model.X;

public class BestPracticesTest extends BaseTest{
	
	@Autowired
	BestPracticeService bestPracticeService;
	Input i;
	X x; 
	
	public void inicio(){
		Input i = new Input();	
		;
		i.setX(x);
		i.setY(y);
		i.setZ(z);		
	}
	
	public void OperacionItest(){
		bestPracticeService.evalua(i);
		
	}
	
	

}
