
package unidad2_metodosnumericos;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextField;

  public class fDatos extends JFrame {
    int varI;
    double varXI,varXS,varXR,varFXR,varFXI,varSigno,varError;
    JTextField txtXI,txtXS, txtFinal;
 
   public fDatos()
   {
       MetBiseccion mostrar= new MetBiseccion();
    
   
    
     txtXI =new JTextField(5);
     txtXS= new JTextField(5);
     txtFinal= new JTextField(5);
     
     add(txtXI);
     add(txtXS);
     add(txtFinal);
     
     
     txtXI.setText(String.valueOf(mostrar.tempxi));
     txtXS.setText(String.valueOf(mostrar.tempxs));
     txtFinal.setText(String.valueOf(mostrar.Hasta));
       
        //DONDE SE GUARDAN LAS VARIABLES DE LA ANTERIOR FRAME
    this.setVarI(1);
     this.setVarXI(Double.parseDouble(txtXI.getText()));
     this.setVarXS(Double.parseDouble(txtXS.getText()));
     this.setVarXR(this.CalXr());
     this.setVarFXR(this.funcionXR());
     this.setVarFXI(this.funcionXI());
     this.setVarSigno(this.signo());
     this.setVarError(this.Error());
   setVisible(false);
   
   }
   
    public fDatos(int varI,double varXI,double varXS, double varXR, double varFXR, double varFXI, double varSigno, double varError)
    {
       
        
    this.varI= varI;
     this.varXI=varXI;
    this.varXS=varXS;
    this.varXR=varXR;
    this.varFXR=varFXR;
    this.varFXI=varFXI;
    this.varSigno=varSigno;
    this.varError=varError;
    }
double ParseDouble(String strNumber) {
   if (strNumber != null && strNumber.length() > 0) {
       try {
          return Double.parseDouble(strNumber);
       } catch(Exception e) {
          return -1;  
       }
   }
   else return 0;
}
    public int getVarI() {
        return varI;
    }

    public void setVarI(int varI) {
        this.varI = varI;
    }

    public double getVarXI() {
        return varXI;
    }

    public void setVarXI(double varXI) {
        this.varXI = varXI;
    }

    public double getVarXS() {
        return varXS;
    }

    public void setVarXS(double varXS) {
        this.varXS = varXS;
    }

    public double getVarXR() {
        return varXR;
    }

    public void setVarXR(double varXR) {
        this.varXR = varXR;
    }

    public double getVarFXR() {
        return varFXR;
    }

    public void setVarFXR(double varFXR) {
        this.varFXR = varFXR;
    }

    public double getVarFXI() {
        return varFXI;
    }

    public void setVarFXI(double varFXI) {
        this.varFXI = varFXI;
    }

    public double getVarSigno() {
        return varSigno;
    }

    public void setVarSigno(double varSigno) {
        this.varSigno = varSigno;
    }

    public double getVarError() {
        return varError;
    }

    public void setVarError(double varError) {
        this.varError = varError;
    }
    public String  toString()
    {
    return this.getVarI()+" "+this.getVarXI()+" "+this.getVarXS()+""+this.varSigno+" "+this.varError;
    }
    
    public double  CalXr()
    {  
       
     return (this.getVarXI()+this.getVarXS())/2;
     
    }
     public double signo()
     {
     return this.funcionXR()*this.funcionXI();
     
     }
      public double funcionXR()
     {
     
     return (Math.pow(this.getVarXR(), 3))+(4*(Math.pow(this.getVarXR(), 2)))-10;
     
     }
   public double  funcionXI()
     {
     
     return (Math.pow(this.getVarXI(), 3))+(4*(Math.pow(this.getVarXI(), 2)))-10;
     
     }
     public double Error()
    {
        
    return Math.abs((this.getVarXS()-this.getVarXI())/this.getVarXS());
    
    }

     // metodos de calculo se comentan 
    
    /*
     public double  CalXr()
    {  
       
     return (this.getVarXI()+this.getVarXS())/2;
     
    }
     public double  CalXrXM()
    {
     return (this.CalXr()+6)/2;
    }
     
     
    public double  CalXrSOBRE()
    {
      if(this.getVarXR()==this.getVarXS())
    {
       
  
   return this.CalXr();
   
    }
    if(this.getVarXR()==this.getVarXI())
      {
    return this.CalXr();
    }
    return 0;
    }
    public  double DetXS()
    {
    if(this.funcionXR()*this.funcionXI()<0)
    {
        
    this.setVarXS(this.getVarXR());
     return this.getVarXS();
    }
    else
    {
     
    return this.getVarXS();
    }
    }
    
     public  double DetXI()
    {
    if(this.funcionXR()*this.funcionXI()>0)
    {
    this.setVarXI(this.getVarXR());
     return this.getVarXI();
    }
    else
    {
    return this.getVarXI();
    }
    }
     
     // sobrecarga de xi y xs
     
      public  double DetXSOBRE()
    {
    if(this.signoSOBRE()<0)
    {
    this.setVarXS(this.CalXr());
     return this.getVarXS();
    }
    else
    {
    return this.getVarXS();
    }
    }
    
     public  double DetXISOBRE()
    {
    if(this.signoSOBRE()>0)
    {
      
    this.setVarXI(this.CalXr());
     return this.getVarXI();
    }
    else
    {
    return this.getVarXI();
    }
    }
     
     
     
    
     public double signo()
     {
     return this.funcionXR()*this.funcionXI();
     
     }
      public double signoSOBRE()
     {
     return this.funcionXRSOBRE()*this.funcionXISOBRE();
     
     }
     public double funcionXR()
     {
     
     return (Math.pow(this.getVarXR(), 3))+(4*(Math.pow(this.getVarXR(), 2)))-10;
     
     }
   public double  funcionXI()
     {
     
     return (Math.pow(this.getVarXI(), 3))+(4*(Math.pow(this.getVarXI(), 2)))-10;
     
     }
   
    public double funcionXRSOBRE()
     {
     
     return (Math.pow(this.CalXr(), 3))+(4*(Math.pow(this.CalXr(), 2)))-10;
     
     }
   public double  funcionXISOBRE()
     {
     
     return (Math.pow(this.DetXI(), 3))+(4*(Math.pow(this.DetXI(), 2)))-10;
     
     }
   
  
    public double Error()
    {
        
    return (this.getVarXS()-this.getVarXI())/this.getVarXS();
    
    }
  */
    public static ArrayList<fDatos>getDatos()
    {
        fDatos variables=new fDatos();
    ArrayList<fDatos> Datos=new ArrayList<fDatos>();
    fDatos f1= new fDatos(variables.getVarI(),variables.getVarXI(),variables.getVarXS(),variables.getVarXR(),variables.getVarFXR(),variables.getVarFXI(),variables.getVarSigno(),variables.varError);
    Datos.add(f1);
    
    return Datos;
    
    }
     
}