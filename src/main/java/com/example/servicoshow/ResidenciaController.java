package com.example.servicoshow;

import Models.Residencia;
import Servicos.ResidenciaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/residencia")
public class ResidenciaController {

    private final ResidenciaServico residenciaServico;

    @Autowired
    public ResidenciaController(ResidenciaServico residenciaServico) {
        this.residenciaServico = residenciaServico;
    }

    @GetMapping()
    List<Residencia> listAll(){
        return residenciaServico.findAll();
    }

    @GetMapping("/{id}")
    Optional<Residencia> listById(@PathVariable Long id){
        return residenciaServico.findById(id);
    }

    @PostMapping()
    Residencia create(@RequestBody Residencia residencia){
        return residenciaServico.save(residencia);
    }

    @PutMapping("/{id}")
    Residencia update(@RequestBody Residencia residencia, @PathVariable Long id){
        return residenciaServico.update(residencia, id);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        residenciaServico.delete(id);
    }

}
