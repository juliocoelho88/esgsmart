package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadaoRepository extends JpaRepository<Cidadao, Integer> {

    List<Cidadao> findByNome(String cidadao);

    List<Cidadao> findByNovo(boolean novo);

    List<Cidadao> findByNomeAndNovo(String cidadao, boolean novo);

    List<Cidadao> findByEndereco(String endereco);

}
