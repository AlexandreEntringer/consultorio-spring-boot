package com.ae.clinica.agendamento.service;

import com.ae.clinica.agendamento.model.Medico;
import com.ae.clinica.agendamento.repository.MedicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    
    @Autowired
    private MedicoRepository medicoRepository;
    
    public List<Medico> findAll(){
        return medicoRepository.findAll();
    }
    
    public Medico findById(Long id){
        return medicoRepository.findById(id).orElseThrow();
    }
    
    public Medico postMedico(Medico m){
        return medicoRepository.save(m);
    }
    
    public Medico putMedico(Medico m){
        Medico medico = medicoRepository.findById(m.getId()).orElseThrow();
        
        if(medico != null && medico.getId() != null){
            medico = medicoRepository.save(m);
        }
        
        return medico;
    }
    
    public void deleteMedico(Long id){
        medicoRepository.deleteById(id);
    }
    
}
