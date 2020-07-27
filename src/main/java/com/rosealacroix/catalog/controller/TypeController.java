package com.rosealacroix.catalog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.service.TypeService;

@Controller
public class TypeController {
	
	@Autowired
	private TypeService typeService;

	@GetMapping(path="/typelist")
	public String getAll(Model model) {
		List<Type> types = typeService.getAll();
		model.addAttribute("types", types);
		return "typelist";
	}
	
	@GetMapping(path="/typeadd")
	public String displayForm(Model model, Type type) {
		return "typeadd";
	}
	
	@PostMapping(path="/typeadd")
	public String submitType(@Valid Type type, BindingResult result) {
		if(result.hasErrors()) {
			return "typeadd";
		}
		typeService.create(type);
		return "redirect:/typelist";
	}

}
