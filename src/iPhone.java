import AparelhoTelefonico.Contato;
import AparelhoTelefonico.Telefone;
import NavegadorInternet.Aba;
import NavegadorInternet.Navegador;
import ReprodutorMusical.Musica;

import java.util.Arrays;

public class iPhone {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Musica 1", "cantor 1");
        Musica musica2 = new Musica("Musica 2", "cantor 1");

        musica1.selecionarMusica("Musica 1");
        musica1.tocar("Musica 1");
        musica1.pausar("Musica 1");

        musica2.pausar("Musica 2");

        System.out.println("-----");

        Contato[] contatos = {
                new Contato("Contato 1", 123456777),
                new Contato("Contato 2", 123456888),
                new Contato("Contato 3", 123456999)
        };

        Telefone telefone = new Telefone(contatos);

        telefone.ligar(contatos[0]);
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("-----");

        Navegador navegador = new Navegador();
        Aba[] abas = new Aba[]{new Aba()};
        navegador.adicionarNovaAba(abas);
        abas[0].exibirPagina("www.site1.com");
        navegador.atualizarPagina(abas[0]);
    }
}