public class Calculadora implements ICalculadora {

    @Override
    public void suma(CustomStack<Float> stack) {
        float valor1 =  stack.pop();
        float valor2 = stack.pop();
        float resultado = valor1 + valor2;
        stack.push(resultado);
        
    }

    @Override
    public void resta(CustomStack<Float> stack) {
        float valor1 =  stack.pop();
        float valor2 = stack.pop();
        float resultado = valor2 - valor1;
        stack.push(resultado);
        
    }

    @Override
    public void producto(CustomStack<Float> stack) {
        float valor1 =  stack.pop();
        float valor2 = stack.pop();
        float resultado = valor1 * valor2;
        stack.push(resultado);
        
    }

    @Override
    public void division(CustomStack<Float> stack) {
        float valor1 =  stack.pop();
        float valor2 = stack.pop();
        if (valor1 != 0) {
            float resultado = valor2 / valor1;
            stack.push(resultado);
        } else {
            stack.push(valor2);
            stack.push(valor1);
        }
        
        
    }

    @Override
    public void addNumber(CustomStack<Float> stack, int n) {
        stack.push((float) n);
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
