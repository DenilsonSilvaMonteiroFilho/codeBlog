package com.spring.codeblog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_POST")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String autor;
    private LocalDate data;
    private String texto;

    public Long getId(){
        return this.id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void SetAutor(String newAutor){
        this.autor = newAutor;
    }

    public LocalDate getData(){
        return this.data;
    }

    public void setData(LocalDate newData){
        this.data = newData;
    }

    public String getTexto(){
        return this.texto;
    }

    public void setTexto(String newTexto){
        this.texto = newTexto;
    }
}
