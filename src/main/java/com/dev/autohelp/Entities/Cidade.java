package com.dev.autohelp.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;
//
      @OneToMany(mappedBy = "cidade")
  private List<Endereco> enderecosOficinas = new ArrayList<>();
//
    public Cidade(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Endereco> getEnderecosOficinas() {
        return enderecosOficinas;
    }

    public void setEnderecosOficinas(List<Endereco> enderecosOficinas) {
        this.enderecosOficinas = enderecosOficinas;
    }
}
