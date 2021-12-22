package PSO;

/**
 *
 * @author fityan
 */
public class Particle {
    double[] x;
    double[] v;
    double[] best;
    double fitness;
    
    public Particle() {
        x = new double[Hyperparameter.getNumOfVariables()];
        for(int i = 0; i < x.length; i++) {
            x[i] = Math.random()*20-10;
        }
        
        v = new double[Hyperparameter.getNumOfVariables()];
        for(int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        
        best = new double[Hyperparameter.getNumOfVariables()];
        System.arraycopy(x, 0, best, 0, best.length);       
        fitness = 0;
    }
    
    public Particle(double[] x, double[] v, double fitness) {
        this.x = x;
        this.v = v;
        this.fitness = fitness;
    }
    
    public double[] getX() {
        return x;
    }
    
    public double getX(int index) {
        return x[index];
    }
    
    public void setX(int index, double value) {
        x[index] = value;
        fitness = 0;
    }
    
    public double[] getBest() {
        return best;
    }
    
    public double getBest(int index) {
        return best[index];
    }

    public double getV(int index) {
        return v[index];
    }
    
    public void setV(int index, double value) {
        v[index] = value;
    }
    
    public double calculateFitness() {
        double temp = 0;
        for(int i = 0; i < x.length; i++) {
            temp += Math.pow(x[i], 2);
        }
        return temp;
    }
    
    public double calculateFitnessBest() {
        double temp = 0;
        for(int i = 0; i < best.length; i++) {
            temp += Math.pow(best[i], 2);
        }
        return temp;
    }
    
    public double getFitness() {
        if(fitness == 0) {
            fitness = calculateFitness();
        }
        return fitness;
    }
}