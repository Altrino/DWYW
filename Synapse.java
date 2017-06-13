public class Synapse{
    private double weight;
    private Neurons Neuin;
    private Neurons Neuout;
    
    public Synapse(){
        weight = 1.0;
    }
    
    public Synapse(Neurons in, Neurons out){
        weight = 1.0;
        Neuin = in;
        Neuout = out;
    }
    
    public Synapse(double weight){
        this.weight = weight;
    }
    
    public void link(Neurons in, Neurons out){
        Neuin = in;
        Neuout = out;
        out.sum(output(in.getOutput()));
    }
    
    public double output(double in){
        return in * weight;
    }
}