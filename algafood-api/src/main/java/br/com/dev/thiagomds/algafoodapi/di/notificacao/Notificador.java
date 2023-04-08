package br.com.dev.thiagomds.algafoodapi.di.notificacao;

import br.com.dev.thiagomds.algafoodapi.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
