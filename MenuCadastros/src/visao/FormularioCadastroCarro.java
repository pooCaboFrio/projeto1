package visao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import  javax.swing.*;
import modelo.Carro;
/**
 *
 * @author Rosenhaim
 */
public class FormularioCadastroCarro extends JInternalFrame{
                           
    private JButton     jButton1;
    private JButton     jButton2;
    private JButton     jButton3;
    private JLabel      jLabel1;
    private JLabel      jLabel2;
    private JLabel      jLabel3;
    private JLabel      jLabel4;
    private JLabel      jLabel5;
    private JTextField  jTextField1;
    private JTextField  jTextField2;
    private JTextField  jTextField3;
    private JTextField  jTextField4;
    private JTextField  jTextField5;
    private ArrayList<Carro>   listaCarro = new ArrayList<>();
    
    private static final FormularioCadastroCarro singleton = new FormularioCadastroCarro();
    
    private FormularioCadastroCarro(){
        iniciarComponentes();
        this.setVisible(true);
        this.pack();
    }
    
    public static synchronized FormularioCadastroCarro getInstance() {
        return singleton;
    }
    
    public void iniciarComponentes(){
        
        jButton1    = new JButton();
        jButton2    = new JButton();
        jButton3    = new JButton();
        jLabel1     = new JLabel();
        jTextField1 = new JTextField();
        jLabel2     = new JLabel();
        jTextField2 = new JTextField();
        jLabel3     = new JLabel();
        jTextField3 = new JTextField();
        jLabel4     = new JLabel();
        jTextField4 = new JTextField();
        jLabel5     = new JLabel();
        jTextField5 = new JTextField();

        setTitle("Formulário para Cadastro de Carros");
        setToolTipText("");

        jButton1.setText("Salvar");

        jButton2.setText("Imprimir Carros Cadastrados");

        jButton3.setText("Fechar");

        jLabel1.setText("Marca");

        jTextField1.setToolTipText("");

        jLabel2.setText("Modelo");

        jTextField2.setToolTipText("");

        jLabel3.setText("Placa");

        jTextField3.setToolTipText("");

        jLabel4.setText("Cor");

        jTextField4.setToolTipText("");

        jLabel5.setText("Renavam");

        jTextField5.setToolTipText("");
        
        jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Carro car = new Carro();
                car.setCor(jTextField4.getText());
                car.setMarca(jTextField1.getText());
                car.setModelo(jTextField2.getText());
                car.setPlaca(jTextField3.getText());
                car.setRenavam(Long.parseLong(jTextField5.getText()));
                listaCarro.add(car);
                limpaCampos();
            }
        });
        
        jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (Iterator<Carro> it = listaCarro.iterator(); it.hasNext();) {
                    Carro carro = it.next();
                    System.out.println("Carro = "+ carro.getModelo() + " Placa = " + carro.getPlaca());
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(29, 29, 29))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(20, 20, 20)))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(83, 83, 83))
        );

        pack();
    }

    void limpaCampos() {
        
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
        
    }
}
    

