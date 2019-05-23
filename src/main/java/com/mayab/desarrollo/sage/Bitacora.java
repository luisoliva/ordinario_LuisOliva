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
public class Bitacora implements Observable{
    private ArrayList<Gasto> gastos;
    private ArrayList<Observer> personas;
    public ArrayList<Log> logs;
    
    public Bitacora(){
        this.gastos = new ArrayList();
        this.personas = new ArrayList();
        this.logs = new ArrayList();
    }
    
    public void setGasto(Gasto gasto){
        this.gastos.add(gasto);
        if (gasto.costo>100){
            notifyObservers();
        }
    }
    
    public void setPersona(Persona persona){
        addObserverToList(persona);
        persona.bitacora = this;
    }
    
    public Gasto getGasto(){
        return this.gastos.get(this.gastos.size()-1);
    }
    
    public void printLogs(){
        System.out.println("Logs de mensajes");
        for(int i=0;i<logs.size();i++){
            System.out.println("Mensaje via " + logs.get(i).metodoDeEnvio + " para " + this.logs.get(i).destinatario + " por exceso de precio en compra de " + this.logs.get(i).gasto.motivo + " con costo de " + this.logs.get(i).gasto.costo); 
        }
    }
    
   public void printReport(){
        System.out.println("Reporte de compras");
        for(int i=0;i<gastos.size();i++){
            System.out.println("motivo->" + this.gastos.get(i).motivo + "   Costo->" + this.gastos.get(i).costo); 
        }
    }

    @Override
    public void addObserverToList(Observer observer) {
        this.personas.add(observer);
    }

    @Override
    public void deleteObserverFromList(Observer observer) {
        this.personas.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<personas.size();i++){
            personas.get(i).update();
            
        }
    }

    @Override
    public void pauseNotifications() {
        for(int i=0;i<personas.size();i++){
            personas.clear();
        }
    }
    
}
