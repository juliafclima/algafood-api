package com.algaworks.algafood.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

import io.swagger.v3.oas.annotations.media.Schema;

@Setter
@Getter
public class EstadoInput {

	@Schema(example = "Minas Gerais")
	@NotBlank
	private String nome;
	
}
