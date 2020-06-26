package ernadas.mokymai.menas;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MenininkaiRepository extends CrudRepository<Menininkai, Integer> {

	Optional<Menininkai> findById( Integer id );

}
