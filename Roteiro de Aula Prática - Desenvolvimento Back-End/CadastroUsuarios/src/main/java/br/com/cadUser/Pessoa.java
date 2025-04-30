package br.com.cadUser;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@Named
@ViewScoped
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private ArrayList<String> usuarios = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario() {
        if (nome != null && !nome.isEmpty()) {
            usuarios.add(nome);
            System.out.println("Usuário adicionado: " + nome);
            nome = "";
        }
    }
}
