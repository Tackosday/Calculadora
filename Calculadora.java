public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        FuncionesCalculadora calc = new FuncionesCalculadora(10, 2);

        System.out.println("Resultado de la suma: " + calc.sumar());
        System.out.println("Resultado de la resta: " + calc.restar());
        System.out.println("Resultado de la multiplicación: " + calc.multiplicar());
        System.out.println("Resultado de la división: " + calc.dividir());
        System.out.println("Resultado del módulo: " + calc.modulo());
        System.out.println("Resultado de la potenciación: " + calc.potenciacion());
        int[] factoriales = calc.factorial();
        System.out.println("Factorial de valorA: " + factoriales[0]);
        System.out.println("Factorial de valorB: " + factoriales[1]);
        System.out.println("Mínimo común múltiplo: " + calc.mcm());
    }
}