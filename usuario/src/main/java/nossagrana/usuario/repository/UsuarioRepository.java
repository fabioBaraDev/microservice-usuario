package nossagrana.usuario.repository;

import nossagrana.usuario.entity.Usuario;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

@Document
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    @Query("{ 'email' : { $regex: ?0 } }")
    Usuario findByEmail(String email);
}
