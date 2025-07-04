package com.ae.clinica.agendamento.controller;

import com.ae.clinica.agendamento.dto.data.PacienteDTO;
import com.ae.clinica.agendamento.service.PacienteService;
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
@RequestMapping("/api/v1/paciente")
public class PacienteController {
    
    @Autowired
    private PacienteService pacienteService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PacienteDTO> findAll(){
        return pacienteService.findAll();
    }
    
    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PacienteDTO getPacientePorId(@PathVariable("id") Long id){
        return pacienteService.findById(id);
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PacienteDTO postPaciente(@RequestBody PacienteDTO p){
        return pacienteService.postPaciente(p);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PacienteDTO putPaciente(@RequestBody PacienteDTO p){
        return pacienteService.putPaciente(p);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletePaciente(@PathVariable("id") Long id){
        pacienteService.deletePaciente(id);
        return ResponseEntity.noContent().build();
    }
}
