package ReprodutorMusical;

public class Musica {
    private String nome;
    private String artista;
    private boolean player = false;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }
    public void tocar(String nome) {
        player = true;
        System.out.println("Música boa tocando!");
    }
    public void pausar(String nome) {
        if (player) {
            System.out.println("Música pausada.");
        } else {
            System.out.println("Não há música tocando neste momento!");
        }
    }
    public void selecionarMusica(String nome) {
        System.out.println("Você selecionou a música: " + nome);
    }
}
