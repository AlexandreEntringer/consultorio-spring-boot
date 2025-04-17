package com.ae.clinica.agendamento.controller;

import com.ae.clinica.agendamento.model.Medico;
import com.ae.clinica.agendamento.service.MedicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Medico> findAll() {
        return medicoService.findAll();
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Medico findById(@PathVariable("id") Long id) {
        return medicoService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Medico postMedico(@RequestBody Medico medico) {
        return medicoService.postMedico(medico);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Medico putMedico(@RequestBody Medico medico) {
        return medicoService.putMedico(medico);
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteMedico(@PathVariable("id") Long id){
        medicoService.deleteMedico(id);
        return ResponseEntity.noContent().build();
    }

}
