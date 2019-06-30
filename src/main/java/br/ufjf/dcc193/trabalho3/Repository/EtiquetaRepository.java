package br.ufjf.dcc193.trabalho3.Repository;

import br.ufjf.dcc193.trabalho3.models.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiquetaRepository extends JpaRepository<Etiqueta,Long> {
}
