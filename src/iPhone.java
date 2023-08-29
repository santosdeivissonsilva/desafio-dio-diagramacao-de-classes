import ReprodutorMusical.Musica;

public class iPhone {
    public static void main(String[] args) {
        Musica musica1 = new Musica("musica 1", "cantor 1");
        Musica musica2 = new Musica("musica 2", "cantor 1");

        musica1.selecionarMusica("musica 1");
        musica1.tocar("musica 1");
        musica1.pausar("musica 1");

        musica2.pausar("musica 2");
    }
}