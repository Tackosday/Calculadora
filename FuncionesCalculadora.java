public class FuncionesCalculadora {

    private int valorA;
    private int valorB;

    public FuncionesCalculadora(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public int dividir() {
        return valorA / valorB;
    }

    public int sumar() {
        return this.valorA + this.valorB;
    }

    public int multiplicar() {
        return this.valorA * this.valorB;
    }
    public int potenciacion() {
    int resultado = 1;
    for (int i = 0; i < this.valorB; i++) {
        resultado *= this.valorA;
        }
    return resultado;
    }
    public int modulo() {
        return this.valorA % this.valorB;
    }

    public int[] factorial() {
        int[] factoriales = new int[2];
        factoriales[0] = 1;
        factoriales[1] = 1;

        for (int i = 1; i <= valorA; i++) {
            factoriales[0] *= i;
        }

        for (int i = 1; i <= valorB; i++) {
            factoriales[1] *= i;
        }

        return factoriales;
    }

    public int restar() {
        return this.valorA - this.valorB;
    }

    import java.util.Scanner;

class CalculadoraInteres {

    
    public static double interesSimple(double capital, double tasa, int tiempo) {
        return capital * tasa * tiempo;
    }

    
    public static double montoSimple(double capital, double tasa, int tiempo) {
        return capital + interesSimple(capital, tasa, tiempo);
    }

    
    public static double montoCompuesto(double capital, double tasa, int tiempo) {
        return capital * Math.pow(1 + tasa, tiempo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés (%): ");
        double tasa = sc.nextDouble() / 100; 

        System.out.print("Ingrese el tiempo (años): ");
        int tiempo = sc.nextInt();

        // Calculos
        double interesSimple = CalculadoraInteres.interesSimple(capital, tasa, tiempo);
        double montoSimple = CalculadoraInteres.montoSimple(capital, tasa, tiempo);
        double montoCompuesto = CalculadoraInteres.montoCompuesto(capital, tasa, tiempo);

        // Resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Interés Simple: " + interesSimple);
        System.out.println("Monto Total (Simple): " + montoSimple);
        System.out.println("Monto Total (Compuesto): " + montoCompuesto);

        sc.close();
    }
}

}
