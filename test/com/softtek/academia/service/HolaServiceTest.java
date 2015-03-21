package com.softtek.academia.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class HolaServiceTest extends BaseTest {

	@Autowired
	private HolaService holaService;

	@Test
	public void prueba() {
		logger.debug(holaService.name());
	}

}
