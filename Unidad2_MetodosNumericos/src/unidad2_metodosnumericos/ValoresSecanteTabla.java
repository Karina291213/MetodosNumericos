
package unidad2_metodosnumericos;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ValoresSecanteTabla extends AbstractTableModel {
    public ArrayList<Secante> metSecantePojos;
    private String nombreColumnas[]={"Nº i","Xi","Xi-1","F(Xi)","F(Xi-1)","Raiz","Error"};
    
    public ValoresSecanteTabla(ArrayList<Secante> metSecantePojos){
        this.metSecantePojos=metSecantePojos;
    }

    public ArrayList<Secante> getMetSecantePojos() {
        return metSecantePojos;
    }

    public void setMetSecantePojos(ArrayList<Secante> metSecantePojos) {
        this.metSecantePojos = metSecantePojos;
    }
    
    @Override
    public int getRowCount() {
        return metSecantePojos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Secante valorMetNum=metSecantePojos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return valorMetNum.getNumIteracion();
            case 1:
                return valorMetNum.getValorXi();
            case 2:
                return valorMetNum.getValorXi1();
            case 3:
                return valorMetNum.getFxi();
            case 4:
                return valorMetNum.getFxi1();
            case 5:
                return valorMetNum.getRaiz();
            case 6:
                return valorMetNum.getErrorResult();
            default:
                return null;
        }    
    }
      
    @Override
    public String getColumnName(int column){
        return nombreColumnas[column];
    }
    
}
