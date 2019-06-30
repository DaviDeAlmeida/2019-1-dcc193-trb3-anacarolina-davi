package br.ufjf.dcc193.trabalho3.Repository;

import br.ufjf.dcc193.trabalho3.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
