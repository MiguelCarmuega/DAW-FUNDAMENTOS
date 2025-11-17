public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecución de métodos");
        saludar("Borja");
        saludar("Miguel");
        saludar("Luis");
        despedir();

        Operaciones calculadora = new Operaciones();
        calculadora.sumar(3,4);
        calculadora.sumar(5,6);
        calculadora.restar(5,3);
        int resultado2 = calculadora.restar(9,7) *2;

        System.out.println("El numero es valido: "+calculadora.validarNumero(20));




    }

    public static void saludar(String data){
        System.out.println("Hola "+data);
        System.out.println("Buenos días");
        System.out.println("Que tal estas");
        System.out.println("Quieres un cafe");
        System.out.println("Este método se va a repetir en el saludo");

    }

    public static void despedir(){
        System.out.println("Hasta luego");
        System.out.println("Que tengas buen día");
    }

}
