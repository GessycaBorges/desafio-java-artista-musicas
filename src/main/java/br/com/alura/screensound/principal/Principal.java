package br.com.alura.screensound.principal;

import br.com.alura.screensound.model.Artista;
import br.com.alura.screensound.model.TipoArtista;
import br.com.alura.screensound.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {
    private final ArtistaRepository repositorio;
    private Scanner leitura = new Scanner(System.in);

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao !=0) {
            var menu = """
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    5 - Pesquisar dados sobre um artista
                    
                    0 - Sair\n
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicaPorArtista();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 0:
                    System.out.println("\nSaindo da Aplicação.");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }
    }

    private void pesquisarDadosDoArtista() {
    }

    private void buscarMusicaPorArtista() {
    }

    private void listarMusicas() {
    }

    private void cadastrarMusicas() {
    }

    private void cadastrarArtista() {
        var cadastrarNovo = "S";

        while (cadastrarNovo.equalsIgnoreCase("S")) {
            System.out.println("Digite o nome do artista: ");
            var nomeArtista = leitura.nextLine();
            System.out.println("Digite o tipo desse artista (solo, dupla ou banda): ");
            var tipo = leitura.nextLine();
            TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
            Artista artista = new Artista(nomeArtista, tipoArtista);
            repositorio.save(artista);
            System.out.println("\nCadastrar novo artista? (S/N)");
            cadastrarNovo = leitura.nextLine();
        }
    }
}
