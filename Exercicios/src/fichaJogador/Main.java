package fichaJogador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogador primeiroJogador = new Jogador();
        Jogador segundoJogador = new Jogador();

        primeiroJogador.pedirDadosJogador();
//        segundoJogador.pedirDadosJogador();



        primeiroJogador.mostrarDados();
//        segundoJogador.mostrarDados();

    }
}
