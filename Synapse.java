public class Synapse{
    private double weight;
    private Neurons Neuin;
    private Neurons Neuout;
    
    public Synapse(){
        weight = 1.0;
    }
    
    public Synapse(double weight){
        this.weight = weight;
    }
    
    public void link(Neurons in, Neurons out){
        Neuin = in;
        Neuout = out;
    }
    
    public double output(double in){
        return in * weight;
    }
}