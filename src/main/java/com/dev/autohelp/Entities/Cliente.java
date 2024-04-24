package com.dev.autohelp.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Usuario  {
    @NotBlank
    private String cpf;
    @NotBlank
    private String rg;
   @OneToMany(mappedBy = "dono")
   private List<Automovel> automovels = new ArrayList<>();
   @OneToMany(mappedBy = "cliente")
    private List<SocorroAumotivo> listaServicsRecebidos = new ArrayList<>();

   @OneToOne(mappedBy = "cliente")
   private Endereco  endereco;
    public Cliente(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Automovel> getAutomovels() {
        return automovels;
    }

    public void setAutomovels(List<Automovel> automovels) {
        this.automovels = automovels;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<SocorroAumotivo> getListaServicsRecebidos() {
        return listaServicsRecebidos;
    }

    public void setListaServicsRecebidos(List<SocorroAumotivo> listaServicsRecebidos) {
        this.listaServicsRecebidos = listaServicsRecebidos;
    }
}
