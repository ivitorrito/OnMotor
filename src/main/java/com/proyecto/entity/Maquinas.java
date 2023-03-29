
package com.proyecto.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAQUINAS")
public class Maquinas implements Serializable {

   @Id
@GeneratedValue
@Column(name="ID")
private int id;
    @Column(name="MAQUINA")
    private String Maquina;
    @Column(name="MODELO")
    private String Modelo;
    @Column(name="NUMEROSERIE")
    private String NumeroSerie;
    @Column(name="COPIAS")
    private String Copias;
     @Column(name="OBSERVACIONES")
    private String Observaciones;
      @Column(name="FECHAENTRADA")
    private String FechaEntrada;
      
      
      

    public Maquinas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaquina() {
        return Maquina;
    }

    public void setMaquina(String Maquina) {
        this.Maquina = Maquina;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public String getCopias() {
        return Copias;
    }

    public void setCopias(String Copias) {
        this.Copias = Copias;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public Maquinas(int id, String Maquina, String Modelo, String NumeroSerie, String Copias, String Observaciones, String FechaEntrada) {
        this.id = id;
        this.Maquina = Maquina;
        this.Modelo = Modelo;
        this.NumeroSerie = NumeroSerie;
        this.Copias = Copias;
        this.Observaciones = Observaciones;
        this.FechaEntrada = FechaEntrada;
    }
      
}