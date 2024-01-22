public class Calculadora implements ICalculadora {

    @Override
    public void suma(CustomStack<Integer> stack) {
        int valor1 =  stack.pop();
        int valor2 = stack.pop();
        int resultado = valor1 + valor2;
        stack.push(resultado);
        
    }

    @Override
    public void resta(CustomStack<Integer> stack) {
        int valor1 =  stack.pop();
        int valor2 = stack.pop();
        int resultado = valor1 - valor2;
        stack.push(resultado);
        
    }

    @Override
    public void producto(CustomStack<Integer> stack) {
        int valor1 =  stack.pop();
        int valor2 = stack.pop();
        int resultado = valor1 * valor2;
        stack.push(resultado);
        
    }

    @Override
    public void division(CustomStack<Integer> stack) {
        int valor1 =  stack.pop();
        int valor2 = stack.pop();
        int resultado = valor1 / valor2;
        stack.push(resultado);
        
    }

    @Override
    public void addNumber(CustomStack<Integer> stack, int n) {
        stack.push(n);
    }

    @Override
    public boolean isNumber(String s) {
        try {  
            Integer.parseInt(s);  
            return true;
          } catch(NumberFormatException e){  
            return false;  
          }  
        }
}
