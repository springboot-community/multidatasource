package io.springboot.multidatasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.springboot.multidatasource.mapper1.Mapper1;
import io.springboot.multidatasource.mapper2.Mapper2;

@Service
public class TestService {
	
	@Autowired
	private Mapper1 mapper1;
	
	@Autowired
	private Mapper2 mapper2;
	
	@Transactional(readOnly = true)
	public String mapper1() {
		return this.mapper1.dataBaseName();
	}
	
	@Transactional(readOnly = true)
	public String mapper2() {
		return this.mapper2.dataBaseName();
	}
}
