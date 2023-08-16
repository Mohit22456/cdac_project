package com.ems.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cancellation")
@Getter
@Setter
@ToString
public class Cancellation extends BaseEntity{
	@Column(length = 255)
	private String reason;
	@Column(name = "description")
	private String description;
	@Column
	private double refundableAmount;
	@Column
	private LocalDate cncDate;
	@Column
	private int bookingId;
	@Column
	private int billId;
}
