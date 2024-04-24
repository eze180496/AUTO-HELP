package com.dev.autohelp.Entities;

import com.dev.autohelp.enums.StatusSolicitacao;
import com.dev.autohelp.enums.TipoSolicitacao;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class SocorroAumotivo {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "id_cliente")
    @ManyToOne
    private Cliente cliente;
//
    @JoinColumn(name = "id_oficina")
    @ManyToOne
    private Oficina oficina;
//
    @JoinColumn(name = "id_mecanico")
    @ManyToOne
    private Mecanico mecanico;
   private LocalDateTime dataServico;
    private TipoSolicitacao tipoSolicitacao;
  private StatusSolicitacao  statusSolicitacao;

  public SocorroAumotivo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public LocalDateTime getDataServico() {
        return dataServico;
    }

    public void setDataServico(LocalDateTime dataServico) {
        this.dataServico = dataServico;
    }

    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }
}
