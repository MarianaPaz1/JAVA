package com.gen.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public List<String> listaBsm() {
//		Criando os objetos
		String comunicacao = new String ("Comunicação");
		String resp = new String ("Responsabilidade Pessoal");
		String equipe = new String ("Trabalho em equipe");
		String mentalidade = new String ("Mentalidade de crescimento");
		String proatividade = new String ("Mentalidade de crescimento");
//		Criando as listas do tipo String
		List<String> listandoBSMs = new ArrayList<>();
		listandoBSMs.add(comunicacao);
		listandoBSMs.add(resp);
		listandoBSMs.add(equipe);
		listandoBSMs.add(mentalidade);
		listandoBSMs.add(proatividade);
		return listandoBSMs;
	}

	@GetMapping("/Obj")
	public List<String> Obj(){
	String emprego = new String ("Arrumar um emprego em uma multinacional");
	String intercambio = new String("Realizar um intercambio em 2024");
	String relacionamento = new String ("Melhorar meu relacionamento interpessoal");
	List <String> listandoObj = new ArrayList<>();
	listandoObj.add(relacionamento);
	listandoObj.add(emprego);
	listandoObj.add(intercambio);
	return listandoObj;
	}
	}

