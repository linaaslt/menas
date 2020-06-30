package ernadas.mokymai.menas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menininkai {

	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String pav;    
    
    private String metai_gimimo;
    
    private String tautybe;
    
    private String apras;

	public Menininkai(Integer id, String pav, String metai_gimimo, String tautybe, String apras) {
		super();
		this.id = id;
		this.pav = pav;
		this.metai_gimimo = metai_gimimo;
		this.tautybe = tautybe;
		this.apras = apras;
	}
 
	public Menininkai() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String getMetaiGimimo() {
		
		return metai_gimimo;
	}

	public void setMetaiGimimo(String metai_gimimo) {
		this.metai_gimimo = metai_gimimo;
	}

	public String getTautybe() {
		return tautybe;
	}

	public void setTautybe(String tautybe) {
		this.tautybe = tautybe;
	}

	public String getApras() {
		return apras;
	}

	public void setApras(String apras) {
		this.apras = apras;
	}	
    
}
