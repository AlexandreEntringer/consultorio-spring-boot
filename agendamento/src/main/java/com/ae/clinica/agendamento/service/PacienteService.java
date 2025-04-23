package com.ae.clinica.agendamento.service;

import static com.ae.clinica.agendamento.dto.ObjectMapper.parseListObjects;
import static com.ae.clinica.agendamento.dto.ObjectMapper.parseObject;
import com.ae.clinica.agendamento.dto.data.PacienteDTO;
import com.ae.clinica.agendamento.model.Paciente;
import com.ae.clinica.agendamento.repository.PacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    
    @Autowired
    PacienteRepository pacienteRepository;
    
    public PacienteDTO findById(Long id){
        return parseObject(pacienteRepository.findById(id).orElseThrow(), PacienteDTO.class);
    }
    
    public List<PacienteDTO> findAll(){
        return parseListObjects(pacienteRepository.findAll(), PacienteDTO.class);
    }
    
    public PacienteDTO postPaciente(PacienteDTO p){
        Paciente paciente = pacienteRepository.save(parseObject(p, Paciente.class));
        return parseObject(paciente, PacienteDTO.class);
    }
    
    public PacienteDTO putPaciente(PacienteDTO p){
        Paciente paciente = pacienteRepository.findById(p.getId()).orElseThrow();
        
        if(paciente != null && paciente.getId() != null){
            paciente = pacienteRepository.save(parseObject(p, Paciente.class));
        }
        
        return parseObject(paciente, PacienteDTO.class);
    }
    
    public void deletePaciente(Long id){
        pacienteRepository.deleteById(id);
    }
}
