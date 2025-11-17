public class Operaciones {
    public void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
    }

    public int restar(int op1, int op2){
        int resultado = op1-op2;
        System.out.println("El resultado de la resta es "+resultado);
        //RETORNO!!
        //Al final del metodo en la ultima linea tengo que poner que retorna
        return resultado;

    }

    public boolean validarNumero(int numero){
        return numero>10;

    }

}
