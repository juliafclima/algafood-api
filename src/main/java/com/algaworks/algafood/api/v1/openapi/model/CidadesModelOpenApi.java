package com.algaworks.algafood.api.v1.openapi.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.hateoas.Links;

import com.algaworks.algafood.api.v1.model.CidadeModel;

import java.util.List;

@ApiModel("CidadesModel")
@Data
public class CidadesModelOpenApi {

	private CidadeEmbeddedModelOpenApi _embedded;
	private Links _links;

	@ApiModel("CidadesEmbeddedModel")
	@Data
	public class CidadeEmbeddedModelOpenApi {

		private List<CidadeModel> cidades;

	}

}