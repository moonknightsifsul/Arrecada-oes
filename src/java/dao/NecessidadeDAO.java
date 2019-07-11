/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Necessidade;

/**
 *
 * @author Claudiomiro
 */
public class NecessidadeDAO extends GenericDAO<Necessidade, Long>{
    
    public NecessidadeDAO(){
        super(Necessidade.class);
    }
    
}
