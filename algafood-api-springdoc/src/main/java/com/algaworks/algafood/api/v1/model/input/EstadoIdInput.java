package com.algaworks.algafood.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

@Setter
@Getter
public class EstadoIdInput {

	@Schema(example = "1")
	@NotNull
	private Long id;
	
}
