package com.ae.clinica.agendamento.dto.data;

import java.io.Serializable;
import java.util.Objects;

public class EspecialidadeDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nomeEspecialidade;
    private String descricao;

    public EspecialidadeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final EspecialidadeDTO other = (EspecialidadeDTO) obj;
        return Objects.equals(this.id, other.id);
    }
}
