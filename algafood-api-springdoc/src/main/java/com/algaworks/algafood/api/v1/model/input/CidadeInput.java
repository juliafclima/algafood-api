package com.algaworks.algafood.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

@Setter
@Getter
public class CidadeInput {

	@Schema(example = "Uberlândia")
	@NotBlank
	private String nome;

	@Valid
	@NotNull
	private EstadoIdInput estado;
	
}
