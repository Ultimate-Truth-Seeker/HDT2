public class Main {
    public static void main(String args[]){
        String archivo = "1 2 + 4 * 3 +";
        
        CustomStack<Integer> stackPrincipal = new CustomStack<Integer>();
        Calculadora calculadora = new Calculadora();
        
        String serapcion[] = archivo.split(" ");
        for (var operator : serapcion) {
            boolean verificador = calculadora.isNumber(operator);
           if(verificador){
                //si es un numero
                int op = Integer.parseInt(operator);
                calculadora.addNumber(stackPrincipal, op);
           }
           else{
                switch (operator) {
                    case "+":
                       calculadora.suma(stackPrincipal);
                        break;
                    case "-":
                        calculadora.resta(stackPrincipal);
                        break;
                    case "*":
                        calculadora.producto(stackPrincipal);
                        break;
                    case "/":
                        calculadora.division(stackPrincipal);
                        break;
                    
                    default:
                    System.out.println("otro");
                        break;
                }
           }
        }
        int resultado = stackPrincipal.pop();
        System.out.println("El resultado es: "+ resultado);
    }
}
