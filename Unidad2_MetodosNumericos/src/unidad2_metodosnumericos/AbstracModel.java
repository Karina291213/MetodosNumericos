
package unidad2_metodosnumericos;

import java.awt.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class AbstracModel extends AbstractTableModel{
private List<Newton> biseccion;
    
 private   String [] columna= {"iteracion","xi","f(x)","f`(x)","xi+1" ,"Error"  };
 
 
public  AbstracModel (List<Newton> biseccion){

this.biseccion =biseccion;
}

    @Override
    public int getRowCount() {
        return biseccion.size();
    }

    @Override
    public int getColumnCount() {
    return columna.length;
            
    }

    @Override
    public Object getValueAt(int i, int i1) {
      switch(i1){
          case 0:
              return biseccion.get(i).getI();
          case 1:
              return biseccion.get(i).getXi();
          case 2:
              return biseccion.get(i).getFX();
          case 3:
              return biseccion.get(i).getFXD();
          case 4:
              return biseccion.get(i).getXi1();
          case 5:
              return biseccion.get(i).getError();
      
      }return null; 
      
    }
    public String getColumnName( int column){
    
    
    return columna[column];
    }
      
}
