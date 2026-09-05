package uel.br.Contact.Service;

import org.apache.coyote.Response;
import org.springframework.web.server.ResponseStatusException;
import uel.br.Contact.Model.ContactModel;
import org.springframework.stereotype.Service;
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


    //400
    private void validarDados(ContactModel c){
        if(c.getNome()==null) throw new ResponseStatusException("O campo 'nome' não pode estar vazio.");
        if(c.getTelefone()==null) throw new ResponseStatusException("O campo 'telefone' não pode estar vazio.");
        if(c.getEmail()==null) throw  new ResponseStatusException("O campo 'email' não pode ficar vazio.");
        if(c.getDataNascimento()==null) throw new ResponseStatusException("O campo 'data de nascimento' não pode ficar vazio.");
    }
    private void validarIndice(int index){
        if(index < 0 || index >= contatos.size()) throw new IndexOutOfBoundsException("Contato não encontrado");
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