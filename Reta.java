package Questão3Lista2;

public class Reta {
    private double a;
    private double b;

    // Construtor com coeficiente angular e linear
    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Construtor com dois pontos (x1, y1) e (x2, y2)
    public Reta(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new IllegalArgumentException("Reta vertical não suportada (coeficiente angular indefinido).");
        }
        this.a = (y2 - y1) / (x2 - x1);
        this.b = y1 - this.a * x1;
    }

    public double getCoeficienteAngular() {
        return a;
    }

    public double getCoeficienteLinear() {
        return b;
    }

    // Verifica se o ponto (x, y) pertence à reta
    public boolean pertence(double x, double y) {
        return y == a * x + b;
    }

    // Retorna ponto de interseção como array [x, y], ou null se paralelas
    public double[] intersecao(Reta outra) {
        if (this.a == outra.a) {
            return null; // retas paralelas
        }
        double x = (outra.b - this.b) / (this.a - outra.a);
        double y = this.a * x + this.b;
        return new double[] { x, y };
    }
}