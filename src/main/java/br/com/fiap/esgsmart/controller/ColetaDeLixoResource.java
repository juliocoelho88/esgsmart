package br.com.fiap.esgsmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.esgsmart.model.ColetaDeLixo;
import br.com.fiap.esgsmart.repository.ColetaDeLixoRepository;

@RestController
@RequestMapping("/coleta")
public class ColetaDeLixoResource {
    
    @Autowired
    private ColetaDeLixoRepository coletaDeLixoRepository;

    @GetMapping
    public List<ColetaDeLixo> listar(){
        return coletaDeLixoRepository.findAll();
    }

    @GetMapping("{codigo}")
    public ColetaDeLixo buscar(@PathVariable long codigo){
        return coletaDeLixoRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ColetaDeLixo cadastrar(@RequestBody ColetaDeLixo coletaDeLixo){
        return coletaDeLixoRepository.save(coletaDeLixo);
    }

    @PutMapping("{id}")
    public ColetaDeLixo atualizar(@RequestBody ColetaDeLixo coletaDeLixo, @PathVariable long id){
        coletaDeLixo.setId(id);
        return coletaDeLixoRepository.save(coletaDeLixo);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable long codigo){
        coletaDeLixoRepository.deleteById(codigo);
    }

    public List<ColetaDeLixo> buscar(@RequestParam(required = false) String localizacao, @RequestParam(defaultValue = "false") String status){
        return localizacao != null ? coletaDeLixoRepository.findByLocalizacao(localizacao) : coletaDeLixoRepository.findByStatus(status);
    }
}
