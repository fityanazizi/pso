package PSO;
/**
 *
 * @author fityan
 */
public class PSO {    
    public void updateVelocity(Particle particle, double[] best, double[] r1, double[] r2) {
        
        double[] inertiaTerm = new double[Hyperparameter.getNumOfVariables()];
        double[] cognitiveTerm = new double[Hyperparameter.getNumOfVariables()];
        double[] socialTerm = new double[Hyperparameter.getNumOfVariables()];
        
        for(int i = 0; i < inertiaTerm.length; i++) {
            inertiaTerm[i] = Hyperparameter.getInertiaCoeff() * particle.getV(i);
        }
        
        for(int i = 0; i < cognitiveTerm.length; i++) {
            cognitiveTerm[i] = (particle.getBest(i) - particle.getX(i)) 
                    * (Hyperparameter.getCognitiveCoeff() * r1[i]);
        }
        
        for(int i = 0; i < socialTerm.length; i++) {
            socialTerm[i] = (best[i] - particle.getX(i))
                    * (Hyperparameter.getSocialCoeff() * r2[i]);
        }
        
        for(int i = 0; i < Hyperparameter.getNumOfVariables(); i++) {
            particle.setV(i, inertiaTerm[i] + cognitiveTerm[i] + socialTerm[i]);
        }
 
    }
    
    public void updatePosition(Particle particle) {
        for(int i = 0; i < Hyperparameter.getNumOfVariables(); i++) {
            particle.setX(i, particle.getX(i) + particle.getV(i));
        }
    }
    
    public void updateBest(Particle particle) {
        for(int i = 0; i < Hyperparameter.getNumOfVariables(); i++) {
            if(particle.getFitness() < particle.calculateFitnessBest()) {
                particle.best = particle.x;
            }
        }
    }
    
    public void optimize(Population swarm) {

        double[] r1 = new double[Hyperparameter.getNumOfVariables()];
        double[] r2 = new double[Hyperparameter.getNumOfVariables()];
        for(int i = 0; i < Hyperparameter.getNumOfVariables(); i++) {
            r1[i] = Math.random()*0.5;
            r2[i] = Math.random()*0.5;
        }
        
        for(int i = 0; i < Hyperparameter.getnumOfPopulations(); i++) {
            updateVelocity(swarm.getParticle(i), swarm.getFittest().getBest(), r1, r2);
            updatePosition(swarm.getParticle(i));
            updateBest(swarm.getParticle(i));
        }
    }
}