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

    public int mcm() {
        int a = this.valorA;
        int b = this.valorB;
        int max = Math.max(a, b);
        int mcm = max;
        while (mcm % a != 0 || mcm % b != 0) {
            mcm++;
        }
        return mcm;
    }

}
