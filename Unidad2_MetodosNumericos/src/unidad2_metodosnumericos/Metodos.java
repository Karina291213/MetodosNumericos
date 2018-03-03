package unidad2_metodosnumericos;

public class Metodos {

    public long fact(int x) {
        long prod = 1;
        for (int i = 1; i < x; i++) {
            prod = prod * i;

        }
        return prod;
    }

    public double euler() {
        double e = 0;
        for (int i = 1; i < 50; i++) {
            e = e + 1 / (double) (fact(i));
        }
        return e;
    }

    public double eulerNormal(double x) {
        return (Math.pow(euler(), -x)) - x;
    }

    public double eulerDerivado(double x) {
        double respuesta = (Math.pow(euler(), -x));
        return (-respuesta) - 1;
    }

    public double NuevaRaiz(double x) {

        double raiz = (eulerNormal(x) / eulerDerivado(x)) - x;
        return Math.abs(raiz);
    }

    public double Error(double x) {
        double error = (NuevaRaiz(x) - x) / NuevaRaiz(x);
        return error;
    }

    public String[][] Calculo(String numeros, String interacciones) {
        double Num = Double.parseDouble(numeros);
        int interac = Integer.parseInt(interacciones);
        String[][] datos = new String[interac][6];
        for (int f = 0; f < interac; f++) {
            if (f > 0) {
                Num = Double.parseDouble(datos[(f - 1)][4]);
            }
            for (int c = 0; c < 6; c++) {
                if (c == 0) {
                    datos[f][c] = "" + (f + 1);
                }
                if (c == 1) {
                    datos[f][c] = "" + Num;
                }
                if (c == 2) {

                    datos[f][c] = "" + eulerNormal(Num);
                }
                if (c == 3) {
                    datos[f][c] = "" + eulerDerivado(Num);
                }
                if (c == 4) {
                    datos[f][c] = "" + NuevaRaiz(Num);
                }
                if (c == 5) {
                    datos[f][c] = "" + Error(Num);
                }

            }
        }
        return datos;
    }
}
