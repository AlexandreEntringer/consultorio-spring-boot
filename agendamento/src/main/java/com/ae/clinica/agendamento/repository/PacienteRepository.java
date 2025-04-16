package com.ae.clinica.agendamento.repository;

import com.ae.clinica.agendamento.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
