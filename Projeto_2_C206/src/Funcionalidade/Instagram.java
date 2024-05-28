package Funcionalidade;

public class Instagram extends RedeSocial{
    @Override
    public void postarComentario() {
        System.out.println("Comentário sendo postado no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo sendo postado no Instagram!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo post no Instagram!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto sendo postada no Instagram!");
    }
}
