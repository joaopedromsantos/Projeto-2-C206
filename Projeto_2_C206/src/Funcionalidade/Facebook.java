package Funcionalidade;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarComentario() {
        System.out.println("Comentário sendo postado no Facebook!");
    }
    @Override
    public void compartilhar() {
        System.out.println("Você está compartilhando momentos no Facebook!!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo sendo postado no Facebook!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo post no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizando Vídeo Conferência no Facebook!");
    }
    @Override
    public void postarFoto() {
        System.out.println("Foto sendo postada no Facebook!");
    }


}
