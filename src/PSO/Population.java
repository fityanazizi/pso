package PSO;

/**
 *
 * @author fityan
 */
public class Population {
    Particle[] particle;
    
    public Population(int n, boolean init) {
        particle = new Particle[n];
        if(init) {
            for(int i = 0; i < n; i++) {
                particle[i] = new Particle();
            }
        }
    }
    
    public void saveParticle(int index, Particle particle) {
        this.particle[index] = particle;
    }
    
    public Particle getParticle(int index) {
        return particle[index];
    }
    
    public Particle getFittest() {
        Particle fittest = particle[0];
        for(int i = 1; i < particle.length; i++) {
            if(particle[i].calculateFitnessBest() < fittest.calculateFitnessBest()) {
                fittest = particle[i];
            }
        }
        return fittest;
    }
}