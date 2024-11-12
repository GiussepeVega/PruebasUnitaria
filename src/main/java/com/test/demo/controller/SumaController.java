package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumaController {
	@PostMapping("/resultado")
	public String sumar(@RequestParam("num1") double num1, @RequestParam("num2") double num2, Model model) {
	    double resultado = num1 + num2;
	    System.out.println("Resultado calculado: " + resultado);
	    model.addAttribute("resultado", resultado);
	    return "resultado";
	}
}
