package com.urielnav.sample_inventory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sample")
public class SampleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID autoincremental
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String tipo;
    private int bpm;
    private String tonalidad;
    private String urlDemo;

    // Constructor vacío (obligatorio para JPA)
    public SampleModel() {
    }

    // Constructor con datos
    public SampleModel(String nombre, String tipo, int bpm, String tonalidad, String urlDemo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.bpm = bpm;
        this.tonalidad = tonalidad;
        this.urlDemo = urlDemo;
    }

    // Getters y Setters (obligatorios para el JSON)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getBpm() { return bpm; }
    public void setBpm(int bpm) { this.bpm = bpm; }

    public String getTonalidad() { return tonalidad; }
    public void setTonalidad(String tonalidad) { this.tonalidad = tonalidad; }

    public String getUrlDemo() { return urlDemo; }
    public void setUrlDemo(String urlDemo) { this.urlDemo = urlDemo; }

}
