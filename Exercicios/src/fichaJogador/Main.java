package fichaJogador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogador primeiroJogador = new Jogador();
        primeiroJogador.pedirDadosJogador();
        primeiroJogador.mostrarDados();

        Jogador segundoJogador = new Jogador();
        segundoJogador.pedirDadosJogador();
        segundoJogador.mostrarDados();





    }
}
