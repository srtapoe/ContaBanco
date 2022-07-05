package br.com.banco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(){}


    public void mandarMensagem() {
        System.out.println("Olá,  " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + this.getAgencia() + ", conta n° " + this.getNumero() + " e seu saldo R$ " + this.getSaldo() +
                " já está disponível para saque.");

    }
}
