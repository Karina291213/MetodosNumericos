
package unidad2_metodosnumericos;

public class PuntoFijo {
    private int numIteracion;
    private double valorXi;
    private double fx;
    private double fDerX;
    private double xii;
    private double errorResult;
    
    public PuntoFijo(){
    }
    
    public PuntoFijo(double valorXi){
        this.valorXi=valorXi;
      
        this.numIteracion=0;
        this.fx=0;
        this.fDerX=0;
        this.xii=0;
        this.errorResult=0;
    }
    
    //Método para calcular el resultado F(x)...
    public double calcularFx(){
        fx=(Math.exp(-1*(valorXi)))-valorXi;
        return fx;
    }
    //Método para calcular el resultado F'(x)...
    public double calcularFxDerivada(){
        fDerX=(-1*(Math.exp(-1*(valorXi))))-1;
        return fDerX;
    }
    //Método para calcular el resultado Xi+1...
    public double calcularXi1(){
        xii=valorXi-(calcularFx()/calcularFxDerivada());
        return xii;
    }
    public double calcularError(){
        errorResult=((calcularXi1()-valorXi)/(calcularXi1()));
        return errorResult;
    }

    public int getNumIteracion() {
        return numIteracion;
    }

    public void setNumIteracion(int numIteracion) {
        this.numIteracion = numIteracion;
    }

    public double getValorXi() {
        return valorXi;
    }

    public void setValorXi(double valorXi) {
        this.valorXi = valorXi;
    }

    public double getFx() {
        return fx;
    }

    public void setFx(double fx) {
        this.fx = fx;
    }

    public double getfDerX() {
        return fDerX;
    }

    public void setfDerX(double fDerX) {
        this.fDerX = fDerX;
    }

    public double getXii() {
        return xii;
    }

    public void setXii(double xii) {
        this.xii = xii;
    }

    public double getErrorResult() {
        return errorResult;
    }

    public void setErrorResult(double errorResult) {
        this.errorResult = errorResult;
    }
    
}
