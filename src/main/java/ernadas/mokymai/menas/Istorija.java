package ernadas.mokymai.menas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Istorija {

	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)

	 private Integer id;
	 private Integer id_kuriniai;
	 private Integer id_laikytojo;
	 private String data_nuo;
	 private Integer kaina;
	
	 public Istorija (Integer id_kuriniai, Integer id_laikytojo, String data_nuo, Integer kaina ) {
		 super() ;
		 this.id_kuriniai = id_kuriniai;
		 this.id_laikytojo = id_laikytojo;
		 this.data_nuo = data_nuo;
		 this.kaina = kaina;
	 }
	 
	public Istorija () {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_kuriniai() {
		return id_kuriniai;
	}

	public void setId_kuriniai(Integer id_kuriniai) {
		this.id_kuriniai = id_kuriniai;
	}

	public Integer getId_laikytojo() {
		return id_laikytojo;
	}

	public void setId_laikytojo(Integer id_laikytojo) {
		this.id_laikytojo = id_laikytojo;
	}
	public String getData_nuo() {
		return data_nuo;
	}

	public void setData_nuo(String data_nuo) {
		this.data_nuo = data_nuo;
	}

	public Integer getKaina() {
		return kaina;
	}

	public void setKaina(Integer kaina) {
		this.kaina = kaina;
	}
}
