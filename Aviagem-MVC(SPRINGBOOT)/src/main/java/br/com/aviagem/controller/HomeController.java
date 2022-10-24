package br.com.aviagem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        
        return "home";
    }
    @GetMapping("/destinos")
    public String destinos() {
        
        return "destinos";
    }
    @GetMapping("/promoçoes")
    public String promocoes() {
        
        return "promoçoes";
    }
    @GetMapping("/contato")
    public String contato() {
        
        return "contato";
    }
}



