package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.Cidadao;
import br.com.fiap.esgsmart.model.Motorista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {


    List<Motorista> findByNovo(boolean novo);

    List<Motorista> findByNomeAndNovo(String cidadao, boolean novo);

    List<Motorista> findByNome(String nome);


}
