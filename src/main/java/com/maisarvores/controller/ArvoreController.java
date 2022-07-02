package com.maisarvores.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maisarvores.model.Arvore;
import com.maisarvores.repository.ArvoreRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/arvores")
@AllArgsConstructor
public class ArvoreController {
	
	private final ArvoreRepository arvoreRepository;
	
	@GetMapping
	public @ResponseBody List<Arvore> list() {
		return arvoreRepository.findAll();
	}
}
