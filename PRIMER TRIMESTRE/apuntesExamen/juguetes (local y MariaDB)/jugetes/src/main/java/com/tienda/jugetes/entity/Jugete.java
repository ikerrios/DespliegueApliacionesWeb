package com.tienda.jugetes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jugete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int cantidad;
    private String frase;


    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getFrase() {
        return frase;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
}
