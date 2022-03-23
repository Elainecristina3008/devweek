package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.Regiao;
import com.dio_class.devweek.Repository.RegiaoRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//A anotação @TestController está associada ao Spring web ele trás um controller com padrão rest. Ex. metodos http

@RestController
public class RegiaoController {
    private final RegiaoRepo repository;


    public RegiaoController(RegiaoRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/regiao")
    public List<Regiao> getRegiao(){
        return repository.findAll();
    }

    @GetMapping("/regiao/{id}")
    public ResponseEntity<?> getRegiaoById(@PathVariable Long id){
        Optional regiaoEscolhidaOptional = repository.findById(id);
        if (regiaoEscolhidaOptional.isPresent()){
            Object regiaoEscohida = regiaoEscolhidaOptional.get();
            return new ResponseEntity<>(regiaoEscohida, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("regiao/novo")
    public void putRegiao(Regiao newRegiao){
        repository.save(newRegiao);
    }

}
