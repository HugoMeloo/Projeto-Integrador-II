/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hugog
 */
public class Item {

    private String produto;
    private double  quantidade;
    private double precoUni;
    private String codigoIten;
    private int tipoItem;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUni() {
        return precoUni;
    }

    public void setPreco(double precoUni) {
        this.precoUni = precoUni;
    }

    public String getCodigoItem() {
        return codigoIten;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoIten = codigoItem;
    }

    public int getTipoItem() {
        return tipoItem;
    }

    public void setIdItem(int tipoItem) {
        this.tipoItem = tipoItem;
    }

}
