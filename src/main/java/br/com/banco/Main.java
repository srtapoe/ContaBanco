package br.com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal conta  = new ContaTerminal();


        pegarDados(conta);


    }


    public static void pegarDados(ContaTerminal contaTerminal){
        Scanner dados  = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        contaTerminal.setNomeCliente(dados.nextLine());
        System.out.println("Agência: ");
        contaTerminal.setAgencia(dados.nextLine());
        System.out.println("Número: ");
        contaTerminal.setNumero(dados.nextInt());
        System.out.println("Saldo depositado: ");
        contaTerminal.setSaldo(dados.nextDouble());

        contaTerminal.mandarMensagem();

    }
}
