/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.model;

import java.sql.Date;

/**
 *
 * @author luan
 */
public class CarroModel {
    private int idCarro;
    private String modeloCarro;
    private String corDoCarro;
    private Date anoCarro;
    private int quantosCavalos;
    private String acabamento;
    private String comandoDeBordo;
    private String arosCarros;

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public Date getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(Date anoCarro) {
        this.anoCarro = anoCarro;
    }

    public int getQuantosCavalos() {
        return quantosCavalos;
    }

    public void setQuantosCavalos(int quantosCavalos) {
        this.quantosCavalos = quantosCavalos;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public String getComandoDeBordo() {
        return comandoDeBordo;
    }

    public void setComandoDeBordo(String comandoDeBordo) {
        this.comandoDeBordo = comandoDeBordo;
    }

    public String getArosCarros() {
        return arosCarros;
    }

    public void setArosCarros(String arosCarros) {
        this.arosCarros = arosCarros;
    }

  
   
    
    
}
