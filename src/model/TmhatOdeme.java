package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the TMHAT_ODEME database table.
 * 
 */
@Entity
@Table(name="TMHAT_ODEME")
@NamedQuery(name="TmhatOdeme.findAll", query="SELECT t FROM TmhatOdeme t")
public class TmhatOdeme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ALICI_UNVAN")
	private String aliciUnvan;

	@Column(name="BELGE_ADET")
	private int belgeAdet;

	@Temporal(TemporalType.DATE)
	@Column(name="BELGE_TARIH")
	private Date belgeTarih;

	@Column(name="BIREYSEL_TUZEL_KOD")
	private String bireyselTuzelKod;

	@Column(name="BIRIM_ONAY_FLAG")
	private short birimOnayFlag;

	@Column(name="DONEM_FLAG")
	private short donemFlag;

	private String durum;

	@Column(name="GIB_BILDIRILDI_FLAG")
	private short gibBildirildiFlag;

	@Column(name="GIRIS_KULL_AD_SOYAD")
	private String girisKullAdSoyad;

	@Column(name="GIRIS_KULL_BIRIM_AD")
	private String girisKullBirimAd;

	@Column(name="GIRIS_KULL_ID")
	private int girisKullId;

	@Column(name="GIRIS_ZAMAN")
	private Timestamp girisZaman;

	@Column(name="GUNC_KULL_BIRIM_AD")
	private String guncKullBirimAd;

	@Column(name="GUNC_KULL_ID")
	private int guncKullId;

	@Column(name="GUNC_ZAMAN")
	private Timestamp guncZaman;

	private long id;

	@Column(name="ISLEM_REF_NO")
	private String islemRefNo;

	@Column(name="MHAT_FLAG")
	private short mhatFlag;

	@Column(name="TCMB_ULKE_KOD")
	private String tcmbUlkeKod;

	private BigDecimal tutar;

	@Column(name="VKN_TCKN")
	private String vknTckn;

	@Column(name="YURTICI_FLAG")
	private short yurticiFlag;

	public TmhatOdeme() {
	}

	public String getAliciUnvan() {
		return this.aliciUnvan;
	}

	public void setAliciUnvan(String aliciUnvan) {
		this.aliciUnvan = aliciUnvan;
	}

	public int getBelgeAdet() {
		return this.belgeAdet;
	}

	public void setBelgeAdet(int belgeAdet) {
		this.belgeAdet = belgeAdet;
	}

	public Date getBelgeTarih() {
		return this.belgeTarih;
	}

	public void setBelgeTarih(Date belgeTarih) {
		this.belgeTarih = belgeTarih;
	}

	public String getBireyselTuzelKod() {
		return this.bireyselTuzelKod;
	}

	public void setBireyselTuzelKod(String bireyselTuzelKod) {
		this.bireyselTuzelKod = bireyselTuzelKod;
	}

	public short getBirimOnayFlag() {
		return this.birimOnayFlag;
	}

	public void setBirimOnayFlag(short birimOnayFlag) {
		this.birimOnayFlag = birimOnayFlag;
	}

	public short getDonemFlag() {
		return this.donemFlag;
	}

	public void setDonemFlag(short donemFlag) {
		this.donemFlag = donemFlag;
	}

	public String getDurum() {
		return this.durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public short getGibBildirildiFlag() {
		return this.gibBildirildiFlag;
	}

	public void setGibBildirildiFlag(short gibBildirildiFlag) {
		this.gibBildirildiFlag = gibBildirildiFlag;
	}

	public String getGirisKullAdSoyad() {
		return this.girisKullAdSoyad;
	}

	public void setGirisKullAdSoyad(String girisKullAdSoyad) {
		this.girisKullAdSoyad = girisKullAdSoyad;
	}

	public String getGirisKullBirimAd() {
		return this.girisKullBirimAd;
	}

	public void setGirisKullBirimAd(String girisKullBirimAd) {
		this.girisKullBirimAd = girisKullBirimAd;
	}

	public int getGirisKullId() {
		return this.girisKullId;
	}

	public void setGirisKullId(int girisKullId) {
		this.girisKullId = girisKullId;
	}

	public Timestamp getGirisZaman() {
		return this.girisZaman;
	}

	public void setGirisZaman(Timestamp girisZaman) {
		this.girisZaman = girisZaman;
	}

	public String getGuncKullBirimAd() {
		return this.guncKullBirimAd;
	}

	public void setGuncKullBirimAd(String guncKullBirimAd) {
		this.guncKullBirimAd = guncKullBirimAd;
	}

	public int getGuncKullId() {
		return this.guncKullId;
	}

	public void setGuncKullId(int guncKullId) {
		this.guncKullId = guncKullId;
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

	public String getIslemRefNo() {
		return this.islemRefNo;
	}

	public void setIslemRefNo(String islemRefNo) {
		this.islemRefNo = islemRefNo;
	}

	public short getMhatFlag() {
		return this.mhatFlag;
	}

	public void setMhatFlag(short mhatFlag) {
		this.mhatFlag = mhatFlag;
	}

	public String getTcmbUlkeKod() {
		return this.tcmbUlkeKod;
	}

	public void setTcmbUlkeKod(String tcmbUlkeKod) {
		this.tcmbUlkeKod = tcmbUlkeKod;
	}

	public BigDecimal getTutar() {
		return this.tutar;
	}

	public void setTutar(BigDecimal tutar) {
		this.tutar = tutar;
	}

	public String getVknTckn() {
		return this.vknTckn;
	}

	public void setVknTckn(String vknTckn) {
		this.vknTckn = vknTckn;
	}

	public short getYurticiFlag() {
		return this.yurticiFlag;
	}

	public void setYurticiFlag(short yurticiFlag) {
		this.yurticiFlag = yurticiFlag;
	}

}