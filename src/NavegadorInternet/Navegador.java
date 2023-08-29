package NavegadorInternet;

public class Navegador {
    private Aba[] abas;

    public void adicionarNovaAba(Aba[] novaAba) {
        abas = novaAba;
    }

    public void atualizarPagina(Aba aba) {
        System.out.println("Página atualizada!");
    }
}
