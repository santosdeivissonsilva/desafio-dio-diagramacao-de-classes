package AparelhoTelefonico;

public class Telefone {
   private Contato[] contatos;

    public Telefone(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void ligar(Contato contato){
        System.out.println("Ligando para: " + contato.getNome());
    }

    public void atender(){
        System.out.println("O telefone está tocando!" + "\n" + "....." + "\n" + "Diga alô!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Este número de telefone está indisponível. Grave seu recado após o sinal. (BIP!)");
    }
}
