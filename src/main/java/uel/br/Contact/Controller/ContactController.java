package uel.br.Contact.Controller;

import uel.br.Contact.Model.ContactModel;
import uel.br.Contact.Service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@RequestMapping("/contatos")
public class ContactController {
    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactModel> listar(){
        return service.listar();
    }

    @GetMapping("/{index}")
    public ContactModel buscar(@PathVariable int index){
        return service.buscar(index);
    }

    @PostMapping
    public ContactModel adicionar(@RequestBody ContactModel contato) {
        return service.adicionar(contato);
    }

    @DeleteMapping("/{index}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable int index) {
        service.remover(index);
    }

    @PutMapping("/{index}")
    public void atualizar(@PathVariable int index, @RequestBody ContactModel contactModel) {
        service.atualizar(index, contactModel);
    }
}

//GET /contatos: lista contatos.
//• GET /contatos/{index}: busca contato.
//• POST /contatos: adiciona contato.
//• DELETE /contatos/{index}: remove contato.
//• PUT /contatos/{index}: atualiza contato.