/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Eventos;

/**
 *
 * @author Claudiomiro
 */
public class EventosDAO  extends GenericDAO<Eventos, Long>{
    
    public EventosDAO(){
        super(Eventos.class);
    }
    
}
