
package unidad2_metodosnumericos;

public class Secante {
    private int numIteracion;
    private double valorXi;
    private double valorXi1;
    private double fxi;
    private double fxi1;
    private double raiz;
    private double errorResult;
    
    public Secante(){
    }
    
    public Secante(double valorXi,double valorXi1){
        this.valorXi=valorXi;
        this.valorXi1=valorXi1;
        
        this.numIteracion=0;
        this.fxi=0;
        this.fxi1=0;
        this.raiz=0;
        this.errorResult=0;
    }
    
    public double calcularFxi(){
        fxi=(Math.exp(-1*(valorXi)))-valorXi;
        return fxi;
    }
    public double calcularFxi1(){
        fxi1=(-1*(Math.exp(-1*(valorXi1))))-valorXi1;
        return fxi1;
    }
    public double calcularRaiz(){
        raiz=valorXi-((calcularFxi()*(valorXi1-valorXi))/(calcularFxi1()-calcularFxi()));
        return raiz;
    }
    public double calcularError(){
        errorResult=((calcularRaiz()-valorXi)/(calcularRaiz()*100));
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

    public double getValorXi1() {
        return valorXi1;
    }

    public void setValorXi1(double valorXi1) {
        this.valorXi1 = valorXi1;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxi1() {
        return fxi1;
    }

    public void setFxi1(double fxi1) {
        this.fxi1 = fxi1;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getErrorResult() {
        return errorResult;
    }

    public void setErrorResult(double errorResult) {
        this.errorResult = errorResult;
    }
    
}
