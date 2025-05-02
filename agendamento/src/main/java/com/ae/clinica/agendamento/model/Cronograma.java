package com.ae.clinica.agendamento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "cronograma")
public class Cronograma implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_medico", referencedColumnName = "id", nullable = false)
    private Medico medico;

    @Column(name = "dia_semana", nullable = false)
    private String diaSemana;

    @Column(name = "hora_inicio", nullable = false)
    private Time horaInicio;

    @Column(name = "hora_fim", nullable = false)
    private Time horaFim;
    
    @Column(name = "hora_inicio_almoco", nullable = false)
    private Time horaInicioAlmoco;

    @Column(name = "hora_fim_almoco", nullable = false)
    private Time horaFimAlmoco;

    @Column(name = "duracao", nullable = true)
    private Time duracao;

    @Column(name = "quant_vagas", nullable = true)
    private Integer vagas;

    @Column(name = "situacao", nullable = false)
    private String situacao;

    public Cronograma() {
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

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

    public Time getHoraInicioAlmoco() {
        return horaInicioAlmoco;
    }

    public void setHoraInicioAlmoco(Time horaInicioAlmoco) {
        this.horaInicioAlmoco = horaInicioAlmoco;
    }

    public Time getHoraFimAlmoco() {
        return horaFimAlmoco;
    }

    public void setHoraFimAlmoco(Time horaFimAlmoco) {
        this.horaFimAlmoco = horaFimAlmoco;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Cronograma other = (Cronograma) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "CronogramaFixo{" + "id=" + id + ", medico=" + medico + ", diaSemana=" + diaSemana + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", horaInicioAlmoco=" + horaInicioAlmoco + ", horaFimAlmoco=" + horaFimAlmoco + ", duracao=" + duracao + ", vagas=" + vagas + ", situacao=" + situacao + '}';
    }
}
