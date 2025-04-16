package com.ae.clinica.agendamento.repository;

import com.ae.clinica.agendamento.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long>{
    
}
