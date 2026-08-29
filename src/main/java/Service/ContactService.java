package Service;

import Model.ContactModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class ContactService {
    private final List<ContactModel> contatos = new ArrayList<>();

    public List<ContactModel> listar(){
        return contatos;
    }

    public Contact buscar(int index){
        return contatos.get(index);
    }

    public void adicionar(Contact c){
        contatos.add(c);
    }

    public void remover(int index, Contact c){
        contatos.remove(index);
    }

    public void atualizar(int index, Contact c){
        contatos.put
    }
}



//Estrutura em memória List<Contact>contatos
//Métodos:
//• List<Contact> listar()
//• Contact buscar(int index)
//• void adicionar(Contact c)
//• void remover(int index)
//• void atualizar(int index, Contact c)
