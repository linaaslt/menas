package ernadas.mokymai.menas;

import java.util.List;

// import javax.persistence.EntityManager;
// import javax.persistence.EntityManagerFactory;

// import org.hibernate.query.Query;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 
public interface KuriniaiRepository extends CrudRepository<Kuriniai, Integer> {
	
	@Query(value = "SELECT * FROM kuriniai WHERE id_menininkai = ?1", nativeQuery = true)
	List<Kuriniai> findByIdMenininkai(Integer id ); //, EntityManagerFactory emf) {
		
//	      EntityManager em = emf.createEntityManager();
//	      Query qw = (Query) em.createQuery("SELECT e FROM kuriniai e WHERE e.id_menininkai = ?1");
//	      qw.setParameter(1, id);
//	      List<Kuriniai> list = qw.getResultList();

//	      em.close();
//		return list;
//	}

}
