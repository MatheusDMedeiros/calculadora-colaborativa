package poo;

public class Principal {

    public static int soma(int a, int b){

        return a + b;
    }
    public static int mult(int a, int b){

        return a * b;
    }

    public static void main(String[] args) {

        // receber operando operador e operando com argumentos de linha de comandos
        // 1 + 1

        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[2]);

        String operador = args[1];

        switch (operador){
            case "+":
                System.out.println("Resultado: " + soma(op1, op2));
                break;
            case "*":
                System.out.println("Resultado: " + soma(op1, op2));
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}
