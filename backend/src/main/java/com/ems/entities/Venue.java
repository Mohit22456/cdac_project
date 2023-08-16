package com.ems.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "venue")
@Getter
@Setter
@ToString
public class Venue extends BaseEntity{
	@Column(length = 25)
	private String name;
	@Column(length=25)
	private String city;
	@Column(length=25)
	private String state;
	@Column //foreign key user table
	private String userId;
}
