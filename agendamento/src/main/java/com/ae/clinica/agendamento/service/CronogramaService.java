package com.ae.clinica.agendamento.service;

import com.ae.clinica.agendamento.repository.CronogramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CronogramaService {
    @Autowired
    private CronogramaRepository cronogramaRepository;
    
    
}
