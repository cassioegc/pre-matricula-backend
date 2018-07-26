package com.sistemaprematricula.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.CurricularComponent;
import com.sistemaprematricula.services.CurricularComponentService;

@RestController
@RequestMapping(value = "/curricularComponent")
@CrossOrigin(value = "*")
public class CurricularComponentController {

	@Autowired
	CurricularComponentService curricularComponentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<CurricularComponent> getAll() {
		return this.curricularComponentService.getAll();

	}
	
	@Transactional
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public CurricularComponent save(@RequestBody CurricularComponent curricularComponent) {
		return this.curricularComponentService.save(curricularComponent);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public CurricularComponent getCurricularComponent(@PathVariable Long code) {
		return this.curricularComponentService.getCurricularComponent(code).get();
	}

	@RequestMapping(value = "/delete{id}", method = RequestMethod.DELETE)
	public void deleteCurricularComponent(@PathVariable Long id) {
		this.curricularComponentService.deleteCurricularComponent(id);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updateCurricularComponent(@PathVariable Long id,
			@RequestBody CurricularComponent curricularComponent) {
		this.curricularComponentService.updateCurricularComponent(id, curricularComponent);
	}
}