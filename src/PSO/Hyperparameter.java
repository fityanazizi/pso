/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PSO;

/**
 *
 * @author fityan
 */
public class Hyperparameter {
    private final static int NVARIABLES = 5;
    private final static int NPOPULATIONS = 50;
    private final static double COGNITIVE = 1.496180;
    private final static double SOCIAL = 1.496180;
    private final static double INERTIA = 0.729844;
    
    static int getNumOfVariables() {
        return NVARIABLES;
    }
    
    static int getnumOfPopulations() {
        return NPOPULATIONS;
    }
    
    static double getCognitiveCoeff() {
        return COGNITIVE;
    }
    
    static double getSocialCoeff() {
        return SOCIAL;
    }
    
    static double getInertiaCoeff() {
        return INERTIA;
    }
    
}
