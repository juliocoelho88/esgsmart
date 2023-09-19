package br.com.fiap.esgsmart.controller;

import br.com.fiap.esgsmart.model.Cidadao;
import br.com.fiap.esgsmart.repository.CidadaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cidadao")
public class CidadaoResource {
    @Autowired
    private CidadaoRepository cidadaoRepository;

    @GetMapping
    public List<Cidadao> listar(){
        return cidadaoRepository.findAll();
    }
    @GetMapping("{codigo}")
    public Cidadao buscar(@PathVariable int codigo){
        return cidadaoRepository.findById(codigo).get();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Cidadao cadastrar(@RequestBody Cidadao cidadao){
        return cidadaoRepository.save(cidadao);
    }
    @PutMapping("{id}")
    public Cidadao atualizar(@RequestBody Cidadao cidadao, @PathVariable long id){
        cidadao.setId(id);
        return cidadaoRepository.save(cidadao);
    }

    public void remover(@PathVariable int codigo){
        cidadaoRepository.deleteById(codigo);
    }


}
