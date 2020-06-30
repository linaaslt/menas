package ernadas.mokymai.menas;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Kuriniai {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private String pav;	
	private String technika;
	private String rusis;
	private Integer metai_sukurimo;
	private Integer kaina;
	private Integer id_menininkai;
	private Integer id_laikytojai;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false,name="id_menininkai")
	private Menininkai menininkai;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable=false, updatable=false,name="id_laikytojai")
    private Laikytojai laikytojai;
	
	
	public Kuriniai ( Integer id, String pav, String technika, String rusis,  Integer metai_sukurimo, Integer kaina, Integer id_laikytojai, Integer id_menininkai) {
		super();
		this.id = id;
		this.pav = pav;
		this.technika = technika;
		this.rusis = rusis;
		this.metai_sukurimo = metai_sukurimo;
		this.kaina = kaina;
		this.id_laikytojai = id_laikytojai;
		this.id_menininkai = id_menininkai;
	}
	
	public Kuriniai () {
		super();
	}
	
	public Menininkai getMenininkai() {
		return menininkai;
	}

	public void setMenininkai(Menininkai menininkai) {
		this.menininkai = menininkai;
	}	
	
	public Laikytojai getLaikytojai() {
		return laikytojai;
	}

	public void setLaikytojai(Laikytojai laikytojai) {
		this.laikytojai = laikytojai;
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
