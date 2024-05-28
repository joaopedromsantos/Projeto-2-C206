package Funcionalidade;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private String nome;
    private String email;
    private Map<RedeSocial, String> redes_sociais = new HashMap<>();

    public Usuario(RedeSocial[] redes, String[] chaves){
        for (int i = 0; i < redes.length; i++) {
            this.redes_sociais.put(redes[i], chaves[i]);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<RedeSocial, String> getRedes(){
        return this.redes_sociais;
    }
}
