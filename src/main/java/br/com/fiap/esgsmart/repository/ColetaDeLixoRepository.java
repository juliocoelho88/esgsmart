package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.ColetaDeLixo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ColetaDeLixoRepository extends JpaRepository<ColetaDeLixo, Long> {
    List<ColetaDeLixo> findByLocalizacao(String localizacao);

    List<ColetaDeLixo> findByStatus(String status);



}
