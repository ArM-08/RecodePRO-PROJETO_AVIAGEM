package br.com.aviagem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.aviagem.modelo.Destino;
import br.com.aviagem.repository.DestinoRepository;

@Controller
@RequestMapping("/destino")
public class DestinoController {

	@Autowired
    private DestinoRepository destinoRepository;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("destino/listar.html");

        List<Destino> destinos = destinoRepository.findAll();
        modelAndView.addObject("destino", destinos);

        return modelAndView;
    }
    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("destino/cadastro");

        modelAndView.addObject("destino", new Destino());

        return modelAndView;
    }
    @PostMapping("/cadastrar")
    public ModelAndView cadastrar(Destino destinos) {
        
        
        ModelAndView modelAndView = new ModelAndView("redirect:/destino");
    
        destinoRepository.save(destinos);

        return modelAndView;
    }
    @GetMapping("/{id}/excluir")
    public ModelAndView excluir(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/destino");

        destinoRepository.deleteById(id);

        return modelAndView;
}
    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("destino/edicao");

        Destino destinos = destinoRepository.getOne(id);
        modelAndView.addObject("destino", destinos);

        return modelAndView;
    }
    @PostMapping("/{id}/editar")
    public ModelAndView editar(Destino destinos) {
        

        ModelAndView modelAndView = new ModelAndView("redirect:/destino");

        destinoRepository.save(destinos);

        return modelAndView;
    }
}
