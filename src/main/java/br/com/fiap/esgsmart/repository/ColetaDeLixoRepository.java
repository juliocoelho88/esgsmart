package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.ColetaDeLixo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColetaDeLixoRepository extends JpaRepository<ColetaDeLixo, Integer> {
    List<ColetaDeLixo> findByLocalizacao(String localizacao);



}
