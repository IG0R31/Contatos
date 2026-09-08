package uel.br.Contact.Service;

import uel.br.Contact.Model.ContactModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    private final List<ContactModel> contatos = new ArrayList<>();

    public List<ContactModel> listar(){
        return contatos;
    }

    public ContactModel buscar(int index){
        validarIndice(index);
        return contatos.get(index);
    }

    public ContactModel adicionar(ContactModel c){
        validarDados(c);
        contatos.add(c);
        return c;
    }

    public void remover(int index){
        validarIndice(index);
        contatos.remove(index);
    }

    public ContactModel atualizar(int index, ContactModel c){
        validarIndice(index);
        validarDados(c);
        contatos.set(index, c);
        return c;
    }


    //400 BAD REQUEST: dados inválidos (campos nulos)
    private void validarDados(ContactModel c){
        if(c.getNome()=="") throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O campo 'nome' não pode estar vazio.");
        if(c.getTelefone()=="") throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O campo 'telefone' não pode estar vazio.");
        if(c.getEmail()=="") throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O campo 'email' não pode ficar vazio.");
    }

    //404 NOT FOUND: contato não existe
    private void validarIndice(int index){
        if(index < 0 || index >= contatos.size()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Contato não encontrado");
    }
}



//Estrutura em memória List<Contact>contatos
//Métodos:
//• List<Contact> listar()
//• Contact buscar(int index)
//• void adicionar(Contact c)
//• void remover(int index)
//• void atualizar(int index, Contact c)

//Adicionando Códigos de status IllegalArgumentException
//Códigos de status a serem incorporados:
//• 404 NOT FOUND: quando o contato não existir. (Validar Index)
//• 400 BAD REQUEST: quando os dados enviados forem inválidos, isto é, nome, telefone ou e-mail nulos.
//• 201 CREATED: ao adicionar um novo contato.
//• 204 NO CONTENT: ao remover um contato.