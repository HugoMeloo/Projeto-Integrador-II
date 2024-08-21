/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Tipo;

/**
 *
 * @author hugog
 */
public class TiposDao extends ConectarDao {

    private PreparedStatement ps;// objeto de preparação do comando SQL

    public ResultSet buscarTipo(Tipo obj) {
        // para buscar um registro especifico cria-se um sql com um parãmetro chave
        // no caso a busca está sendo feita pelo tipo do item
        sql = "SELECT * FROM TIPOS WHERE novoTipo = ?";
        try {   // liga o sql com a conexão atraveś do objeto ps
            ps = mycon.prepareStatement(sql);

            // configura o único parametro existente
            ps.setString(1, obj.getNovoTipo());

            // retorna o registro selecionado
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar tipo!" + err.getMessage());
            return null;
        }
    }

    public void incluirTipo(Tipo obj) {
        sql = "INSERT INTO TIPOS (novoTipo) VALUES (?)";

        try {

            // Envia o SQL para dentro da conexão
            ps = mycon.prepareStatement(sql);

            // Configura a posição de cada parâmetro começando pelo primeiro
            ps.setString(1, obj.getNovoTipo());

            ps.execute(); // Finalmente executa o comando sql dentro de ps
            ps.close();// finaliza o comando de execução do sql

            JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir tipo!" + err.getMessage());
        }
    }

    public void excluirTipo(String textTipo) {
        if (!textTipo.isEmpty()) {
            // configura o comando sql de exclusão delete por cpf
            sql = "DELETE FROM TIPOS WHERE novoTipo = '" + textTipo + "'";

            try { // envia o comando sql para dentro da conexão através de ps
                ps = mycon.prepareStatement(sql);
                // executa o comando delete dentro do mysql
                ps.execute();

                ps.close(); // fecha o objeto usado para executar o comando sql

                JOptionPane.showMessageDialog(null, "Tipo Excluido com Sucesso!");
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Tipo!" + err.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um tipo válido!");

        }
    }
}
