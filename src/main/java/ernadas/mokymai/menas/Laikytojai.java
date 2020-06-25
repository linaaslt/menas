package ernadas.mokymai.menas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laikytojai {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)

	 private int id;
	 private String kryptis_meno;
	 private String miestas;
	 private String pav;
	 private String valstybe;
	 
	 public Laikytojai (String pav, String miestas, String kryptis_meno, String valstybe) {
		 super();
		 this.pav = pav;
		 this.miestas = miestas;
		 this.kryptis_meno = kryptis_meno;
		 this.valstybe = valstybe;
	 }

	 @Override
	public String toString() {
		return "Laikytojai [id=" + id + ", kryptis_meno=" + kryptis_meno + ", miestas=" + miestas + ", pav=" + pav
				+ ", valstybe=" + valstybe + "]";
	}

	public Laikytojai () {
		 super();
	 }
	 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKryptis_meno() {
		return kryptis_meno;
	}

	public void setKryptis_meno(String kryptis_meno) {
		this.kryptis_meno = kryptis_meno;
	}

	public String getMiestas() {
		return miestas;
	}

	public void setMiestas(String miestas) {
		this.miestas = miestas;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String getValstybe() {
		return valstybe;
	}

	public void setValstybe(String valstybe) {
		this.valstybe = valstybe;
	}
}
