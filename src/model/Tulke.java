package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TULKE database table.
 * 
 */
@Entity
@Table(name="TULKE")
@NamedQuery(name="Tulke.findAll", query="SELECT t FROM Tulke t")
public class Tulke implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ulkeAd;
	private String ulkeKod;
	private String ulkeKod2;

	public Tulke() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ULKE_AD", nullable=false, length=50)
	public String getUlkeAd() {
		return this.ulkeAd;
	}

	public void setUlkeAd(String ulkeAd) {
		this.ulkeAd = ulkeAd;
	}


	@Column(name="ULKE_KOD", nullable=false, length=3)
	public String getUlkeKod() {
		return this.ulkeKod;
	}

	public void setUlkeKod(String ulkeKod) {
		this.ulkeKod = ulkeKod;
	}


	@Column(name="ULKE_KOD2", nullable=false, length=4)
	public String getUlkeKod2() {
		return this.ulkeKod2;
	}

	public void setUlkeKod2(String ulkeKod2) {
		this.ulkeKod2 = ulkeKod2;
	}

}