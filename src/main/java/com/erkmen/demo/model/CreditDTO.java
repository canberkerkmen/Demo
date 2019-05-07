package com.erkmen.demo.model;

public class CreditDTO {

	private String kimlikNo;
	private String ad;
	private String soyad;
	private Integer gelir;
	private String cepTel;

	public CreditDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getGelir() {
		return gelir;
	}

	public void setGelir(Integer gelir) {
		this.gelir = gelir;
	}

	public String getCepTel() {
		return cepTel;
	}

	public void setCepTel(String cepTel) {
		this.cepTel = cepTel;
	}

}
