package Questão4;

public class circulo {
    double raio, x,y;


    public circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    public circulo(double raio) {
        this.raio = raio;
        this.x = 0;
        this.y = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double inflacao(double Valor) {
        raio += Valor;
        return raio;
    }

    public double desinflar(double Valor) {
        raio -= Valor;
        return raio;
    }

    public double areaCirculo(){
        double area = (Math.PI*(raio*raio));
        return area;
    }
}
