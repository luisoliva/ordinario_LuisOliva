/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author luisoliva
 */
public abstract class ManejadorDB {
    public String tipo;
    
    public void abrirConexion(){
        System.out.println("Abriendo conexion con base de datos");
    }
    
    public abstract void crearSentencia();
    
    public void ejecutarSentencia(){
        System.out.println("Ejecutando sentencia");
    }
    
    public void guardarDatos(){
        abrirConexion();
        crearSentencia();
        ejecutarSentencia();
    }
    
    
}
