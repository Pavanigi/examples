package com.example.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Trannig Details")

public class Tranning {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String tranningcode;
	Date startingDate;
	Date endingDate;
	

}
