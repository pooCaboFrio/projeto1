package visao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import  javax.swing.*;
import modelo.Carro;
import modelo.Pessoa;
/**
 *
 * @author Rosenhaim
 */
public class FormularioCadastroPessoa extends JInternalFrame{
                 
    private JButton     jButton1;
    private JButton     jButton2;
    private JButton     jButton3;
    private JLabel      jLabel1;
    private JLabel      jLabel2;
    private JLabel      jLabel3;
    private JLabel      jLabel4;
    private JLabel      jLabel5;
    private JLabel      jLabel6;
    private JTextField  jTextField1;
    private JTextField  jTextField2;
    private JTextField  jTextField3;
    private JTextField  jTextField4;
    private JTextField  jTextField5;
    private JTextField  jTextField6;
    private ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    
    private static final FormularioCadastroPessoa singleton = new FormularioCadastroPessoa();
    
    private FormularioCadastroPessoa(){
        
        iniciarComponentes();
        this.setVisible(true);
        this.setLocation(200,200);
        
    }
    
    public static synchronized FormularioCadastroPessoa getInstance() {
        return singleton;
    }

    private void iniciarComponentes() {
        
        jLabel1     = new JLabel();
        jLabel2     = new JLabel();
        jLabel3     = new JLabel();
        jLabel4     = new JLabel();
        jLabel5     = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jLabel6     = new JLabel();
        jTextField6 = new JTextField();
        jButton1    = new JButton();
        jButton2    = new JButton();
        jButton3    = new JButton();

        setTitle("Formulário para Cadastro de Pessoas");
        setToolTipText("");

        jLabel1.setText("Nome");

        jLabel2.setText("Sobrenome");

        jLabel3.setText("Data Nascimento");

        jLabel4.setText("Identidade");

        jLabel5.setText("CPF");

        jLabel6.setText("Telefone");

        jButton1.setText("Salvar");

        jButton2.setText("Imprimir Pessoas Cadastradas");
        
        jButton3.setText("Fechar Janela");

        jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Pessoa pessoa = new Pessoa();
                pessoa.setCpf(Long.parseLong(jTextField5.getText()));
                DateFormat formatter = new SimpleDateFormat("MM/dd/yy");  
                try { 
                    Date data = (Date)formatter.parse(jTextField3.getText());
                    pessoa.setDataNascimento(data);
                } catch (ParseException ex) {
                    Logger.getLogger(FormularioCadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                pessoa.setIdentidade(Long.parseLong(jTextField4.getText()));
                pessoa.setNome(jTextField1.getText());
                pessoa.setSobrenome(jTextField2.getText());
                pessoa.setTelefone(Long.parseLong(jTextField6.getText()));
                
                listaPessoa.add(pessoa);
                limpaCampos();
            
            }
        });
        
        jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           for (Iterator<Pessoa> it = listaPessoa.iterator(); it.hasNext();) {
                    Pessoa pessoa = it.next();
                    System.out.println("Nome = "+ pessoa.getNome()+ " Identidade = " + pessoa.getIdentidade());
                    limpaCampos();
            }
            }
        });
        
        
        
        jButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpaCampos();
                setVisible(false);
            }

           
        });
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField6)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2).addGap(18,18,18).addComponent(jButton3))
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                .addComponent(jButton3))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();    
    }
    
     public void limpaCampos() {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
            }
                      
}

