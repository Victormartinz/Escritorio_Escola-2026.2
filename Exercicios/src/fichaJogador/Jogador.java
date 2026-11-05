package fichaJogador;

import java.util.Scanner;

public class Jogador {
    Scanner scanner = new Scanner(System.in);

    String nome;
    String nick;
    int idade;
    String jogoFavorito;
    int nivel;
    int vitorias;
    int derrotas;
    double porcetagem;






    public void pedirDadosJogador(){
        System.out.println("===== PEDINDO DADOS JOGADOR(A) =====");

        System.out.println("Digite o nome do Jogador(a): ");
        nome = scanner.nextLine();

        System.out.println("Digite o Nick do(a): " + nome );
        nick = scanner.nextLine();

        System.out.println("Digite a idade: ");
        idade = scanner.nextInt();


        System.out.println("Digite o Nivel: ");
        nivel = scanner.nextInt();

        //consumir o bug do teclado para n pular o jofo fav kkkkkk
        scanner.nextLine();

        System.out.println("Digite o Jogo Favorito: ");
        jogoFavorito = scanner.nextLine();

        System.out.println("Digite a quantidade de vitorias: ");
        vitorias = scanner.nextInt();

        System.out.println("Digite a quantidade de derrotas: ");
        derrotas = scanner.nextInt();
    }

    public double calcularPorcetagem(){
        int totalJogos = vitorias + derrotas;

        if (totalJogos > 0) {
            porcetagem = (double)vitorias / totalJogos * 100;
        }else {
            porcetagem = 0.0;
        }

        return porcetagem;
    }

    public void registrarVitoria(){
        vitorias++;
    }

    public void registrarDerrota(){
        derrotas++;
    }

    public void mostrarDados(){
        System.out.println("=====FICHA JOGADOR=====");

        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("");
        System.out.println("Nick: " + nick);
        System.out.println("Idade: " + idade);
        System.out.println("Jogo Favorito: " + jogoFavorito);
        System.out.println("Nivel: " + nivel);
        System.out.println("");
        System.out.println("Partidas: " + vitorias + " V" + " /" + derrotas +" D" );
        System.out.printf("Porcentagem de vitórias: %.2f%%\n" , calcularPorcetagem());
    }

}
