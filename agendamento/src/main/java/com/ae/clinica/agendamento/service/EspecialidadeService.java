package com.ae.clinica.agendamento.service;

import static com.ae.clinica.agendamento.dto.ObjectMapper.parseObject;
import static com.ae.clinica.agendamento.dto.ObjectMapper.parseListObjects;
import com.ae.clinica.agendamento.dto.data.EspecialidadeDTO;
import com.ae.clinica.agendamento.model.Especialidade;
import com.ae.clinica.agendamento.repository.EspecialidadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadeService {
    
    @Autowired EspecialidadeRepository especialidadeRepository;
    
    public List<EspecialidadeDTO> findAll(){
        return parseListObjects(especialidadeRepository.findAll(), EspecialidadeDTO.class);
    }
    
    public EspecialidadeDTO findById(Long id){
        return parseObject(especialidadeRepository.findById(id).orElseThrow(), EspecialidadeDTO.class);
    }
    
    public EspecialidadeDTO postEspecialidade(EspecialidadeDTO e){
        Especialidade especialidade = especialidadeRepository.save(parseObject(e, Especialidade.class));
        return parseObject(especialidade, EspecialidadeDTO.class);
    }
    
    public EspecialidadeDTO putEspecialidade(EspecialidadeDTO e){
        Especialidade especialidade = especialidadeRepository.findById(e.getId()).orElseThrow();
        
        if(especialidade != null && especialidade.getId() != null){
            especialidade = especialidadeRepository.save(parseObject(e, Especialidade.class));
        }
        
        return parseObject(especialidade, EspecialidadeDTO.class);
    }
    
    public void deleteEspecialidade(Long id){
        especialidadeRepository.deleteById(id);
    }
    
}
