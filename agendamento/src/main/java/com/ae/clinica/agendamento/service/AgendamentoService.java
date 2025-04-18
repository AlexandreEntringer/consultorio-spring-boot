package com.ae.clinica.agendamento.service;

import com.ae.clinica.agendamento.model.Agendamento;
import com.ae.clinica.agendamento.repository.AgendamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {
    
    @Autowired 
    private AgendamentoRepository agendamentoRepository;
    
    public List<Agendamento> findAll(){
        return agendamentoRepository.findAll();
    }
    
    public Agendamento findById(Long id){
        return agendamentoRepository.findById(id).orElseThrow();
    }
    
    public Agendamento postAgendamento(Agendamento a){
        return agendamentoRepository.save(a);
    }
    
    public Agendamento putAgendamento(Agendamento a){
        Agendamento agendamento = agendamentoRepository.findById(a.getId()).orElseThrow();
        
        if(agendamento != null && agendamento.getId() != null){
            agendamento = agendamentoRepository.save(a);
        }
        
        return agendamento;
    }
    
    public void deleteAgendamento(Long id){
        agendamentoRepository.deleteById(id);
    }
    
}
