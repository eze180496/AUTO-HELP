package com.dev.autohelp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Mecanico extends Usuario{

 @OneToMany(mappedBy = "mecanico")
 private List<VinculoMecanicoOficina> vinculoMecanicoOficinas = new ArrayList<>();
//
   @OneToMany(mappedBy = "mecanico")
   private List<SocorroAumotivo> servicosFeitos = new ArrayList<>();


    public  Mecanico(){}

    public List<SocorroAumotivo> getServicosFeitos() {
        return servicosFeitos;
    }

    public void setServicosFeitos(List<SocorroAumotivo> servicosFeitos) {
        this.servicosFeitos = servicosFeitos;
    }

    public List<VinculoMecanicoOficina> getVinculoMecanicoOficinas() {
        return vinculoMecanicoOficinas;
    }

    public void setVinculoMecanicoOficinas(List<VinculoMecanicoOficina> vinculoMecanicoOficinas) {
        this.vinculoMecanicoOficinas = vinculoMecanicoOficinas;
    }
}
