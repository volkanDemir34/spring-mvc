package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the TTEDIYE_ISLEM database table.
 * 
 */
@Entity
@Table(name="TTEDIYE_ISLEM")
@NamedQuery(name="TtediyeIslem.findAll", query="SELECT t FROM TtediyeIslem t")
public class TtediyeIslem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="BILDIRILEN_TUTAR")
	private BigDecimal bildirilenTutar;

	@Column(name="BILDIRIM_FLAG")
	private short bildirimFlag;

	@Column(name="GELEN_MESAJ_ID")
	private long gelenMesajId;

	@Column(name="GERCEKLESEN_TUTAR")
	private BigDecimal gerceklesenTutar;

	@Column(name="GIDECEK_UUID")
	private String gidecekUuid;

	@Column(name="GIRIS_SICIL")
	private String girisSicil;

	@Column(name="GIRIS_ZAMAN")
	private Timestamp girisZaman;

	@Column(name="GUNC_KULLANICI_ID")
	private int guncKullaniciId;

	@Column(name="GUNC_ZAMAN")
	private Timestamp guncZaman;



	@Column(name="IPTAL_ZAMAN")
	private Timestamp iptalZaman;

	@Column(name="ISLEM_DURUM_KOD")
	private String islemDurumKod;

	@Column(name="ISLEM_REF_NO")
	private String islemRefNo;

	@Temporal(TemporalType.DATE)
	@Column(name="ISLEM_TARIH")
	private Date islemTarih;

	@Column(name="ISLEMGRUP_ID")
	private BigDecimal islemgrupId;

	@Column(name="KATILIMCI_ID")
	private BigDecimal katilimciId;

	@Column(name="MASRAF_TUTAR")
	private BigDecimal masrafTutar;

	@Column(name="MUHASEBE_FLAG")
	private short muhasebeFlag;

	@Column(name="ONAY_SICIL")
	private String onaySicil;

	@Column(name="ONAY_ZAMAN")
	private Timestamp onayZaman;

	@Column(name="SUBE_DEPO_VM_DURUM_ID")
	private BigDecimal subeDepoVmDurumId;

	@Column(name="SUBE_ID")
	private BigDecimal subeId;

	@Column(name="VEZNE_DEPO_ID")
	private BigDecimal vezneDepoId;

	private int veznenysno;

	@Column(name="YETKILI_TCKN")
	private BigDecimal yetkiliTckn;

	@Column(name="YRTM_KULLANICI_ID")
	private int yrtmKullaniciId;

	@Column(name="YRTM_ZAMAN")
	private Timestamp yrtmZaman;

	public TtediyeIslem() {
	}

	public BigDecimal getBildirilenTutar() {
		return this.bildirilenTutar;
	}

	public void setBildirilenTutar(BigDecimal bildirilenTutar) {
		this.bildirilenTutar = bildirilenTutar;
	}

	public short getBildirimFlag() {
		return this.bildirimFlag;
	}

	public void setBildirimFlag(short bildirimFlag) {
		this.bildirimFlag = bildirimFlag;
	}

	public long getGelenMesajId() {
		return this.gelenMesajId;
	}

	public void setGelenMesajId(long gelenMesajId) {
		this.gelenMesajId = gelenMesajId;
	}

	public BigDecimal getGerceklesenTutar() {
		return this.gerceklesenTutar;
	}

	public void setGerceklesenTutar(BigDecimal gerceklesenTutar) {
		this.gerceklesenTutar = gerceklesenTutar;
	}

	public String getGidecekUuid() {
		return this.gidecekUuid;
	}

	public void setGidecekUuid(String gidecekUuid) {
		this.gidecekUuid = gidecekUuid;
	}

	public String getGirisSicil() {
		return this.girisSicil;
	}

	public void setGirisSicil(String girisSicil) {
		this.girisSicil = girisSicil;
	}

	public Timestamp getGirisZaman() {
		return this.girisZaman;
	}

	public void setGirisZaman(Timestamp girisZaman) {
		this.girisZaman = girisZaman;
	}

	public int getGuncKullaniciId() {
		return this.guncKullaniciId;
	}

	public void setGuncKullaniciId(int guncKullaniciId) {
		this.guncKullaniciId = guncKullaniciId;
	}

	public Timestamp getGuncZaman() {
		return this.guncZaman;
	}

	public void setGuncZaman(Timestamp guncZaman) {
		this.guncZaman = guncZaman;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getIptalZaman() {
		return this.iptalZaman;
	}

	public void setIptalZaman(Timestamp iptalZaman) {
		this.iptalZaman = iptalZaman;
	}

	public String getIslemDurumKod() {
		return this.islemDurumKod;
	}

	public void setIslemDurumKod(String islemDurumKod) {
		this.islemDurumKod = islemDurumKod;
	}

	public String getIslemRefNo() {
		return this.islemRefNo;
	}

	public void setIslemRefNo(String islemRefNo) {
		this.islemRefNo = islemRefNo;
	}

	public Date getIslemTarih() {
		return this.islemTarih;
	}

	public void setIslemTarih(Date islemTarih) {
		this.islemTarih = islemTarih;
	}

	public BigDecimal getIslemgrupId() {
		return this.islemgrupId;
	}

	public void setIslemgrupId(BigDecimal islemgrupId) {
		this.islemgrupId = islemgrupId;
	}

	public BigDecimal getKatilimciId() {
		return this.katilimciId;
	}

	public void setKatilimciId(BigDecimal katilimciId) {
		this.katilimciId = katilimciId;
	}

	public BigDecimal getMasrafTutar() {
		return this.masrafTutar;
	}

	public void setMasrafTutar(BigDecimal masrafTutar) {
		this.masrafTutar = masrafTutar;
	}

	public short getMuhasebeFlag() {
		return this.muhasebeFlag;
	}

	public void setMuhasebeFlag(short muhasebeFlag) {
		this.muhasebeFlag = muhasebeFlag;
	}

	public String getOnaySicil() {
		return this.onaySicil;
	}

	public void setOnaySicil(String onaySicil) {
		this.onaySicil = onaySicil;
	}

	public Timestamp getOnayZaman() {
		return this.onayZaman;
	}

	public void setOnayZaman(Timestamp onayZaman) {
		this.onayZaman = onayZaman;
	}

	public BigDecimal getSubeDepoVmDurumId() {
		return this.subeDepoVmDurumId;
	}

	public void setSubeDepoVmDurumId(BigDecimal subeDepoVmDurumId) {
		this.subeDepoVmDurumId = subeDepoVmDurumId;
	}

	public BigDecimal getSubeId() {
		return this.subeId;
	}

	public void setSubeId(BigDecimal subeId) {
		this.subeId = subeId;
	}

	public BigDecimal getVezneDepoId() {
		return this.vezneDepoId;
	}

	public void setVezneDepoId(BigDecimal vezneDepoId) {
		this.vezneDepoId = vezneDepoId;
	}

	public int getVeznenysno() {
		return this.veznenysno;
	}

	public void setVeznenysno(int veznenysno) {
		this.veznenysno = veznenysno;
	}

	public BigDecimal getYetkiliTckn() {
		return this.yetkiliTckn;
	}

	public void setYetkiliTckn(BigDecimal yetkiliTckn) {
		this.yetkiliTckn = yetkiliTckn;
	}

	public int getYrtmKullaniciId() {
		return this.yrtmKullaniciId;
	}

	public void setYrtmKullaniciId(int yrtmKullaniciId) {
		this.yrtmKullaniciId = yrtmKullaniciId;
	}

	public Timestamp getYrtmZaman() {
		return this.yrtmZaman;
	}

	public void setYrtmZaman(Timestamp yrtmZaman) {
		this.yrtmZaman = yrtmZaman;
	}

}