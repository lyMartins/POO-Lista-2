package q2Lista2;

public class Ponto2D {
	
	private double coordenadasX, coordenadasY; 

	public Ponto2D() {
		this.coordenadasX = 0;
		this.coordenadasY = 0;
	}
	
	public Ponto2D(double coordenadasX, double coordenadasY) {
		this.coordenadasX = coordenadasX;
		this.coordenadasY = coordenadasY ;
	}

	public Ponto2D(Ponto2D outro) { 
		this.coordenadasX = outro.coordenadasX; 
		this.coordenadasY = outro.coordenadasY; 
		}	
	
	public double getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(double coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public double getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(double coordenadasY) {
        this.coordenadasY = coordenadasY;
    }
	
    public boolean equals(Ponto2D outro) {
        return this.coordenadasX == outro.coordenadasX && this.coordenadasY == outro.coordenadasY;
    }
    
    public double distancia(Ponto2D outro) {
    	double dx = outro.coordenadasX - this.coordenadasX;
        double dy = outro.coordenadasY - this.coordenadasY;
    	double resultado = Math.sqrt((dx * dx) + (dy * dy));
    	return resultado;
    }
}
