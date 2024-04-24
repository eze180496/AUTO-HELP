package com.dev.autohelp.Entities;

import com.dev.autohelp.enums.TipoAutomovel;
import jakarta.persistence.*;

@Entity
public class Automovel {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private TipoAutomovel tipoAutomovel;
    private String descricaoTipoAutomovel;
    private String placa;
    private String cor;

    @JoinColumn(name = "id_cliente")
    @ManyToOne
    private Cliente dono;


    public Automovel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(TipoAutomovel tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public String getDescricaoTipoAutomovel() {
        return descricaoTipoAutomovel;
    }

    public void setDescricaoTipoAutomovel(String descricaoTipoAutomovel) {
        this.descricaoTipoAutomovel = descricaoTipoAutomovel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public Cliente getDono() {
        return dono;
   }
//
    public void setDono(Cliente dono) {
        this.dono = dono;
    }
}
