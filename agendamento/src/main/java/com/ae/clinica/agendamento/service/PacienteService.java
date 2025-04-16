package com.ae.clinica.agendamento.service;

import com.ae.clinica.agendamento.model.Paciente;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    public Paciente findById(String id){
        Paciente paciente = new Paciente();
        
        paciente.setId(Long.valueOf(id));
        paciente.setNome("Augusto Albuquerque");
        paciente.setCpf("111.111.111-11");
        paciente.setEmail("augusto.albuquerque@gmail.com");
        paciente.setNumeroCelular("(27) 99999-9999");
        paciente.setEndereco("Avenida Jerferson Aguiar, Centro, Cariacica");
        return paciente;
    }
    
    public Paciente postPaciente(Paciente p){
        Paciente paciente = p;
        return paciente;
    }
    
    public Paciente putPaciente(Paciente p){
        Paciente paciente = p;
        return paciente;
    }
    
    public void deletePaciente(String id){
        
    }
}
