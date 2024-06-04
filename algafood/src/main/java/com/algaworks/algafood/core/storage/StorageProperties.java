package com.algaworks.algafood.core.storage;

import java.nio.file.Path;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//Componente de configuração do S3 da Amazon
@Getter
@Setter
@Component
@ConfigurationProperties("algafood.storage")
public class StorageProperties {

	@Getter
	@Setter
	private Local local = new Local();
	
	@Getter
	@Setter
	private S3 s3 = new S3();
	
	@Getter
	@Setter
	public class Local {
		private Path diretorioFotos;
	}
	
	@Getter
	@Setter
	public class S3 {
		private String idChaveAcesso;
		private String chaveAcessoSecreta;
		private String bucket;
		private String regiao;
		private String diretorioFotos;
	}
	
}
