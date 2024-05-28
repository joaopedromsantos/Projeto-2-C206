package Funcionalidade;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarComentario() {
        System.out.println("Comentário sendo postado no Twitter!");
    }
    @Override
    public void compartilhar() {
        System.out.println("Você está compartilhando momentos no Twitter!!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo sendo postado no Twitter!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo post no Twitter!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto sendo postada no Twitter!");
    }
}
