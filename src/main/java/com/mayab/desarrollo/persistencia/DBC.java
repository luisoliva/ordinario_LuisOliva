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
public class DBC extends ManejadorDB{
    
    public DBC(){
        this.tipo="Base de datos tipo C";
    }

    @Override
    public void crearSentencia() {
        System.out.println("select * from USERS where age=23");
    }
    
}
