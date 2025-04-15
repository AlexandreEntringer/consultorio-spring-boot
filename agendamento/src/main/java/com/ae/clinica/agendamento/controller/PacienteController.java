package com.ae.clinica.agendamento.controller;

import com.ae.clinica.agendamento.model.Paciente;
import com.ae.clinica.agendamento.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    
    @Autowired
    private PacienteService pacienteService;
    
    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Paciente getPacientePorId(@PathVariable("id") String id){
        return pacienteService.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Paciente postPaciente(@RequestBody Paciente p){
        return pacienteService.postPaciente(p);
    }
    
    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Paciente putPaciente(@RequestBody Paciente p){
        return pacienteService.putPaciente(p);
    }
    
    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE)
    public void deletePaciente(@PathVariable("id") String id){
    }
}
