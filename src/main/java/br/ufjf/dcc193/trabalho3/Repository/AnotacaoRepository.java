package br.ufjf.dcc193.trabalho3.Repository;

import br.ufjf.dcc193.trabalho3.models.Anotacao;
import br.ufjf.dcc193.trabalho3.models.Item;
import br.ufjf.dcc193.trabalho3.models.Vinculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {
    
    List<Anotacao> findByItem(Item item);
    
    List<Anotacao> findByVinculo(Vinculo vinculo);
}
