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

import br.com.fiap.esgsmart.model.DispositivoIoT;
import br.com.fiap.esgsmart.repository.DispositivoIotRepository;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoIotResource {
    
    @Autowired
    private DispositivoIotRepository dispositivoIotRepository;

    @GetMapping
    public List<DispositivoIoT> listar(){
        return dispositivoIotRepository.findAll();
    }

    @GetMapping("{codigo}")
    public DispositivoIoT buscar(@PathVariable long codigo){
        return dispositivoIotRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public DispositivoIoT cadastrar(@RequestBody DispositivoIoT dispositivoIoT){
        return dispositivoIotRepository.save(dispositivoIoT);
    }

    @PutMapping("{id}")
    public DispositivoIoT atualizar(@RequestBody DispositivoIoT dispositivoIoT, @PathVariable long id){
        dispositivoIoT.setId(id);
        return dispositivoIotRepository.save(dispositivoIoT);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable long codigo){
        dispositivoIotRepository.deleteById(codigo);
    }

    public List<DispositivoIoT> buscar(@RequestParam(required = false) String localizacao, @RequestParam(defaultValue = "false") String dataInstalacao){
        return localizacao != null ? dispositivoIotRepository.findByLocalizacao(localizacao) : dispositivoIotRepository.findByDataInstalacao(dataInstalacao);
    }
}
