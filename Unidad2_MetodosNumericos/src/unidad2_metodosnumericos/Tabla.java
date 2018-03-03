
 
package unidad2_metodosnumericos;
import java.awt.*;
import java.awt.List;
import java.util.ArrayList;

public class Tabla {


   int iter;int x;
public ArrayList<Newton> newton =new ArrayList<>();
 
public Tabla(){


}
public ArrayList<Newton> getTablaNewton(int i, double xii){
    double xiii=xii;
    int it=i;
    int vueltas=0;
    

    while(vueltas < it)
    {
        Newton m3 =new Newton();
        if(vueltas!=0)
        {
            xiii=newton.get(vueltas-1).getXi1();
        }
        vueltas++;
        m3.setI(vueltas);
        m3.setXi(xiii);
        m3.setFX(Math.pow(euler(), -xiii)-xiii);
        m3.setFXD((-1*(Math.pow(euler(),-xiii)))-1);
        m3.setXi1(m3.getXi()-(m3.getFX()/m3.getFXD()));
        double error=((m3.getXi1()-m3.getXi())/m3.getXi1());
        if(error<0)
            error=error*-1;
        m3.setError(error);
        
        newton.add(m3);
    }
  
return newton;
}
public double euler()
    {
        double e=0;//Sacar euler
        for(int i=1; i<50; i++)
        {
            e= e+1/(double)(factorial(i));
        }
        return e;
    }
    public static long factorial(int x)//Factorial de un numero
    {
        long temp=1;
        for(int i=1; i<x; i++)
        {
            temp= temp*i;
        }
        return temp;
    }
}

