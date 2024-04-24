package com.dev.autohelp.Entities;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String rua;
    private String numero;

    private String complemento;

    private Long latitude;
    private Long longitude;
    @JoinColumn(name = "id_oficina")
    @OneToOne
    private Oficina oficina;

   @JoinColumn(name = "id_cliente")
   @OneToOne
    private Cliente cliente;


   @JoinColumn(name = "id_cidade")
   @ManyToOne
   private Cidade cidade;

    public Endereco(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

//    public Cidade getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(Cidade cidade) {
//        this.cidade = cidade;
//    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
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
}
