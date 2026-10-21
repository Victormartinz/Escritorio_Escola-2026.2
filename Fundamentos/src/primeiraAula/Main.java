package primeiraAula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Óla Mundo");
        System.out.println("Irei ser Engenheiro e Programador Java");
        System.out.println("Futuramente irei abrir um negocio na Área Tech");
        System.out.println("teste");

        int numeroUm = 10;
        int numeroDois = 20;

        int soma = numeroUm + numeroDois;
        int subtracao = numeroUm - numeroDois;
        int multiplicacao = numeroUm * numeroDois;
        int divisao = numeroUm / numeroDois;


        System.out.println("Números: " + numeroUm + " " + numeroDois);
        System.out.println("A Soma é: " + soma);
        System.out.println("A Subtração é: " + subtracao);
        System.out.println("A Mulitplicação é: " + multiplicacao);
        System.out.println("A Divisão é: " + divisao);


        System.out.println("Digite a seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua Idade:");
        int idade = scanner.nextInt();

        System.out.println("Óla " + nome + " Você tem " + idade + " anos");



    }
}