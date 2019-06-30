package br.ufjf.dcc193.trabalho3.Repository;

import br.ufjf.dcc193.trabalho3.models.Anotacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {
}
