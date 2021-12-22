package PSO;

/**
 *
 * @author fityan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NITERATION = 1000;
        Population pop = new Population(Hyperparameter.getnumOfPopulations(), true);
        PSO pso = new PSO();
        for(int i = 0; i < NITERATION; i++) {
            pso.optimize(pop);
        }
        System.out.println(pop.getFittest().calculateFitnessBest());
    } 
}