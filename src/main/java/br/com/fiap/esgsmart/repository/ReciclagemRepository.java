package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.Reciclagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReciclagemRepository extends JpaRepository {

    List<Reciclagem> findByTipoDeMaterial(String tipoMaterial);

    List<Reciclagem> findByQuantidadeReciclada(double quantidade);

    List<Reciclagem> findByDataReciclagem(LocalDate data);

    void deleteById(Integer integer);
}
