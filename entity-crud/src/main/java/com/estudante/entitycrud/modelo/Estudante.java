package com.estudante.entitycrud.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Estudante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

}
