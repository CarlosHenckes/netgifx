package br.com.netgifx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicialController {

	@RequestMapping("/")
	public String inicial(){
		return "index";
	}
}
