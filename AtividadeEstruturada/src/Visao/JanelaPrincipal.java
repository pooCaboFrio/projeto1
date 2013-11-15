package Visao;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import javax.swing.*;


public class JanelaPrincipal extends JFrame{
    JMenuBar                mBar; 
    JMenu                   m1,m2,m3,m31,m32, m4, m5; 
    JMenuItem               a11,a12, a4, a5, a2;
    JanelaThread1           janelaThread;
    CadastroCliente         cadastroCliente;
    CadastroFilme           cadastroFilme;
    PesquisaFilmes          pesquisa;
    JanelaCombustivel       janelaComb;
    
    Font                    fonte;
    Color                   cor;
    
   
    
    ButtonGroup             gCor,gFonte;
    JRadioButtonMenuItem    cVermelho,cAzul,cAmarelo,fVermelho,fAzul,fAmarelo;
    
    
    public void setCor(Color c){
        
        mBar.setBackground(c);
    }
    
    public void setFonte(){
        
    }
    
    
    public JanelaPrincipal(){ 
        
        iniciarComponentes(); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setSize(600, 600); 
        this.setVisible(true); 
          
    } 
      
    public void iniciarComponentes(){ 
        
        fonte           = new Font("Courier",Font.PLAIN,12);
        cor             = new Color(0,0,0);
        
        mBar            = new JMenuBar(); 
        m1              = new JMenu("Cadastro"); 
        m2              = new JMenu("Seleção de Filmes"); 
        m3              = new JMenu("Layout"); 
        m4              = new JMenu("Threads"); 
        m5              = new JMenu("Combustível");
              
        a11             = new JMenuItem("Cliente"); 
        a12             = new JMenuItem("Filme");
        a4              = new JMenuItem("Usando Threads");
        a5              = new JMenuItem("Combustível");
        a2             = new JMenuItem("Pesquisa");
        m31             = new JMenu("Cor do Fundo");
        m32             = new JMenu("Cor da Fonte");
        
        gCor            = new ButtonGroup();
        gFonte          = new ButtonGroup();
        
        cVermelho       = new JRadioButtonMenuItem("Vermelho");
        cAzul           = new JRadioButtonMenuItem("Azul");
        cAmarelo        = new JRadioButtonMenuItem("Amarelo");
        fVermelho       = new JRadioButtonMenuItem("Vermelho");
        fAzul           = new JRadioButtonMenuItem("Azul");
        fAmarelo        = new JRadioButtonMenuItem("Amarelo");
        
        janelaThread    = new JanelaThread1();
        cadastroCliente = new CadastroCliente();
        cadastroFilme   = new CadastroFilme();
        pesquisa        = new PesquisaFilmes();
        janelaComb      = new JanelaCombustivel();
        
        
        
        //ADD DO MENU
        mBar.add(m1);
        mBar.add(m2);
        mBar.add(m3);
        mBar.add(m4);
        mBar.add(m5);
        
        //ADD ITENS MENU
        m1.add(a11);
        m1.add(a12);
        
        m2.add(a2);
        
        m3.add(m31);
        m3.add(m32);
        
        m4.add(a4);
        m5.add(a5);
        
        //ADD SUBITENS O MENU LAYOUT
        
        gCor.add(cVermelho);
        gCor.add(cAzul);
        gCor.add(cAmarelo);
        gFonte.add(fVermelho);
        gFonte.add(fAzul);
        gFonte.add(fAmarelo);
        
        
        m31.add(cVermelho);
        m31.add(cAzul);
        m31.add(cAmarelo);
        m32.add(fVermelho);
        m32.add(fAzul);
        m32.add(fAmarelo);
        
        //ADD MENUBAR
        this.setJMenuBar(mBar);
        
        
       
        //LISTENERS
        
         a11.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                          janelaThread.setVisible(false);
                          cadastroFilme.setVisible(false);
                        cadastroCliente.setVisible(true);
                         pesquisa.setVisible(false);
                         janelaComb.setVisible(false);
                       add(cadastroCliente);
                    }
                }
        );
            a12.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cadastroCliente.setVisible(false);
                        janelaThread.setVisible(false);
                        cadastroFilme.setVisible(true);
                         pesquisa.setVisible(false);
                           janelaComb.setVisible(false);
                      add(cadastroFilme);
                    }
                }
        );
               a4.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cadastroCliente.setVisible(false);
                        janelaThread.setVisible(true);
                        cadastroFilme.setVisible(false);
                         pesquisa.setVisible(false);
                           janelaComb.setVisible(false);
                      add(janelaThread);
                    }
                }
        );
                 a2.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cadastroCliente.setVisible(false);
                        janelaThread.setVisible(false);
                        cadastroFilme.setVisible(false);
                          janelaComb.setVisible(false);
                        pesquisa.setVisible(true);
                      add(pesquisa);
                    }
                }
        );
                 
                     a5.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cadastroCliente.setVisible(false);
                        janelaThread.setVisible(false);
                        cadastroFilme.setVisible(false);
                         pesquisa.setVisible(false);
                           janelaComb.setVisible(true);
                      add(janelaComb);
                    }
                }
        );
         
         
        
        
        
        cVermelho.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setCor(Color.red);
                    }
                }
        );
        cAzul.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setCor(Color.blue);
                    }
                }
        );
        cAmarelo.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setCor(Color.yellow);
                    }
                }
        );
        
        
        
        
        
    } 
          
    
}
