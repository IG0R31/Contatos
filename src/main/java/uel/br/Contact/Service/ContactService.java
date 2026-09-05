package uel.br.Contact.Service;

import uel.br.Contact.Model.ContactModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.IllegalFormatException;

@Service
public class ContactService {
    private final List<ContactModel> contatos = new ArrayList<>();

    public List<ContactModel> listar(){
        return contatos;
    }

    public ContactModel buscar(int index){
        return contatos.get(index);
    }

    public ContactModel adicionar(ContactModel c){
        contatos.add(c);
        return c;
    }

    public void remover(int index){
        contatos.remove(index);
    }

    public ContactModel atualizar(int index, ContactModel c){
        contatos.set(index, c);
        return c;
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
//• 404 NOT FOUND: quando o contato não existir.
//• 400 BAD REQUEST: quando os dados enviados forem inválidos, isto é, nome, telefone ou e-mail nulos.
//• 201 CREATED: ao adicionar um novo contato.
//• 204 NO CONTENT: ao remover um contato.