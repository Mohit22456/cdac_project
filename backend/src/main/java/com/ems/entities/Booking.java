package com.ems.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "booking")
@Getter
@Setter
@ToString
public class Booking extends BaseEntity{
	@Column
	private int serviceId;
	@Column
	private int noOfGuest;
	@Column
	private int venueId;
	@Column
	private eventCode eventCategory;
	@Column
	private LocalDate bDate;
	@Column
	private LocalDate startDate;
	@Column
	private LocalDate endDate;
	@Column
	private int userId;
	@Column
	private int status;
	@Column
	private int billNo;
}
