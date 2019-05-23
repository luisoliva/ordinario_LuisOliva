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
public interface Observable {
    public void addObserverToList(Observer observer);
    public void deleteObserverFromList(Observer observer);
    public void notifyObservers();
    public void pauseNotifications();
}
