/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ConectarDao;
import controller.Itensdao;
import controller.TiposDao;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import model.Item;
import model.Tipo;
import view.Menu;

/**
 *
 * @author hugog
 */
public class FormProdutos extends javax.swing.JFrame {

    /**
     * Creates new form FormProdutos
     */
    public FormProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPreco = new javax.swing.JTextField();
        bntCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        textCod = new javax.swing.JTextField();
        btnOrd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textProduto1 = new javax.swing.JScrollPane();
        textProduto = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        btnP = new javax.swing.JButton();
        textTipo = new javax.swing.JTextField();
        btnExcluirTipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Operação");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Descrição do Item:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Preço unitário");

        bntCadastrar.setText("CADASTRAR");
        bntCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntCadastrarMouseClicked(evt);
            }
        });
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Código do Item:");

        btnNext.setText("Voltar ao Menu");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnOrd.setText("Ordenar por Tipos");
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Item", "Nome do Item", "Preço Unitário", "Quantidade", "Tipo do Item"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("Excluir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jButton2.setText("BUSCAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textProduto.setColumns(20);
        textProduto.setRows(5);
        textProduto1.setViewportView(textProduto);

        jButton3.setText("Inserir Tipo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tipo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tipo.setText("Insira um novo tipo:");
        tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnP.setText("INSERIR");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        textTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoActionPerformed(evt);
            }
        });

        btnExcluirTipo.setText("EXCLUIR TIPO");
        btnExcluirTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textProduto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                        .addComponent(textCod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirTipo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tipo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrd)))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluirTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(btnP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tipo.setVisible(false);
        btnP.setVisible(false);
        textTipo.setVisible(false);
        btnExcluirTipo.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void carregar_Item() {
        // método criado para carregar itens no jtable 
        // do formulário de itens

        // captura o modelo definido do jtable no formulário de usuários
        DefaultTableModel mytbmodel = (DefaultTableModel) jTable1.getModel();

        // instancia a classe Itensdao para executar o método buscartodos()
        Itensdao item = new Itensdao();

        // chama o método para buscar todos os registros da tabela usuário
        // armazena dentro de um objeto ResultSet
        ResultSet resul = item.buscartodosItem();
        try {

            // apagar todas as linhas do Jtable
            while (jTable1.getModel().getRowCount() > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(0);
            }

// laço para pegar os registros retornadas na ResultSet resul
            while (resul.next()) {
                // cria um array para armazenar cada linha com os 4 campos
                // puxados da tabela resul de usuários

                Object[] linhas
                        = {
                            resul.getString("codigoItem"),
                            resul.getString("nomeItem"),
                            resul.getDouble("precoUni"),
                            resul.getDouble("quantidade"),
                            resul.getString("tipoItem"),};

                // adiciona uma linha de cada vez no jtable de usuaŕios
                mytbmodel.addRow(linhas);
            }

            // posiciona o focus no textPoduto
            this.textProduto1.grabFocus();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }

    }


    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /* busca a linha selecionada no jTable1 */
        int linhasel = this.jTable1.getSelectedRow();
        int colunachave = 0; // configura coluna como 0,isto é, a primeira coluna
        Object chave = this.jTable1.getModel().getValueAt(linhasel, colunachave);
        /* Informações Relevantes sobre capturar dados do Jcombobox:
 Pegar pelo índice : this.cmbnivel.setSelectedIndex(resul.getInt("idnivel"));
 Pegar pelo item : this.cmbnivel.setSelectedItem("Operador");
 Número da linha : this.cmbnivel.setSelectedIndex(jTable1.getSelectedRow());*/
        Item obj = new Item();
        obj.setCodigoItem((String) chave);
        Itensdao item = new Itensdao();
        ResultSet resul = item.buscarItem(obj);
        try {
            if (resul.next()) {
                this.textCod.setText(resul.getString("codigoItem"));
                this.textProduto.setText(resul.getString("nomeItem"));
                this.textPreco.setText(resul.getString("precoUni"));
                this.textQuantidade.setText(resul.getString("quantidade"));
                this.cmbTipo.setSelectedIndex(resul.getInt("tipoItem"));//bo tá aqui
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                this.textCod.grabFocus();
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao navegar na Jtable! ");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void bntCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCadastrarMouseClicked
        /* Antes de mais nada, instancie o objeto Lu a partir da classe Usuario */
        Item it = new Item();
        /* Antes da persistência, enviaremos os dados para o objeto Lu primeiro */
        if (camposItensPreenchidos()) {
            it.setCodigoItem(this.textCod.getText());
            it.setProduto(this.textProduto.getText());
            it.setQuantidade(Double.parseDouble(this.textQuantidade.getText()));
            it.setPreco(Double.parseDouble(this.textPreco.getText()));
            it.setIdItem(this.cmbTipo.getSelectedIndex());

            /* Para persistir, usaremos o objeto U1 da classe UsuarioDao */
            Itensdao item = new Itensdao();
            /* Para verificar se o usuário existe buscamos o cpf primeiro */
            ResultSet resul = item.buscarItem(it);
            try {

                if (resul.next()) {
                    item.alterarItem(it);// caso exista chama u1.alterar()
                } else {
                    item.incluirItem(it);// se não existir chama o u1.incluir()
                }

            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null,
                        err.getMessage());
            }
            /* Preenche o Jtable no form */
            this.carregar_Item();
        }
    }//GEN-LAST:event_bntCadastrarMouseClicked

    private boolean camposItensPreenchidos() {
        if (textCod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Código.");
            textCod.requestFocus(); // Foca no campo Código
            return false;
        }
        if (textProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Produto.");
            textProduto.requestFocus(); // Foca no campo Produto
            return false;
        }

        if (textPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Preço.");
            textPreco.requestFocus(); // Foca no campo Preço
            return false;
        }
        if (textQuantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Quantidade.");
            textQuantidade.requestFocus(); // Foca no campo Quantidade
            return false;
        }

        if (cmbTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um tipo.");
            cmbTipo.requestFocus(); // Foca no ComboBox cmbTipo
            return false;
        }
        return true;
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        Menu objBusca = new Menu();
        objBusca.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnNextActionPerformed
    public PreparedStatement ps;// objeto de preparação do comando SQL
    public String sql = null;
    public Connection mycon = null;

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel<String> myModel = new DefaultComboBoxModel<>();
        cmbTipo.setModel(myModel);
        String strcon = "jdbc:mysql://localhost:3306/projcad"; // Inclua o nome do seu banco de dados
        try {
            mycon = DriverManager.getConnection(strcon, "root", "");
            mycon.setCatalog("projcad"); // Selecione o banco de dados
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com MySQL não realizada!\n" + ex.getMessage());
        }
        try {
            ps = mycon.prepareStatement("SELECT * FROM TIPOS");

            ResultSet rs = ps.executeQuery();

            myModel.addElement(""); // Adiciona um elemento vazio
            myModel.addElement("Acessórios");
            myModel.addElement("Elétricos");
            myModel.addElement("Mecânicos");

            while (rs.next()) {
                String tipo = rs.getString("novoTipo");
                myModel.addElement(tipo);

            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar tabela TIPOS!\n" + err.getMessage());
        }
        carregar_Item();
     }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Itensdao it = new Itensdao();
        it.excluirItem(textCod.getText());
        this.carregar_Item();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        //preenche todos os campos do 
        this.textProduto.setText("");
        this.textQuantidade.setText("");
        this.textPreco.setText("");
        this.textCod.setText("");
        this.cmbTipo.setSelectedIndex(0);
        this.textProduto1.grabFocus();


    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
// instancia a classe Usuario model
        Item obj = new Item();
        // executa o método setcpf para preencher o cpf

        obj.setCodigoItem(this.textCod.getText());
        // instancia o objeto Controller Usariodao
        Itensdao it = new Itensdao();

        // executa o método buscar e coloca os registros dentro 
        // do ResultSet resul 
        ResultSet resul = it.buscarItem(obj);

        try {
            if (resul.next()) {
                // se o registro foi encontrado preenche os campos do formulário usuários
                this.textCod.setText(resul.getString("codigoItem"));
                this.textProduto.setText(resul.getString("nomeItem"));
                this.textPreco.setText(resul.getString("precoUni"));
                this.textQuantidade.setText(resul.getString("quantidade"));
                this.cmbTipo.setSelectedIndex(resul.getInt("tipoItem"));
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
                this.textCod.grabFocus();
            }

        } catch (SQLException err) {

        }     }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        // método criado para carregar itens no jtable 
        // do formulário de itens
        Item obj = new Item();

        // captura o modelo definido do jtable no formulário de usuários
        DefaultTableModel mytbmodel = (DefaultTableModel) jTable1.getModel();

        obj.setIdItem(this.cmbTipo.getSelectedIndex());

        // instancia o objeto Controller Usariodao
        Itensdao it = new Itensdao();

        // executa o método buscar e coloca os registros dentro 
        // do ResultSet resul 
        ResultSet resul = it.buscartodosTipos(obj);
        try {

            // apagar todas as linhas do Jtable
            while (jTable1.getModel().getRowCount() > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(0);
            }

// laço para pegar os registros retornadas na ResultSet resul
            while (resul.next()) {
                // cria um array para armazenar cada linha com os 4 campos
                // puxados da tabela resul de usuários

                Object[] linhas
                        = {
                            resul.getString("nomeItem"),
                            resul.getDouble("quantidade"),
                            resul.getDouble("precoUni"),
                            resul.getString("codigoItem"),
                            resul.getString("tipoItem"),};

                // adiciona uma linha de cada vez no jtable de usuaŕios
                mytbmodel.addRow(linhas);
            }

            // posiciona o focus no textPoduto
            this.textProduto1.grabFocus();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }//GEN-LAST:event_btnOrdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setVisible(false);
        textTipo.setVisible(true);
        tipo.setVisible(true);
        btnP.setVisible(true);
        btnExcluirTipo.setVisible(true);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void textTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoActionPerformed

    private boolean camposTiposPreenchidos() {
        if (textTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o tipo.");
            textTipo.requestFocus(); // Foca no campo Código
            return false;
        }
        return true;
    }

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed

        Tipo it = new Tipo();
        /* Antes da persistência, enviaremos os dados para o objeto Lu primeiro */
        if (camposTiposPreenchidos()) {
            it.setNovoTipo(this.textTipo.getText());

            TiposDao tipo = new TiposDao();
            ResultSet resul = tipo.buscarTipo(it);
            try {

                if (resul.next()) {
                    tipo.alterarTipo(it);// caso exista chama u1.alterar()
                } else {
                    tipo.incluirTipo(it);// se não existir chama o u1.incluir()
                }

            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null,
                        err.getMessage());
            }
            DefaultComboBoxModel<String> myModel = new DefaultComboBoxModel<>();
            cmbTipo.setModel(myModel);
            String strcon = "jdbc:mysql://localhost:3306/projcad"; // Inclua o nome do seu banco de dados
            try {
                mycon = DriverManager.getConnection(strcon, "root", "");
                mycon.setCatalog("projcad"); // Selecione o banco de dados
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Conexão com MySQL não realizada!\n" + ex.getMessage());
            }
            try {
                ps = mycon.prepareStatement("SELECT * FROM TIPOS");

                ResultSet rs = ps.executeQuery();

                myModel.addElement(""); // Adiciona um elemento vazio
                myModel.addElement("Acessórios");
                myModel.addElement("Elétricos");
                myModel.addElement("Mecânicos");

                while (rs.next()) {
                    String tipo1 = rs.getString("novoTipo");
                    myModel.addElement(tipo1);

                }
                ps.close();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao selecionar tabela TIPOS!\n" + err.getMessage());
            }
            carregar_Item();
        }
    }//GEN-LAST:event_btnPActionPerformed

    private void btnExcluirTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTipoActionPerformed
        TiposDao it = new TiposDao();
        it.excluirTipo(textTipo.getText());
        DefaultComboBoxModel<String> myModel = new DefaultComboBoxModel<>();
        cmbTipo.setModel(myModel);
        String strcon = "jdbc:mysql://localhost:3306/projcad"; // Inclua o nome do seu banco de dados
        try {
            mycon = DriverManager.getConnection(strcon, "root", "");
            mycon.setCatalog("projcad"); // Selecione o banco de dados
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com MySQL não realizada!\n" + ex.getMessage());
        }
        try {
            ps = mycon.prepareStatement("SELECT * FROM TIPOS");

            ResultSet rs = ps.executeQuery();

            myModel.addElement(""); // Adiciona um elemento vazio
            myModel.addElement("Acessórios");
            myModel.addElement("Elétricos");
            myModel.addElement("Mecânicos");

            while (rs.next()) {
                String tipo1 = rs.getString("novoTipo");
                myModel.addElement(tipo1);

            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar tabela TIPOS!\n" + err.getMessage());
        }
        carregar_Item();


    }//GEN-LAST:event_btnExcluirTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton btnExcluirTipo;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnP;
    public javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textCod;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextArea textProduto;
    private javax.swing.JScrollPane textProduto1;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JTextField textTipo;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables

    private String getText(DefaultComboBoxModel<String> myModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
