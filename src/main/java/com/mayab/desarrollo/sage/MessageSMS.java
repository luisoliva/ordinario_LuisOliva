/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author luisoliva
 */
public class MessageSMS implements Sendable{

    @Override
    public void send(Gasto gasto, Bitacora bitacora, String destinatario) {
        System.out.println("\nNotificación de precio de compra excedido para " + destinatario + " enviado por SMS");
        System.out.println("Motivo de compra: " + gasto.motivo + "\n" + "Costo: " + gasto.costo);
        bitacora.logs.add(new Log(destinatario, gasto, "SMS"));    
    }
    
}
