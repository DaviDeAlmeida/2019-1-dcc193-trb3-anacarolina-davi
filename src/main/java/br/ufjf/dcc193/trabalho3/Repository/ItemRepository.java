package br.ufjf.dcc193.trabalho3.Repository;

import br.ufjf.dcc193.trabalho3.models.Item;
import br.ufjf.dcc193.trabalho3.models.Etiqueta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByEtiquetas(Etiqueta etiqueta);
}
