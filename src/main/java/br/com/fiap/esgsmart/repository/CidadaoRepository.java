package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {

    List<Cidadao> findByNome(String cidadao);

    List<Cidadao> findByNovo(boolean novo);

    List<Cidadao> findByNomeAndNovo(String cidadao, boolean novo);

    List<Cidadao> findByEndereco(String endereco);

}
