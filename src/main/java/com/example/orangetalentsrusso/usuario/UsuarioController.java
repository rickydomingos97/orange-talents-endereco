package com.example.orangetalentsrusso.usuario;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        System.out.println("estou na memoria");
        this.repository = repository;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void salvarUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest){

        repository.save(usuarioRequest.toUsuario());
        //TODO - salvar usuario - Lembrando que o Java nao se preocupa com conteudo e sim com o tipo de dado
    }
    //APAGAR
    @GetMapping
    public List<Usuario> listartudo(){
        return repository.findAll();
    }

}
