package com.maisarvores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class Arvore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("arvore_id")
	private Long arvore_id;
	
	@Column(length = 200, nullable = false)
	private String descricao;
}
