package com.dev.autohelp.Entities;

import jakarta.persistence.*;

@Entity
public class VinculoMecanicoOficina {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;

   @JoinColumn(name = "id_mecanico")
  @ManyToOne
 private  Mecanico mecanico;

  @JoinColumn(name = "id_oficina")
  @ManyToOne
  private Oficina oficina;

    public VinculoMecanicoOficina(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
}
