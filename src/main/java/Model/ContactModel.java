package Model;

//Aqui fica a parte de Atributos
//E os getters and setters

import org.springframework.web.bind.annotation.ModelAttribute;
import java.time.LocalDate;
org.springframework.web.bind.annotation.ModelAttribute;

@ModelAttribute
public class ContactModel {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String nome) {
        this.email = email;
    }

    public void setTelefone(String nome) {
        this.telefone = telefone;
    }

    public void setEndereco(String nome) {
        this.endereco = endereco;
    }

    public void setDataNascimento(String nome) {
        this.dataNascimento = dataNascimento;
    }

    public void getNome() {
        return nome;
    }

    public void getEmail() {
        return email;
    }

    public void getTelefone() {
        return telefone;
    }

    public void getEndereco() {
        return endereco;
    }

    public void getDataNascimento() {
        return dataNascimento;
    }
}
//String nome
//• String telefone
//• String email
//• String endereco
//• LocalDate dataNascimento (java.time, formato aaaa-MM-dd)