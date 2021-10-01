package com.whnm.springmvcmixtohibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whnm.springmvcmixtohibernate.dao.CRUDDAO;
import com.whnm.springmvcmixtohibernate.dao.PersonaDAO;
import com.whnm.springmvcmixtohibernate.entity.Persona;
import com.whnm.springmvcmixtohibernate.service.PersonaService;

@Service
public class PersonaServiceImpl extends CRUDServiceImpl<Persona> implements PersonaService{
	
	@Autowired
	private PersonaDAO personaDAO;

	@Override
	public CRUDDAO<Persona> getDAO() {
		return personaDAO;
	}

}
