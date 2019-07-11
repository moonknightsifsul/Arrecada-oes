/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Claudiomiro
 */
public class Doacao {
    private Integer id;
    private String descrissao_item;
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrissao_item() {
        return descrissao_item;
    }

    public void setDescrissao_item(String descrissao_item) {
        this.descrissao_item = descrissao_item;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
   
    
}
