public class FuncionesCalculadora {
	
	// Funcion para sumar by: PersWolf
    
    private int valorA;
    private int valorB;
    
    public int sumar() {
        return this.valorA + this.valorB;
    }
    public int Logaritmo(){
        if (valorA<=0) {
            throw new IllegalAccessException(s:"Error, El valor debe ser mayor que 0.")
        }
        if (valorB<=1){
            throw new IllegalAccessException(s:"Error, La base debe ser mayor que 1.")
        }
        int resultado = 0;
        int potencia = 1;

        while (potencia *valorB <= valorA) {
            potencia *= valorB;
            resultado ++;
        }
        return resultado;
    }
}
