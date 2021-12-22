### Function Optimization using Particle Swarm Optimization
I developed this code based on [1]. the optimized function (fitness function) can be changed in the `evaluatefitness` and `evaluatefitnessbest` functions in `particle` class.

In this case, i use the sphere function[2] as the fitness function.

```java
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
```

Reference <br>
[1] X.-S. Yang, “Particle Swarm Optimization,” Nature-Inspired Optimization Algorithms. Elsevier, pp. 99–110, 2014. doi: 10.1016/b978-0-12-416743-8.00007-5. <br>
[2] Sphere function. [Online]. Available: http://www-optima.amp.i.kyoto-u.ac.jp/member/student/hedar/Hedar_files/TestGO_files/Page1113.htm.
