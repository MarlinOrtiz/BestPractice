package com.softtek.academia.service.impl;

import org.springframework.stereotype.Service;

import com.softtek.academia.service.HolaService;

@Service("holaService")
public class HolaServiceImpl implements HolaService {

	public String name() {
		return "Espero ya funcione";
	}
}
