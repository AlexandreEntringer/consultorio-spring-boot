package com.ae.clinica.agendamento.repository;

import com.ae.clinica.agendamento.model.Cronograma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CronogramaRepository extends JpaRepository<Cronograma, Long>{
    
}
