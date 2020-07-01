package ernadas.mokymai.menas;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LaikytojaiRepository extends CrudRepository<Laikytojai, Integer> {

//	@Query(value = "SELECT * FROM laikytojai WHERE 1", nativeQuery = true)
//	List<Laikytojai> findByIdLaikytojai(Integer id );
//	Optional<Laikytojai> findById( Integer id );
}