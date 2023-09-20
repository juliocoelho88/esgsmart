package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.Reciclagem;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.List;


public interface ReciclagemRepository extends JpaRepository<Reciclagem, Long> {

    List<Reciclagem> findByTipoMaterialAndDataReciclagem(String tipoMaterial, LocalDate dataReciclagem);

    List<Reciclagem> findByTipoMaterial(String tipoMaterial);

    List<Reciclagem> findByDataReciclagem(LocalDate dataReciclagem);
}
