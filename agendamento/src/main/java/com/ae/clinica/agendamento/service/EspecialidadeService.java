package com.ae.clinica.agendamento.service;

import com.ae.clinica.agendamento.model.Especialidade;
import com.ae.clinica.agendamento.repository.EspecialidadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadeService {
    
    @Autowired EspecialidadeRepository especialidadeRepository;
    
    public List<Especialidade> findAll(){
        return especialidadeRepository.findAll();
    }
    
    public Especialidade findById(Long id){
        return especialidadeRepository.findById(id).orElseThrow();
    }
    
    public Especialidade postEspecialidade(Especialidade e){
        return especialidadeRepository.save(e);
    }
    
    public Especialidade putEspecialidade(Especialidade e){
        Especialidade especialidade = especialidadeRepository.findById(e.getId()).orElseThrow();
        
        if(especialidade != null && especialidade.getId() != null){
            especialidade = especialidadeRepository.save(e);
        }
        
        return especialidade;
    }
    
    public void deleteEspecialidade(Long id){
        especialidadeRepository.deleteById(id);
    }
    
}
