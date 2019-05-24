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
public class DBA extends ManejadorDB {
    
    public DBA(){
        this.tipo="Base de datos tipo A";
    }

    @Override
    public void crearSentencia() {
        System.out.println("SENTENCIA -> select * from USERS where AGE=23    (los nombres de las columnas y tablas estan en mayusculas)");
    }
    
}
