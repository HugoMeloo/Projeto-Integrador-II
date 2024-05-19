/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author hugog
 */
public class Tipo {

    String novoTipo;
    DefaultComboBoxModel novo;

    public void atualiza(DefaultComboBoxModel novo) {
        this.novo = novo;
    }

    public DefaultComboBoxModel getAtualizou() {
        return novo;
    }

    public String getNovoTipo() {
        return novoTipo;
    }

    public void setNovoTipo(String novoTipo) {
        this.novoTipo = novoTipo;
    }

}
