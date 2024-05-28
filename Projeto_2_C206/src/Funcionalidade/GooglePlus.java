package Funcionalidade;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento  {
    @Override
    public void postarComentario() {
        System.out.println("Comentário sendo postado no Google Plus!");
    }
    @Override
    public void compartilhar() {
        System.out.println("Você está compartilhando momentos no Google Plus!!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo sendo postado no Google Plus!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo post no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizando Vídeo Conferência no Google Plus!");
    }
    @Override
    public void postarFoto() {
        System.out.println("Foto sendo postada no Google Plus!");
    }
}
