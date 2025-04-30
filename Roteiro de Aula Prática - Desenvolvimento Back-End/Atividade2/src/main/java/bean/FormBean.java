package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "formBean")
@RequestScoped
public class FormBean {

    private String nome;
    private String email;
    private String telefone;
    private String assunto;
    private String mensagem;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // Método acionado ao clicar no botão "Enviar"
    public String enviar() {
        System.out.println("=== Dados do Formulário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);

        // Retorna nulo para permanecer na mesma página
        return null;
    }
}
