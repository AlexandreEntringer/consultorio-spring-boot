package com.ae.clinica.agendamento.controller;

import com.ae.clinica.agendamento.model.Agendamento;
import com.ae.clinica.agendamento.service.AgendamentoService;
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
@RequestMapping("/agendamento")
public class AgendamentoController {
    
    @Autowired
    private AgendamentoService agendamentoService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Agendamento> findAll(){
        return agendamentoService.findAll();
    }
    
    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Agendamento findById(@PathVariable("id") Long id){
        return agendamentoService.findById(id);
    }
    
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Agendamento postAgendamento(@RequestBody Agendamento a){
        return agendamentoService.postAgendamento(a);
    }
    
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Agendamento putAgendamento(@RequestBody Agendamento a){
        return agendamentoService.putAgendamento(a);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAgendamento(@PathVariable("id") Long id){
        agendamentoService.deleteAgendamento(id);
        return ResponseEntity.noContent().build();
    }
}
