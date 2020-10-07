package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TFATURA database table.
 * 
 */
@Entity
@NamedQuery(name="Tfatura.findAll", query="SELECT t FROM Tfatura t")
public class Tfatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DETAY_ID")
	private long detayId;

	private String fack;

	private String fadres;

	private BigDecimal ffisno;

	private short fflag;

	private String fiptal;

	private BigDecimal fseri;

	private BigDecimal fservis;

	private BigDecimal fsira;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BigDecimal fsirano;

	@Temporal(TemporalType.DATE)
	private Date ftarih;

	private String funvan;

	private String fvdadi;

	private String fvdno;

	@Column(name="IADE_KDV_ORAN")
	private BigDecimal iadeKdvOran;

	private String iademi;

	private BigDecimal iadeseri;

	private String iadeseria;

	private BigDecimal iadesira;

	@Temporal(TemporalType.DATE)
	private Date iadetarih;

	private BigDecimal iadetutar;

	private String tckn;

	public Tfatura() {
	}

	public long getDetayId() {
		return this.detayId;
	}

	public void setDetayId(long detayId) {
		this.detayId = detayId;
	}

	public String getFack() {
		return this.fack;
	}

	public void setFack(String fack) {
		this.fack = fack;
	}

	public String getFadres() {
		return this.fadres;
	}

	public void setFadres(String fadres) {
		this.fadres = fadres;
	}

	public BigDecimal getFfisno() {
		return this.ffisno;
	}

	public void setFfisno(BigDecimal ffisno) {
		this.ffisno = ffisno;
	}

	public short getFflag() {
		return this.fflag;
	}

	public void setFflag(short fflag) {
		this.fflag = fflag;
	}

	public String getFiptal() {
		return this.fiptal;
	}

	public void setFiptal(String fiptal) {
		this.fiptal = fiptal;
	}

	public BigDecimal getFseri() {
		return this.fseri;
	}

	public void setFseri(BigDecimal fseri) {
		this.fseri = fseri;
	}

	public BigDecimal getFservis() {
		return this.fservis;
	}

	public void setFservis(BigDecimal fservis) {
		this.fservis = fservis;
	}

	public BigDecimal getFsira() {
		return this.fsira;
	}

	public void setFsira(BigDecimal fsira) {
		this.fsira = fsira;
	}

	public BigDecimal getFsirano() {
		return this.fsirano;
	}

	public void setFsirano(BigDecimal fsirano) {
		this.fsirano = fsirano;
	}

	public Date getFtarih() {
		return this.ftarih;
	}

	public void setFtarih(Date ftarih) {
		this.ftarih = ftarih;
	}

	public String getFunvan() {
		return this.funvan;
	}

	public void setFunvan(String funvan) {
		this.funvan = funvan;
	}

	public String getFvdadi() {
		return this.fvdadi;
	}

	public void setFvdadi(String fvdadi) {
		this.fvdadi = fvdadi;
	}

	public String getFvdno() {
		return this.fvdno;
	}

	public void setFvdno(String fvdno) {
		this.fvdno = fvdno;
	}

	public BigDecimal getIadeKdvOran() {
		return this.iadeKdvOran;
	}

	public void setIadeKdvOran(BigDecimal iadeKdvOran) {
		this.iadeKdvOran = iadeKdvOran;
	}

	public String getIademi() {
		return this.iademi;
	}

	public void setIademi(String iademi) {
		this.iademi = iademi;
	}

	public BigDecimal getIadeseri() {
		return this.iadeseri;
	}

	public void setIadeseri(BigDecimal iadeseri) {
		this.iadeseri = iadeseri;
	}

	public String getIadeseria() {
		return this.iadeseria;
	}

	public void setIadeseria(String iadeseria) {
		this.iadeseria = iadeseria;
	}

	public BigDecimal getIadesira() {
		return this.iadesira;
	}

	public void setIadesira(BigDecimal iadesira) {
		this.iadesira = iadesira;
	}

	public Date getIadetarih() {
		return this.iadetarih;
	}

	public void setIadetarih(Date iadetarih) {
		this.iadetarih = iadetarih;
	}

	public BigDecimal getIadetutar() {
		return this.iadetutar;
	}

	public void setIadetutar(BigDecimal iadetutar) {
		this.iadetutar = iadetutar;
	}

	public String getTckn() {
		return this.tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

}