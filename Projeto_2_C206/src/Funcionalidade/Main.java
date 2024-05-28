package Funcionalidade;

import Excecoes.Unchecked;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // --- Declarando instância das redes sociais --- //
        Twitter twitter = new Twitter();
        Facebook facebook = new Facebook();
        GooglePlus googlePlus = new GooglePlus();
        Instagram instagram = new Instagram();

        // --- Modificando atributos --- //
        facebook.numAmigos = 1200;
        facebook.senha = "abcdef";
        twitter.numAmigos = 300;
        twitter.senha = "corda89";
        googlePlus.numAmigos = 600;
        googlePlus.senha = "gtybbb";
        instagram.numAmigos = 1500;
        instagram.senha = "ytrew23";


        // --- Arrays --- //
        RedeSocial[] redes = new RedeSocial[2];
        String[] valores = new String[2];
        redes[0] = facebook;
        valores[0] = "1";
        redes[1] = googlePlus;
        valores[1] = "2";

        // --- Novo Usuário --- //
        Usuario usuario = new Usuario(redes, valores);

        // --- Atribuindo valores aos atributos --- //
        usuario.setNome("Ricardo");
        usuario.setEmail("RicardoMendes@gmail.com");

        // -- Try Catch para tratamentos de erros dos usuários
        try{
            // ---Obtém a lista de redes sociais --- //
            List<RedeSocial> lista_redes = new ArrayList<>(usuario.getRedes().keySet());

            lista_redes.get(0).postarComentario();
            lista_redes.get(0).curtirPublicacao();
            lista_redes.get(0).postarFoto();

            // -- CAST --- //
            ((GooglePlus) lista_redes.get(1)).compartilhar();
            ((GooglePlus) lista_redes.get(1)).fazStreaming();
            lista_redes.get(1).postarVideo();
        }
        catch (Unchecked e){
            e.printStackTrace();
        }
    }
}