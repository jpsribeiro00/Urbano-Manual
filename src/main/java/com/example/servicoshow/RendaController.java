package com.example.servicoshow;

import Models.Renda;
import Servicos.RendaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/renda")
public class RendaController {

    private final RendaServico rendaServico;

    @Autowired
    public RendaController(RendaServico rendaServico) {
        this.rendaServico = rendaServico;
    }

    @GetMapping()
    List<Renda> listAll(){
        return rendaServico.findAll();
    }

    @GetMapping("/{id}")
    Optional<Renda> listById(@PathVariable Long id){
        return rendaServico.findById(id);
    }

    @PostMapping()
    Renda create(@RequestBody Renda renda){
        return rendaServico.save(renda);
    }

    @PutMapping("/{id}")
    Renda update(@RequestBody Renda renda, @PathVariable Long id){
        return rendaServico.update(renda, id);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        rendaServico.delete(id);
    }

}
