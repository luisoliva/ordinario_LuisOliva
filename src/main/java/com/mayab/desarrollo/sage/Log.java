/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.util.ArrayList;

/**
 *
 * @author luisoliva
 */
public class Log {
    public String destinatario;
    public Gasto gasto;
    public String metodoDeEnvio;
    
    public Log (String destinatario, Gasto gasto, String metodoDeEnvio){
        this.destinatario=destinatario;
        this.gasto=gasto;
        this.metodoDeEnvio=metodoDeEnvio;
    }
    
}
