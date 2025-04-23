package com.ae.clinica.agendamento.controller;

import com.ae.clinica.agendamento.dto.data.MedicoDTO;
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
    public List<MedicoDTO> findAll() {
        return medicoService.findAll();
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public MedicoDTO findById(@PathVariable("id") Long id) {
        return medicoService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public MedicoDTO postMedico(@RequestBody MedicoDTO medico) {
        return medicoService.postMedico(medico);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public MedicoDTO putMedico(@RequestBody MedicoDTO medico) {
        return medicoService.putMedico(medico);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteMedico(@PathVariable("id") Long id){
        medicoService.deleteMedico(id);
        return ResponseEntity.noContent().build();
    }

}
