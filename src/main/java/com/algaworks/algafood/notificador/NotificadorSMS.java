package com.algaworks.algafood.notificador;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do SMS pelo número %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
