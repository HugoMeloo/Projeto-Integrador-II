/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author hugog
 */
public class Usuariodao extends ConectarDao {

    private PreparedStatement ps;// objeto de preparação do comando SQL

    public Usuariodao() {
        super(); // Executa construtor da classe mãe
    }

    public void incluir(Usuario obj) {

        /*Cria o comando SQL com 5 parâmetros ?, ?, ?, ?, ? */
        sql = "INSERT INTO USUARIOS VALUES (?, ?, ?, ?, ?, ?)";

        try {

            // Envia o SQL para dentro da conexão
            ps = mycon.prepareStatement(sql);

            // Configura a posição de cada parâmetro começando pelo primeiro
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getCpf());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getCelular());
            ps.setInt(5, obj.getIdNivel());
            ps.setString(6, obj.getSenha());
            ps.execute(); // Finalmente executa o comando sql dentro de ps
            ps.close();// finaliza o comando de execução do sql

            JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário!" + err.getMessage());
        }
    }

// Resultset armazena um array de registros   
    public ResultSet validarLogin(String login, String senha) {
        // cria o comando sql para executar dentro do MySQL
        sql = "SELECT * , if(idnivel = 1, 'Gerente', 'Operador') as nivel "
                + "FROM USUARIOS WHERE ucase(email) = ucase('" + login + "') "
                + "and senha = ucase('" + senha + "')";

        try {   // prepara a execução do comando sql dentro da conexão mycon
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery(); // retorna a execução do comando sql 

            // toda consulta em banco de dados deve ter um tratamento de erros
            // A classe SQLException faz o tratamento de erros
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            return null;
            // se haver erro armazena null na ResultSet
        }
    }

    public ResultSet buscartodos() {
        // o comando select traz um conjunto de registros
        // e armazena dentro de um ResultSet
        sql = "SELECT * FROM USUARIOS ORDER BY nome ";

        try {   // armazena o comando sql dentro da conexão mycon
            ps = mycon.prepareStatement(sql);

            // retorna um ResultSet com os registros selecionados
            return ps.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            // Se haver erros exibe a mensagem e returno nulo dentro 
            // do ResultSet
            return null;
        }
    }

    public ResultSet buscar(Usuario obj) {
        // para buscar um registro especifico cria-se um sql com um parãmetro chave
        // no caso a busca está sendo feita pelo cpf do usuario
        sql = "SELECT * FROM USUARIOS WHERE CPF = ?";

        try {   // liga o sql com a conexão atraveś do objeto ps
            ps = mycon.prepareStatement(sql);

            // configura o único parametro existente
            ps.setString(1, obj.getCpf());

            // retorna o registro selecionado
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            return null;
        }
    }

    public void excluir(String cpf) {
        if (!cpf.isEmpty()) {
            // configura o comando sql de exclusão delete por cpf
            sql = "DELETE FROM USUARIOS WHERE CPF = '" + cpf + "'";

            try { // envia o comando sql para dentro da conexão através de ps
                ps = mycon.prepareStatement(sql);
                // executa o comando delete dentro do mysql
                ps.execute();

                ps.close(); // fecha o objeto usado para executar o comando sql

                JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir usuário!" + err.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Escolha um usuário válido!");

        }
    }
}
