
package unidad2_metodosnumericos;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class absTable extends AbstractTableModel {
    
    
    private ArrayList <fDatos> Datos= new  ArrayList<fDatos>(); 
    private String[] cabecera={"i", "Xi","Xs","Xr", "f(Xr)","f(Xi)", "Signo", "Error"}; 
public  absTable()
{
    Datos= fDatos.getDatos();
}
    
    
    @Override
    public int getRowCount() {
     return Datos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public String getColumnName(int c) {
    return cabecera[c];
    }
    
    public void Siguiente(fDatos dl)
    {
    Datos.add(dl);
    this.fireTableRowsInserted(Datos.size(),Datos.size());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      switch(columnIndex)
      {
          case 0:  return Datos.get(rowIndex).getVarI();
          case 1:  return Datos.get(rowIndex).getVarXI();
           case 2:  return Datos.get(rowIndex).getVarXS();
            case 3:  return Datos.get(rowIndex).getVarXR();
             case 4:  return Datos.get(rowIndex).getVarFXR(); 
             case 5:  return Datos.get(rowIndex).getVarFXI();
              case 6:  return Datos.get(rowIndex).getVarSigno();
               case 7:  return Datos.get(rowIndex).getVarError();
             
               default: return null;
      
      }
    }
    
}
