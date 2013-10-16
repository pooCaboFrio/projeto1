package visao;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Rosenhaim
 */
public class JanelaPrincipal extends JFrame{
    
    JMenu                       cadastros, utilitarios;
    JMenuBar                    barraMenu;
    JMenuItem                   cadastroPessoa, cadastroCarro, calculadoraWindows, calculadoraJFrame;
    FormularioCadastroCarro     janelaCarro;
    FormularioCadastroPessoa    janelaPessoa;
    CalculadoraJFrame           calculadora;
    
    public JanelaPrincipal(){
        super("PROGRAMA MENUS : CADASTROS E USO DE UTILITÁRIOS");
         iniciarComponentes();
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         this.setLocation(100,100);
         this.setSize(500, 350);
    }
    
    public void iniciarComponentes(){
        
        cadastros           =   new JMenu("Cadastros");
        utilitarios         =   new JMenu("Utilitarios");
        barraMenu           =   new JMenuBar();
        cadastroPessoa      =   new JMenuItem("Formulário para cadastro de Pessoas");
        cadastroCarro       =   new JMenuItem("Formulário para cadastro de Carros");
        calculadoraWindows  =   new JMenuItem("Calculadora do Windows");
        calculadoraJFrame   =   new JMenuItem("Calculadora do JFrame");
        janelaPessoa        =   FormularioCadastroPessoa.getInstance();
        janelaCarro         =   FormularioCadastroCarro.getInstance();
        calculadora         =   CalculadoraJFrame.getInstance();
        cadastros.add(cadastroPessoa);
        cadastros.add(cadastroCarro);
        utilitarios.add(calculadoraWindows);
        utilitarios.add(calculadoraJFrame);
        barraMenu.add(cadastros);
        barraMenu.add(utilitarios);
        
        this.setJMenuBar(barraMenu);
        
        cadastroPessoa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                janelaCarro.setVisible(false);
                janelaCarro.limpaCampos();
                janelaPessoa.setVisible(true);
                add(janelaPessoa);
            }
        });
        
        cadastroCarro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                janelaPessoa.setVisible(false);
                janelaPessoa.limpaCampos();
                janelaCarro.setVisible(true);
                add(janelaCarro);
            }
        });
        
        calculadoraWindows.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("calc");  
                } catch (IOException ex) {
                    Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
          
           
                 
            }
        });
        
        calculadoraJFrame.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setVisible(true);
            }
        });
    }
}
