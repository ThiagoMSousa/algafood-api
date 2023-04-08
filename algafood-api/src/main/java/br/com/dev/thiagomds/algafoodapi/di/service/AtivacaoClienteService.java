package br.com.dev.thiagomds.algafoodapi.di.service;

import br.com.dev.thiagomds.algafoodapi.di.modelo.Cliente;
import br.com.dev.thiagomds.algafoodapi.di.notificacao.Notificador;
import br.com.dev.thiagomds.algafoodapi.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
