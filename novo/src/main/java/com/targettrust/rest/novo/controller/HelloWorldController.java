package com.targettrust.rest.novo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/MundoDiferente")
	public String meuHelloWorld() {
		return "Olá Mundo";

	}

	@GetMapping(path = {"/algoDiferente-obj/{var}"})
	public HelloWorld meuHelloWorldObj(@RequestParam("p") String p, @PathVariable String var) {
		HelloWorld hw = new HelloWorld();
		hw.setMensagem(p);
		hw.setValor(500.0);
		return hw;

	}
}
