package com.ae.clinica.agendamento.dto.data;

import com.ae.clinica.agendamento.model.Medico;
import com.ae.clinica.agendamento.model.Paciente;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class AgendamentoDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Medico medico;
    private Paciente paciente;
    private Timestamp dataAgendamento;

    public AgendamentoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Timestamp getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Timestamp dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AgendamentoDTO other = (AgendamentoDTO) obj;
        return Objects.equals(this.id, other.id);
    }

}
