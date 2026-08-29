package Controller;

import jakarta.servlet.annotation.WebListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@WebListener
public class ContactController {
    @GetMapping("/contatos")
    public ContactController(ContactController service) {

    }

    @GetMapping("/contatos/{index}")
    public List<ContactController> getContacts(@PathVariable int index) {}

    @PostMapping("/contatos")
    public ContactController adiconarContact(@RequestBody ContactController service) {}

    @DeleteMapping("/contatos/{index}")
    public void deletarContact(@PathVariable int index) {}

    @PutMapping("/contatos/{index}")
    public void atualizaContact(@PathVariable int index, @RequestBody ContactController service) {}
}

//GET /contatos: lista contatos.
//• GET /contatos/{index}: busca contato.
//• POST /contatos: adiciona contato.
//• DELETE /contatos/{index}: remove contato.
//• PUT /contatos/{index}: atualiza contato.