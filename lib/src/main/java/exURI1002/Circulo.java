package exURI1002;
/**
 * @author moyses
 * A classe <code>Circulo</code> representa um círculo com raio.
 */
public class Circulo {
    private double raio;
    private static final double PI = 3.14159;
   
    /**
     * 
     * @param raio
     */
    public Circulo(double raio) {
		super();
		this.raio = raio;
	}
    
    /**
     * 
     * @return area do circulo
     */
    public double getArea() {
    	return raio*raio* PI;
    }
}
