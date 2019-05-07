package com.erkmen.demo.model;

public class CreditResultDTO {

	private String kimlikNo;
	private String durum;
	private Integer limit;

	public CreditResultDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
