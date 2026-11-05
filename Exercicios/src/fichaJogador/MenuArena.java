package fichaJogador;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuArena {
    public Scanner scanner = new Scanner(System.in);

    public ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public void cadastrarNovoJogador() {
        Jogador novoJogador = new Jogador();
        novoJogador.pedirDadosJogador();
        listaJogadores.add(novoJogador);
        System.out.println("Jogador " + novoJogador.nick + " cadastrado com sucesso!");
    }

    public void mostrarTodosOsJogadores(){
        if (listaJogadores.isEmpty()){
            System.out.println("Nenhum jogador cadastrado ainda");
            return;
        }

        for (int i = 0; i < listaJogadores.size(); i++) {
            System.out.println("--- JOGADOR #" + (i + 1) + "---");
            listaJogadores.get(i).mostrarDados();
        }
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\n===== ARENA MANAGER =====");
            System.out.println("1 - Cadastrar Jogador");
            System.out.println("2 - Ver ficha de TODOS os Jogadores");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 -> cadastrarNovoJogador();
                case 2 -> mostrarTodosOsJogadores();
                case 0 -> System.out.println("Até a próxima partida!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }


}


