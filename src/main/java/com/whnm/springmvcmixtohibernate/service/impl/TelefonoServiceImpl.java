package com.whnm.springmvcmixtohibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whnm.springmvcmixtohibernate.dao.CRUDDAO;
import com.whnm.springmvcmixtohibernate.dao.TelefonoDAO;
import com.whnm.springmvcmixtohibernate.entity.Telefono;
import com.whnm.springmvcmixtohibernate.service.TelefonoService;

@Service
public class TelefonoServiceImpl extends CRUDServiceImpl<Telefono> implements TelefonoService{
	
	@Autowired
	private TelefonoDAO telefonoDAO;

	@Override
	public CRUDDAO<Telefono> getDAO() {
		return telefonoDAO;
	}
		
}
