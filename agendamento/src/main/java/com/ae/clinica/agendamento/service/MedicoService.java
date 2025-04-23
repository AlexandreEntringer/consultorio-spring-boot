package com.ae.clinica.agendamento.service;

import static com.ae.clinica.agendamento.dto.ObjectMapper.parseListObjects;
import static com.ae.clinica.agendamento.dto.ObjectMapper.parseObject;
import com.ae.clinica.agendamento.dto.data.MedicoDTO;
import com.ae.clinica.agendamento.model.Medico;
import com.ae.clinica.agendamento.repository.MedicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    
    @Autowired
    private MedicoRepository medicoRepository;
    
    public List<MedicoDTO> findAll(){
        return parseListObjects(medicoRepository.findAll(), MedicoDTO.class);
    }
    
    public MedicoDTO findById(Long id){
        return parseObject(medicoRepository.findById(id).orElseThrow(), MedicoDTO.class);
    }
    
    public MedicoDTO postMedico(MedicoDTO m){
        Medico medico = medicoRepository.save(parseObject(m, Medico.class));
        return parseObject(medico, MedicoDTO.class);
    }
    
    public MedicoDTO putMedico(MedicoDTO m){
        Medico medico = medicoRepository.findById(m.getId()).orElseThrow();
        
        if(medico != null && medico.getId() != null){
            medico = medicoRepository.save(parseObject(m, Medico.class));
        }
        
        return parseObject(medico, MedicoDTO.class);
    }
    
    public void deleteMedico(Long id){
        medicoRepository.deleteById(id);
    }
    
}
