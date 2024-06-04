package com.algaworks.algafood.api.v1.model.input;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CidadeInput {

	@ApiModelProperty( example = "Petrópolis", required = true)
    @NotBlank
    private String nome;
    
	@ApiModelProperty( example = "1")
    @Valid
    @NotNull
    private EstadoIdInput estado;
    
}