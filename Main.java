import java.io.File;
import java.util.Scanner;
/**
 * Programa principal para calcular en formato postfix
 * @author Ultimate-Truth-Seeker SaintPage
 * @version 23- 01 - 2024
 */
public class Main {
    public static void main(String args[]){
        // ingreso de archivo postfix, tiene que estar en la misma carpeta del programa
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
        // Separa por espacios el texto 
        CustomStack<Float> stackPrincipal = new CustomStack<Float>();
        Calculadora calculadora = new Calculadora();
        // verifica si es un entero o un símbolo, o si hay algún error en el archivo
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
                s.close();
                return;
            }
                
           }
        }
        // retorna el valor final
        s.close();
        float resultado = stackPrincipal.pop();
        System.out.println("El resultado es: "+ resultado);
    }
}
