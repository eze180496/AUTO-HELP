package com.dev.autohelp.Entities;

import com.dev.autohelp.enums.StatusDisponibilidade;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Oficina extends Usuario {
  private String CNPJ;
    private Double taxaReboqueKM;
    private Double taxaMecanicoKM;
   private StatusDisponibilidade statusDisponibilidade;
//
//
    @OneToMany(mappedBy = "oficina")
  private List<VinculoMecanicoOficina> vinculoMecanicoOficinas = new ArrayList<>();
//
@OneToOne(mappedBy = "oficina")
  private Endereco endereco;
//
   @OneToMany(mappedBy = "oficina")
    private List<SocorroAumotivo> socorroAumotivos = new ArrayList<>();
    public Oficina(){}



    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Double getTaxaReboqueKM() {
        return taxaReboqueKM;
    }

    public void setTaxaReboqueKM(Double taxaReboqueKM) {
        this.taxaReboqueKM = taxaReboqueKM;
    }

    public Double getTaxaMecanicoKM() {
        return taxaMecanicoKM;
    }

    public void setTaxaMecanicoKM(Double taxaMecanicoKM) {
        this.taxaMecanicoKM = taxaMecanicoKM;
    }

    public StatusDisponibilidade getStatusDisponibilidade() {
        return statusDisponibilidade;
    }

    public void setStatusDisponibilidade(StatusDisponibilidade statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<SocorroAumotivo> getSocorroAumotivos() {
        return socorroAumotivos;
    }

    public void setSocorroAumotivos(List<SocorroAumotivo> socorroAumotivos) {
        this.socorroAumotivos = socorroAumotivos;
    }

    public List<VinculoMecanicoOficina> getVinculoMecanicoOficinas() {
        return vinculoMecanicoOficinas;
    }

    public void setVinculoMecanicoOficinas(List<VinculoMecanicoOficina> vinculoMecanicoOficinas) {
        this.vinculoMecanicoOficinas = vinculoMecanicoOficinas;
    }
}
