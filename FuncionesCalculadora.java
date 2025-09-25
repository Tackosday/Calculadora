public class FuncionesCalculadora {
	
	// Funcion para sumar by: PersWolf
    
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
}
