package com.ae.clinica.agendamento.service;

import static com.ae.clinica.agendamento.dto.ObjectMapper.parseObject;
import static com.ae.clinica.agendamento.dto.ObjectMapper.parseListObjects;
import com.ae.clinica.agendamento.dto.data.AgendamentoDTO;
import com.ae.clinica.agendamento.model.Agendamento;
import com.ae.clinica.agendamento.repository.AgendamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {
    
    @Autowired 
    private AgendamentoRepository agendamentoRepository;
    
    public List<AgendamentoDTO> findAll(){
        return parseListObjects(agendamentoRepository.findAll(), AgendamentoDTO.class);
    }
    
    public AgendamentoDTO findById(Long id){
        return parseObject(agendamentoRepository.findById(id).orElseThrow(), AgendamentoDTO.class);
    }
    
    public AgendamentoDTO postAgendamento(AgendamentoDTO a){
        Agendamento agendamento = agendamentoRepository.save(parseObject(a, Agendamento.class));
        return parseObject(agendamento, AgendamentoDTO.class);
    }
    
    public AgendamentoDTO putAgendamento(AgendamentoDTO a){
        Agendamento agendamento = agendamentoRepository.findById(a.getId()).orElseThrow();
        
        if(agendamento != null && agendamento.getId() != null){
            agendamento = agendamentoRepository.save(parseObject(a, Agendamento.class));
        }
        
        return parseObject(agendamento, AgendamentoDTO.class);
    }
    
    public void deleteAgendamento(Long id){
        agendamentoRepository.deleteById(id);
    }
    
}
