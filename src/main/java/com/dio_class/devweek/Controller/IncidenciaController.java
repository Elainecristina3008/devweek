package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.Incidencia;
import com.dio_class.devweek.Repository.IncidenciaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class IncidenciaController {

    private final IncidenciaRepo ocRepository;


    public IncidenciaController(IncidenciaRepo ocRepository) {
        this.ocRepository = ocRepository;
    }

    @GetMapping("/incidencia")
    public ResponseEntity<List<Incidencia>>findIncidencias(){
        List<Incidencia> listaOcorrencia = ocRepository.findAll();
        if(listaOcorrencia.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<>(listaOcorrencia, HttpStatus.OK);

    }
    @GetMapping("/incidencia/{id}")
    public ResponseEntity<Incidencia>findIncidenciaById(@PathVariable Long id){
        Optional<Incidencia>ocorrenciaOptional = ocRepository.findById(id);
        if (ocorrenciaOptional.isPresent()){
            Incidencia ocorrenciaUnid = ocorrenciaOptional.get();
            return new ResponseEntity<>(ocorrenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
