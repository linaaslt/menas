package ernadas.mokymai.menas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kuriniai {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private Integer kaina;
	private Integer id_menininkai;
	private Integer metai_sukurimo;
	private Integer id_laikytojai;
	private String rusis;
	private String pav;
	private String technika;
	
	public Kuriniai (String rusis, Integer kaina, Integer id_menininkai, Integer metai_sukurimo, Integer id_laikytojai, String pav, String technika ) {
		super();
		this.rusis = rusis;
		this.kaina = kaina;
		this.id_menininkai = id_menininkai;
		this.metai_sukurimo = metai_sukurimo;
		this.id_laikytojai = id_laikytojai;
		this.pav = pav;
		this.technika = technika;
		
	}
	
	public Kuriniai () {
		super();
	}
	
	public Integer getKaina() {
		return kaina;
	}
	public void setKaina(Integer kaina) {
		this.kaina = kaina;
	}
	public Integer getId_menininkai() {
		return id_menininkai;
	}
	public void setId_menininkai(Integer id_menininkai) {
		this.id_menininkai = id_menininkai;
	}
	public Integer getMetai_sukurimo() {
		return metai_sukurimo;
	}
	public void setMetai_sukurimo(Integer metai_sukurimo) {
		this.metai_sukurimo = metai_sukurimo;
	}
	public Integer getId_laikytojai() {
		return id_laikytojai;
	}
	public void setId_laikytojai(Integer id_laikytojai) {
		this.id_laikytojai = id_laikytojai;
	}
	public String getRusis() {
		return rusis;
	}
	public void setRusis(String rusis) {
		this.rusis = rusis;
	}
	public String getPav() {
		return pav;
	}
	public void setPav(String pav) {
		this.pav = pav;
	}
	public String getTechnika() {
		return technika;
	}
	public void setTechnika(String technika) {
		this.technika = technika;
	}
}
