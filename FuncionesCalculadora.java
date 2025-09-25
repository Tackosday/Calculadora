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

}
