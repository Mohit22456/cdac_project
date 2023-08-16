package com.ems.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "decoration")
@Getter
@Setter
@ToString
public class Decoration extends BaseEntity{
	@Column(length =40)
	private String Name;
	@Column(length = 50)
	private String decorType;
	@Column
	private double cost;
	@Column
	private int userId;
}
