package Exercício03;

import java.util.Random;

public class BilheteUnico {
    String nome;
    double saldo;
    int numeroBilhete;
    String tipo;

    final static double TARIFABASE = 5.40;
    //final para constante e não alterar o valor

    public BilheteUnico(String nome, String tipo){
        Random rd = new Random();
        this.nome=nome;
        this.tipo=tipo;
        this.numeroBilhete=rd.nextInt(1000,9999);
    }

    public boolean passarCatraca(){
        double valor = TARIFABASE;

        if(tipo.equalsIgnoreCase("estudante") ||
                tipo.equalsIgnoreCase("professor")){
            valor = valor / 2;
        }
        if (saldo<valor){
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

    public void carregar (double valor){
        this.saldo +=valor;
    }



}
