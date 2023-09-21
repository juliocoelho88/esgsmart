package br.com.fiap.esgsmart.controller;

import br.com.fiap.esgsmart.model.Motorista;
import br.com.fiap.esgsmart.model.VeiculoColeta;
import br.com.fiap.esgsmart.repository.VeiculoColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veiculo")
public class VeiculoColetaResource {
    @Autowired
    private VeiculoColetaRepository veiculoColetaRepository;

    @GetMapping
    public List<VeiculoColeta> listar(){
        return veiculoColetaRepository.findAll();
    }

    @GetMapping("{codigo}")
    public VeiculoColeta buscar(@PathVariable long codigo){
        return veiculoColetaRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public VeiculoColeta cadastrar(@RequestBody VeiculoColeta veiculoColeta){
        return veiculoColetaRepository.save(veiculoColeta);
    }

    @PutMapping("{id}")
    public VeiculoColeta atualizar(@RequestBody VeiculoColeta veiculoColeta, @PathVariable long id){
        veiculoColeta.setId(id);
        return veiculoColetaRepository.save(veiculoColeta);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable long codigo){
        veiculoColetaRepository.deleteById(codigo);
    }

}
