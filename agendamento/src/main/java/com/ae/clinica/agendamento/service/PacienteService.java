package com.ae.clinica.agendamento.service;

import com.ae.clinica.agendamento.model.Paciente;
import com.ae.clinica.agendamento.repository.PacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    
    @Autowired
    PacienteRepository pacienteRepository;
    
    public Paciente findById(Long id){
        return pacienteRepository.findById(id).orElseThrow();
    }
    
    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }
    
    public Paciente postPaciente(Paciente p){
        return pacienteRepository.save(p);
    }
    
    public Paciente putPaciente(Paciente p){
        Paciente paciente = pacienteRepository.findById(p.getId()).orElseThrow();
        
        if(paciente != null && paciente.getId() != null){
            paciente = pacienteRepository.save(p);
        }
        
        return paciente;
    }
    
    public void deletePaciente(Long id){
        pacienteRepository.deleteById(id);
    }
}
