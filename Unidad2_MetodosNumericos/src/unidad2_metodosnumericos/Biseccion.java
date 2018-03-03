
package unidad2_metodosnumericos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Biseccion extends JFrame {
 
    //JTable tbDatos;
    JTextField txtcontador = new JTextField(5);
    JScrollPane brBarra;
    JButton btnSiguiente;
    fDatos cuenta=new fDatos();
    final absTable ds= new absTable();
     MetBiseccion inici=new MetBiseccion();
    int contador;
    public Biseccion()
    {
    super("Tabla de resultados");
      final  JTable tbDatos=new  JTable(ds);
    brBarra=new JScrollPane(tbDatos);
    btnSiguiente=new JButton("Siguiente");
    this.add(brBarra, BorderLayout.CENTER);
    this.add(btnSiguiente,BorderLayout.SOUTH);
    btnSiguiente.setSize(50, 50);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setSize(600, 300);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    ManejadorSig drive= new ManejadorSig();
    btnSiguiente.addActionListener( drive);
    
     txtcontador.setText(String.valueOf(inici.Hasta));
  contador=Integer.parseInt(txtcontador.getText());
   
    }
    
    
    
    private class ManejadorSig implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          
          
          if(cuenta.signo()<0)
          {
          double varXI=0;
           double varXs=0;
           double varXR=0;
           double varFXR=0;
           double varFXI=0;
           double signo=0;
           double error=0;
          btnSiguiente.setEnabled(false);
          fDatos dl=null;
          for(int c=cuenta.varI+1;c<=contador;c++)
          {
       
         System.out.println(cuenta.getVarSigno());
         
         if(cuenta.getVarSigno()<0)
         {
         varXI= cuenta.getVarXI(); 
         cuenta.setVarXI(varXI);
         varXs= cuenta.getVarXR();
         cuenta.setVarXS(varXs);
         varXR= (varXI+varXs)/2;
         cuenta.setVarXR(varXR);
         varFXR= ((Math.pow(varXR, 3))+(4*(Math.pow(varXR, 2)))-10);
         cuenta.setVarFXR(varFXR);
         varFXI=((Math.pow(varXI, 3))+(4*(Math.pow(varXI, 2)))-10);
         cuenta.setVarFXI(varFXI);
         signo= varFXR*varFXI;
         cuenta.setVarSigno(signo);
         error= Math.abs(((varXs-varXI)/varXs));
         cuenta.setVarError(error);
          dl= new fDatos(c,varXI,varXs,varXR,varFXR,varFXI,cuenta.getVarSigno(), error);
        ds.Siguiente(dl);
         }
         
         else
         {
         varXI= cuenta.getVarXR(); 
         cuenta.setVarXI(varXI);
         varXs= cuenta.getVarXS();
         cuenta.setVarXS(varXs);
         varXR= (varXI+varXs)/2;
         cuenta.setVarXR(varXR);
         varFXR= ((Math.pow(varXR, 3))+(4*(Math.pow(varXR, 2)))-10);
         cuenta.setVarFXR(varFXR);
         varFXI=((Math.pow(varXI, 3))+(4*(Math.pow(varXI, 2)))-10);
         cuenta.setVarFXI(varFXI);
         signo= varFXR*varFXI;
         cuenta.setVarSigno(signo);
         error= Math.abs(((varXs-varXI)/varXs));
         cuenta.setVarError(error);
          dl= new fDatos(c,varXI,varXs,varXR,varFXR,varFXI,cuenta.getVarSigno(), error);
        ds.Siguiente(dl);
         }
          }
        
    
          }
          else{
          JOptionPane.showMessageDialog(null, "No hay raiz en la region indicada");
          }
         
        }
    
    }
    
}
