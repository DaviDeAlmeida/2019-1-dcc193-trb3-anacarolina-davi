package br.ufjf.dcc193.trabalho3.Repository;

import br.ufjf.dcc193.trabalho3.models.Vinculo;
import br.ufjf.dcc193.trabalho3.models.Item;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinculoRepository extends JpaRepository<Vinculo, Long> {

    List<Vinculo> findByItemOrigem(Item item);
}
