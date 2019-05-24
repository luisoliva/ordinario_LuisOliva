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
public class DBB extends ManejadorDB {
    
    public DBB(){
        this.tipo="Base de datos tipo B";
    }

    @Override
    public void crearSentencia() {
        System.out.println("SENTENCIA -> select * from users where age=23    (los nombres de las tablas y columnas estan en minusculas)");
    }
    
}
