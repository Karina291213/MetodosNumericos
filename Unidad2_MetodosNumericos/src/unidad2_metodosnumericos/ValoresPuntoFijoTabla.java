
package unidad2_metodosnumericos;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ValoresPuntoFijoTabla extends AbstractTableModel {
    public ArrayList<PuntoFijo> metPuntoFijoPojos;
    private String nombreColumnas[]={"Nº i","Xi","F(x)","F'(x)","Xi+i","Error"};
    
    public ValoresPuntoFijoTabla(ArrayList<PuntoFijo> metPuntoFijoPojos){
        this.metPuntoFijoPojos=metPuntoFijoPojos;
    }

    public ArrayList<PuntoFijo> getMetPuntoFijoPojos() {
        return metPuntoFijoPojos;
    }

    public void setMetPuntoFijoPojos(ArrayList<PuntoFijo> metPuntoFijoPojos) {
        this.metPuntoFijoPojos = metPuntoFijoPojos;
    }
    
    @Override
    public int getRowCount() {
        return metPuntoFijoPojos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PuntoFijo valorMetNum=metPuntoFijoPojos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return valorMetNum.getNumIteracion();
            case 1:
                return valorMetNum.getValorXi();
            case 2:
                return valorMetNum.getFx();
            case 3:
                return valorMetNum.getfDerX();
            case 4:
                return valorMetNum.getXii();
            case 5:
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
