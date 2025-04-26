package com.ae.clinica.agendamento.controller;

import com.ae.clinica.agendamento.dto.data.EspecialidadeDTO;
import com.ae.clinica.agendamento.service.EspecialidadeService;
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
@RequestMapping("/api/v1/especialidade")
public class EspecialidadeController {
    
    @Autowired
    private EspecialidadeService especialidadeService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EspecialidadeDTO> findAll(){
        return especialidadeService.findAll();
    }
    
    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public EspecialidadeDTO findById(@PathVariable("id") Long id){
        return especialidadeService.findById(id);
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public EspecialidadeDTO postEspecialidade(@RequestBody EspecialidadeDTO e){
        return especialidadeService.postEspecialidade(e);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public EspecialidadeDTO putEspecialidade(@RequestBody EspecialidadeDTO e){
        return especialidadeService.putEspecialidade(e);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteEspecialidade(@PathVariable("id") Long id){
        especialidadeService.deleteEspecialidade(id);
        return ResponseEntity.noContent().build();
    }
    
}
