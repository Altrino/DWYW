public class Neurons{
    private double sum;
    private double output;
    private String function;
    
    public Neurons(){
        function = "1 / (1 + Math.pow(E, -x))";
    }
    
    public Neurons(double sum){
        this.sum = sum;
    }
    
    public Neurons(String function){
        this.function = function;
    }
    
    public void sum(double add){
        sum += add;
    }
    
    public double getOutput(){
        return output;
    }
}