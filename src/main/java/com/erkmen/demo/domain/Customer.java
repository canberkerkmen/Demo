package com.erkmen.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Where;

@Entity
@Where(clause = "is_deleted=false")
public class Customer extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "KIMLIK_NO")
	private String kimlikNo;

	@Column(name = "GELIR")
	private Integer gelir;

	@Column(name = "PHONE")
	private String phoneNumber;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Credit> creditList = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(String name, String surname, String kimlikNo, Integer gelir, String phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.kimlikNo = kimlikNo;
		this.gelir = gelir;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public Integer getGelir() {
		return gelir;
	}

	public void setGelir(Integer gelir) {
		this.gelir = gelir;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Credit> getCreditList() {
		return creditList;
	}

	public void setCreditList(List<Credit> creditList) {
		this.creditList = creditList;
	}

	public void addCredit(Credit credit) {
		creditList.add(credit);
	}
}
