package com.ems.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bill")
@Getter
@Setter
@ToString
public class Bill extends BaseEntity{
	@Column(length = 10)
	private int bookingId;
	@Column(length = 10)
	private int userId;
	@Column
	private String paymentType;
	@Column
	private LocalDate billDate;
	@Column
	private double amount;
	@Column
	private double totalAmount;
}
