package com.ae.clinica.agendamento.repository;

import com.ae.clinica.agendamento.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
}
