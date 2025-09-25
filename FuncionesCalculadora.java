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
}
