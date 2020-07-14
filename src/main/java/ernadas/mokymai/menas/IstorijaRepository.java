package ernadas.mokymai.menas;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

	public interface IstorijaRepository extends CrudRepository<Istorija, Integer> {
	
		@Query(value = "SELECT * FROM istorija WHERE id_kuriniai = ?1", nativeQuery = true)
		List<Istorija> findByIdKuriniai(Integer id );
	}
	

