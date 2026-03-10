package Exercício03;

import java.util.Scanner;

public class Main {
    static Scanner  sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    //blocos estático só trabalha com variavéis estáticas
    static {
        System.out.print("Nome do usuário: ");
        String nome = sc.nextLine();
        System.out.print("Tipo de tarifa | Professor, Estudante ou Normal | ");
        String tipo = sc.next();
        bilhete = new BilheteUnico(nome, tipo);
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("*************************");
            System.out.println("Selecione uma opção do menu:");
            System.out.println("1- Carregar bilhete");
            System.out.println("2- Consultar");
            System.out.println("3- Passar na catraca");
            System.out.println("4- Finalizar");
            opcao = sc.nextInt();

            //break esta imbutido na seta
            switch (opcao){
                case 1 -> carregarBilhete();
                case 2 -> consultarSaldo();
                case 3 -> passarNaCatraca();
                case 4 -> System.out.println("Obrigado por usar o nosso App");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao != 4); //usa-se ; para do whilr
    }

    public static void passarNaCatraca() {
    if(bilhete.passarCatraca() == false){
        System.out.println("Saldo Insuficiente");
        }
        consultarSaldo();
    }

    public static void consultarSaldo() {
        System.out.print("Saldo atual R$ "+bilhete.saldo);
    }

    public static void carregarBilhete() {
        double valor;
        System.out.print("Digite o valor para carregar --> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }
}
