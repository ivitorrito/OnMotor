package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CURSOS")
public class Curso implements Serializable {

   @Id
@GeneratedValue
@Column(name="ID")
private int id;
    @Column(name="NOMBRE")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="PRECIO")
    private String precio;
    @Column(name="DESCUENTORECOMPRA")
    private String DesRecompra;
     @Column(name="DESCUENTONUEVOCLIENTE")
    private String DesNuevoCliente;
      @Column(name="RENTING")
    private String renting;
       @Column(name="MESES")
    private String Meses;
        @Column(name="PVPRENT")
    private String PvpRent;
           @Column(name="PRECIOMAQUINA")
    private String PrecioMaquina;
            @Column(name="COPIACOLOR")
    private String CopiaColor;
             @Column(name="COPIANEGRO")
    private String CopiaNegro;
              @Column(name="GARANTIAENMESES")
    private String GarantiaEnMeses;
               @Column(name="DESCUENTO1")
    private String Descuento1;
               @Column(name="PRECIO1")
    private String Precio1;
                @Column(name="DESCUENTO2")
    private String Descuento2;
                @Column(name="PRECIO2")
    private String Precio2;
                 @Column(name="DESCUENTO3")
    private String Descuento3;
                 @Column(name="PRECIO3")
    private String Precio3;

    public Curso() {
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDesRecompra() {
        return DesRecompra;
    }

    public void setDesRecompra(String DesRecompra) {
        this.DesRecompra = DesRecompra;
    }

    public String getDesNuevoCliente() {
        return DesNuevoCliente;
    }

    public void setDesNuevoCliente(String DesNuevoCliente) {
        this.DesNuevoCliente = DesNuevoCliente;
    }

    public String getRenting() {
        return renting;
    }

    public void setRenting(String renting) {
        this.renting = renting;
    }

    public String getMeses() {
        return Meses;
    }

    public void setMeses(String Meses) {
        this.Meses = Meses;
    }

    public String getPvpRent() {
        return PvpRent;
    }

    public void setPvpRent(String PvpRent) {
        this.PvpRent = PvpRent;
    }

    public String getPrecioMaquina() {
        return PrecioMaquina;
    }

    public void setPrecioMaquina(String PrecioMaquina) {
        this.PrecioMaquina = PrecioMaquina;
    }

    public String getCopiaColor() {
        return CopiaColor;
    }

    public void setCopiaColor(String CopiaColor) {
        this.CopiaColor = CopiaColor;
    }

    public String getCopiaNegro() {
        return CopiaNegro;
    }

    public void setCopiaNegro(String CopiaNegro) {
        this.CopiaNegro = CopiaNegro;
    }

    public String getGarantiaEnMeses() {
        return GarantiaEnMeses;
    }

    public void setGarantiaEnMeses(String GarantiaEnMeses) {
        this.GarantiaEnMeses = GarantiaEnMeses;
    }

    public String getDescuento1() {
        return Descuento1;
    }

    public void setDescuento1(String Descuento1) {
        this.Descuento1 = Descuento1;
    }

    public String getPrecio1() {
        return Precio1;
    }

    public void setPrecio1(String Precio1) {
        this.Precio1 = Precio1;
    }

    public String getDescuento2() {
        return Descuento2;
    }

    public void setDescuento2(String Descuento2) {
        this.Descuento2 = Descuento2;
    }

    public String getPrecio2() {
        return Precio2;
    }

    public void setPrecio2(String Precio2) {
        this.Precio2 = Precio2;
    }

    public String getDescuento3() {
        return Descuento3;
    }

    public void setDescuento3(String Descuento3) {
        this.Descuento3 = Descuento3;
    }

    public String getPrecio3() {
        return Precio3;
    }

    public void setPrecio3(String Precio3) {
        this.Precio3 = Precio3;
    }

    public Curso(int id, String nombre, String descripcion, String precio, String DesRecompra, String DesNuevoCliente, String renting, String Meses, String PvpRent, String PrecioMaquina, String CopiaColor, String CopiaNegro, String GarantiaEnMeses, String Descuento1, String Precio1, String Descuento2, String Precio2, String Descuento3, String Precio3) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.DesRecompra = DesRecompra;
        this.DesNuevoCliente = DesNuevoCliente;
        this.renting = renting;
        this.Meses = Meses;
        this.PvpRent = PvpRent;
        this.PrecioMaquina = PrecioMaquina;
        this.CopiaColor = CopiaColor;
        this.CopiaNegro = CopiaNegro;
        this.GarantiaEnMeses = GarantiaEnMeses;
        this.Descuento1 = Descuento1;
        this.Precio1 = Precio1;
        this.Descuento2 = Descuento2;
        this.Precio2 = Precio2;
        this.Descuento3 = Descuento3;
        this.Precio3 = Precio3;
    }

   

  
   
}