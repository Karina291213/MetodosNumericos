
package unidad2_metodosnumericos;
import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.*;
import java.awt.*;// se importan todas las interfaces 
import java.awt.event.*; 
import javax.swing.table.AbstractTableModel;

public class Newton {
  int i;
   double Xi;
   double FX;
   double FXD;
   double xi1;
   double Error;

   
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return Xi;
    }

    public void setXi(double Xi) {
        this.Xi = Xi;
    }

    public double getFX() {
        return FX;
    }

    public void setFX(double FX) {
        this.FX = FX;
    }

    public double getFXD() {
        return FXD;
    }

    public void setFXD(double FXD) {
        this.FXD = FXD;
    }

    public double getXi1() {
        return xi1;
    }

    public void setXi1(double xi1) {
        this.xi1 = xi1;
    }

    public double getError() {
        return Error;
    }

    public void setError(double Error) {
        this.Error = Error;
    }

   
   
    public static void main(String[] args) {
      MetNewton mm=new MetNewton(); 
      
      mm.setVisible(true);
      mm.setLocationRelativeTo(null);
    }

    
    
}
