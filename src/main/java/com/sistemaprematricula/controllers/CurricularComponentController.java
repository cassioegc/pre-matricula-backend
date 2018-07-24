package com.sistemaprematricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.CurricularComponent;
import com.sistemaprematricula.services.CurricularComponentService;

@RestController
@RequestMapping(value="/curricularComponent")
@CrossOrigin(value="*")
public class CurricularComponentController {
	
	@Autowired
	CurricularComponentService curricularComponentService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public CurricularComponent save(@RequestBody CurricularComponent curricularComponent) {
		return this.curricularComponentService.save(curricularComponent);
	}
}
