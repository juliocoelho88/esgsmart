package br.com.fiap.esgsmart.controller;

import br.com.fiap.esgsmart.model.Cidadao;
import br.com.fiap.esgsmart.model.Motorista;
import br.com.fiap.esgsmart.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("motorista")
public class MotoristaResource {
    @Autowired
    private MotoristaRepository motoristaRepository;

    @GetMapping
    public List<Motorista> listar(){
        return motoristaRepository.findAll();
    }

    @GetMapping("{codigo}")
    public Motorista buscar(@PathVariable long codigo){
        return motoristaRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Motorista cadastrar(@RequestBody Motorista motorista){
        return motoristaRepository.save(motorista);
    }

    @PutMapping("{id}")
    public Motorista atualizar(@RequestBody Motorista motorista, @PathVariable long id){
        motorista.setId(id);
        return motoristaRepository.save(motorista);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable long codigo){
        motoristaRepository.deleteById(codigo);
    }

    public List<Motorista> buscar(@RequestParam(required = false) String nome, @RequestParam(defaultValue = "false") boolean novo){
        return nome != null ? motoristaRepository.findByNomeAndNovo(nome, novo) : motoristaRepository.findByNovo(novo);
    }
}
