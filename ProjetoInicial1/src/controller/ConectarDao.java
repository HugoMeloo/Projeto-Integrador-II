package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import model.Item;
import model.Usuario;

public class ConectarDao {

    public Connection mycon = null;
    public String sql = null;

    public ConectarDao() {
        String strcon = "jdbc:mysql://localhost:3306/ProjCad";//cria a string de conexão ao servidor xaamp 
        try {

            mycon = DriverManager.getConnection(strcon, "root", "");
            this.criarBanco();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }

    public void criarBanco() {
        sql = " CREATE TABLE IF NOT EXISTS NIVEIS ("
                + "idNivel int not null AUTO_INCREMENT, "
                + "desNivel varchar(30) not null, "
                + "primary key (idNivel) ) ";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar table Nivel!\n" + err.getMessage());
        }
        sql = " CREATE TABLE IF NOT EXISTS USUARIOS ("
                + "cpf varchar (12) not null, "
                + "nome varchar(50) not null, "
                + "email varchar(50) not null, "
                + "celular varchar(20) not null,"
                + "idNivel int not null, senha varchar(20) not null,  "
                + "primary key (cpf) )";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Usuarios \n" + err.getMessage());
        }

        sql = " CREATE TABLE IF NOT EXISTS ITENS ("
                + "nomeItem varchar(50) not null, "
                + "quantidade int (50) not null, "
                + "precoUni int(50) not null,"
                + "codigoItem varchar(20) not null, "
                + "tipoItem int not null,"
                + "primary key (codigoItem)"
                + ");";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Itens \n" + err.getMessage());
        }
    }

    public void alterar(Usuario obj) {
        sql = "UPDATE USUARIOS SET nome = ?, email = ?, celular = ?, idnivel = ?" + ", senha = ? WHERE cpf = ?";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getEmail());
            ps.setString(3, obj.getCelular());
            ps.setInt(4, obj.getIdNivel());
            ps.setString(5, obj.getSenha());
            ps.setString(6, obj.getCpf());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao Alterar usuário!" + err.getMessage());
        }
    }

    public void alterarItem(Item obj) {
        sql = "UPDATE ITENS SET nomeItem = ?, quantidade = ?, precoUni = ?, codigoItem = ?, tipoItem = ?";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setString(1, obj.getProduto());
            ps.setDouble(2, obj.getQuantidade());
            ps.setDouble(3, obj.getPrecoUni());
            ps.setString(4, obj.getCodigoItem());
            ps.setInt(5, obj.getTipoItem());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Item Alterado com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao Alterar Item!" + err.getMessage());
        }
    }

}
