import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Bienvenido, ingrese el nombre del archivo");
        Scanner s = new Scanner(System.in);
        String file = s.nextLine();
        String archivo = "1 2 + 4 * 3 +";
        try ( Scanner sc = new Scanner(new File(file))){
            archivo = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error en la lectura del archivo");
            s.close();
            return;
            
        }

        CustomStack<Float> stackPrincipal = new CustomStack<Float>();
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
            try {
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
                        float divisor = stackPrincipal.pop();
                        if (divisor == 0.0) {
                            System.out.println("Error. División entre cero");
                            return;
                            
                        }
                        stackPrincipal.push(divisor);
                        calculadora.division(stackPrincipal);
                        break;
                    
                    default:
                    System.out.println("Error. Hay un símbolo ajeno");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error, hay más operaciones de las posibles de realizar");
            }
                
           }
        }
        s.close();
        float resultado = stackPrincipal.pop();
        System.out.println("El resultado es: "+ resultado);
    }
}
