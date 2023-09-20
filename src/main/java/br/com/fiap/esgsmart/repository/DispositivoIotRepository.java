package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.DispositivoIoT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DispositivoIotRepository extends JpaRepository<DispositivoIoT,Long> {


    List<DispositivoIoT> findByLocalizacao(String localizacao);

    List<DispositivoIoT> findByDataInstalacao(String dataInstalacao);


}
