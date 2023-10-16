package com.estudante.entitycrud.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity

public class Estudante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "o nome nao foi digitado")
	@Size(min = 2, message = "nome muito curto")
	private String nome;
	
	@Min(value = 18,message =  "o aluno deve ter no minimo 18 anos" )
	private int idade;
}
