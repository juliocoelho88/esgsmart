package br.com.fiap.esgsmart.controller;

import br.com.fiap.esgsmart.model.Reciclagem;
import br.com.fiap.esgsmart.repository.ReciclagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("reciclagem")
public class ReciclagemResource {
    @Autowired
    private ReciclagemRepository reciclagemRepository;

    @GetMapping
    public List<Reciclagem> listar(){
        return reciclagemRepository.findAll();
    }

    @GetMapping("{codigo}")
    public Reciclagem buscar(@PathVariable long codigo){
        return reciclagemRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Reciclagem cadastrar(@RequestBody Reciclagem reciclagem){
        return reciclagemRepository.save(reciclagem);
    }

    @PutMapping("{id}")
    public Reciclagem atualizar(@RequestBody Reciclagem reciclagem, @PathVariable long id){
        reciclagem.setId(id);
        return reciclagemRepository.save(reciclagem);    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable long codigo){
        reciclagemRepository.deleteById(codigo);
    }
    @GetMapping("/buscar")
    public List<Reciclagem> buscarReciclagemPorParametros(@RequestParam(required = false) String tipoMaterial, @RequestParam(defaultValue = "false") LocalDate dataReciclagem){
        if (tipoMaterial != null && dataReciclagem != null) {
            return reciclagemRepository.findByTipoMaterialAndDataReciclagem(tipoMaterial, dataReciclagem);
        } else if (tipoMaterial != null) {
            return reciclagemRepository.findByTipoMaterial(tipoMaterial);
        } else if (dataReciclagem != null) {
            return reciclagemRepository.findByDataReciclagem(dataReciclagem);
        } else {
            return Collections.emptyList();
        }
    }



}
