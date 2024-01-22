public interface ICalculadora {
    public void suma(CustomStack<Integer> stack);
    public void resta(CustomStack<Integer> stack);
    public void producto(CustomStack<Integer> stack);
    public void division(CustomStack<Integer> stack);
    public void addNumber(CustomStack<Integer> stack, int n);
    public boolean isNumber(String s);
}