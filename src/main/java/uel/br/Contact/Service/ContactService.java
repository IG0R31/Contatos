package uel.br.Contact.Service;

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
