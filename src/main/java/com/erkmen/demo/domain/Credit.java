package com.erkmen.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Where;

import com.erkmen.demo.utils.Enums.ApplicationStatus;

@Entity
@Where(clause = "is_deleted=false")
public class Credit extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "SCOR")
	private Integer scor;

	@Column(name = "BASVURU_DURUMU")
	@Enumerated(EnumType.STRING)
	private ApplicationStatus status;

	@Column(name = "KREDI_LIMIT")
	private Integer creditLimit;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	private Customer customer;

	public Credit() {
		super();
	}

	public Credit(Integer scor, ApplicationStatus status, Integer creditLimit, Customer customer) {
		super();
		this.scor = scor;
		this.status = status;
		this.creditLimit = creditLimit;
		this.customer = customer;
	}

	public Integer getScor() {
		return scor;
	}

	public void setScor(Integer scor) {
		this.scor = scor;
	}

	public ApplicationStatus getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}

	public Integer getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
