/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao;

import java.awt.Toolkit;
import java.awt.Dimension;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class InteracaoPrincipal {

    private JFrame JFrame_principal;
    private JTabbedPane jTabbedPane_colecoes;

    public InteracaoPrincipal() {
        this.newStyle();
        this.JFrame_principal = new JFrame();
        this.jTabbedPane_colecoes = new JTabbedPane();
        this.painelColecoes();
    }

    public void iniciar() {
        this.JFrame_principal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.JFrame_principal.setTitle("Biblioteca de mídias");
        GroupLayout layout = new GroupLayout(this.JFrame_principal.getContentPane());
        this.JFrame_principal.getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jTabbedPane_colecoes));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jTabbedPane_colecoes));

        this.JFrame_principal.pack();
        this.JFrame_principal.setLocationRelativeTo(null);
        this.JFrame_principal.setVisible(true);
    }

    private void painelColecoes() {
        jTabbedPane_colecoes.setTabPlacement(JTabbedPane.LEFT);
        jTabbedPane_colecoes.setSelectedIndex(-1);
    }

    public static String carregarArquivo() {

        File arquivo;

        JFileChooser chooser = new JFileChooser();

        FileFilter filter = new FileNameExtensionFilter("Arquivo de texto", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);

        int retorno = chooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
            return arquivo.getPath();
        }

        return null;
    }

    public JTabbedPane getjTabbedPane_colecoes() {
        return jTabbedPane_colecoes;
    }

    private void newStyle() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(InteracaoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
