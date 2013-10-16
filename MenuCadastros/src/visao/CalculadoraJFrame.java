package visao;
import  javax.swing.*;
/**
 *
 * @author Rosenhaim
 */
public class CalculadoraJFrame extends JFrame{
    
    private JButton     jButton1;
    private JButton     jButton10;
    private JButton     jButton11;
    private JButton     jButton12;
    private JButton     jButton13;
    private JButton     jButton14;
    private JButton     jButton15;
    private JButton     jButton16;
    private JButton     jButton2;
    private JButton     jButton3;
    private JButton     jButton4;
    private JButton     jButton5;
    private JButton     jButton6;
    private JButton     jButton7;
    private JButton     jButton8;
    private JButton     jButton9;
    private JPanel      jPanel1;
    private JTextField  jTextField1;
    
    private static CalculadoraJFrame singleton = new CalculadoraJFrame();
  
    private CalculadoraJFrame(){
        iniciarComponentes();
    }
    
    public static synchronized CalculadoraJFrame getInstance() {
        return singleton;
    }
                         
    private void iniciarComponentes() {

        jPanel1     = new JPanel();
        jTextField1 = new JTextField();
        jButton1    = new JButton();
        jButton2    = new JButton();
        jButton3    = new JButton();
        jButton4    = new JButton();
        jButton5    = new JButton();
        jButton6    = new JButton();
        jButton7    = new JButton();
        jButton8    = new JButton();
        jButton9    = new JButton();
        jButton10   = new JButton();
        jButton11   = new JButton();
        jButton12   = new JButton();
        jButton13   = new JButton();
        jButton14   = new JButton();
        jButton15   = new JButton();
        jButton16   = new JButton();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("CALCULADORA JFRAME");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("7");

        jButton2.setText("8");

        jButton3.setText("4");

        jButton4.setText("=");

        jButton5.setText(",");

        jButton6.setText("1");

        jButton7.setText("0");

        jButton8.setText("+");

        jButton9.setText("5");

        jButton10.setText("2");

        jButton11.setText("6");

        jButton12.setText("9");

        jButton13.setText("3");

        jButton14.setText("/");

        jButton15.setText("*");

        jButton16.setText("-");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14))
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton12)
                    .addComponent(jButton14))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton9)
                    .addComponent(jButton11)
                    .addComponent(jButton15))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton10)
                    .addComponent(jButton13)
                    .addComponent(jButton16))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton8))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                       


        
                     

    
}
