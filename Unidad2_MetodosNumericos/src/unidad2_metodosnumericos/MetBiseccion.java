
package unidad2_metodosnumericos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MetBiseccion extends JFrame {

    JLabel lblName, lblXI, lblXS, lblHasta;
    JTextField txtXI, txtXS,txtHasta;
    JButton btnOk, btnguardar;
   public static String tempxi;
   public static String tempxs;
   public static String Hasta;
  

    public MetBiseccion() {
        super("Bisección");

        lblName = new JLabel("Metodo de Biseccion");

        JPanel Plname = new JPanel();

        FlowLayout n = new FlowLayout();
        Plname.setLayout(n);
        lblName = new JLabel("Metodo de Biseccion : X^3+4X^2-10=0");
        Plname.add(lblName);
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3, 2);
        panelDatos.setLayout(gl);
        lblXI = new JLabel("Ingresa (Xi)");
        txtXI = new JTextField(5);
        lblXS = new JLabel("Ingresa (Xs)");
        txtXS = new JTextField(5);
        lblHasta= new JLabel("Numero de Iteraciones");
        txtHasta= new JTextField(5);
        panelDatos.add(lblXI);
        panelDatos.add(txtXI);
        panelDatos.add(lblXS);
        panelDatos.add(txtXS);
        panelDatos.add(lblHasta);
        panelDatos.add(txtHasta);

        JPanel Plbtn = new JPanel();
        FlowLayout btn = new FlowLayout();
        Plbtn.setLayout(btn);
        btnOk = new JButton("Mostrar Iteraciones");
        btnguardar= new JButton("Guardar Iteracion");
        Plbtn.add(btnOk, BorderLayout.EAST);
        Plbtn.add(btnguardar, BorderLayout.WEST);

        Container cp = getContentPane();
        cp.add(Plname, BorderLayout.NORTH);
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(Plbtn, BorderLayout.SOUTH);
        btnguardar.addActionListener(new manejadorG());
        btnOk.addActionListener(new ManejadorOK());
        btnOk.setEnabled(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(320, 150);
        setVisible(true);
        setResizable(false);
      
    }
private  class cerrar implements WindowListener
{

        @Override
        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
         
                  
        }

        @Override
        public void windowClosed(WindowEvent e) {
            Menu x=new Menu();
          x.show(); 
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
   
        }

        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    }
    private class manejadorG implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
           tempxi=txtXI.getText();
          tempxs=txtXS.getText();
         Hasta= txtHasta.getText();
        
    
          btnOk.setEnabled(true);
        }
            }
    
   
    
    private class ManejadorOK implements ActionListener {
                        
        @Override
        public void actionPerformed(ActionEvent e) {
            
             
            if (e.getSource() == btnOk) {
                try {
                    if (txtXI.getText().equals("") && txtXS.getText().equals("") && txtHasta.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "LLENA TODOS LOS CAMPOS PARA GUARDAR");
                        txtXI.setText("");
                        txtXS.setText("");
                        txtHasta.setText("");
                    } else {
                       
                          Biseccion v1 = new Biseccion();
                v1.show();
                 System.out.println(tempxi);
                 System.out.println(tempxs);
                 
                 
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, " ocurrio un error de tipo "+ ex.toString());
                }
          
               
            }
        }
    }
  


}
