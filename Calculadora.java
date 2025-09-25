public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        FuncionesCalculadora calc = new FuncionesCalculadora(10, 2);

        System.out.println("Resultado de la suma: " + calc.sumar());
        System.out.println("Resultado de la multiplicación: " + calc.multiplicar());
        System.out.println("Resultado de la división: " + calc.dividir());
    }
}