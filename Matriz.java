package Questão8Lista2;

public class Matriz {
    private int linhas,colunas;
    private int dimensao;
    private double [][] elementos;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new double[linhas][colunas];
    }

    public Matriz adicionarMatriz(Matriz outra) {
        Matriz matrizNova = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizNova.elementos[i][j] = this.elementos[i][j] + outra.elementos[i][j];
            }
        }
        return matrizNova;
    }

    public boolean comparar(Matriz outra){
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (this.elementos[i][j] == outra.elementos[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public Matriz transposta() {
        Matriz matrizNova = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizNova.elementos[j][i] = this.elementos[i][j];
            }
        }
        return matrizNova;
    }

    public Matriz oposta() {
        Matriz matrizNova = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizNova.elementos[i][j] = -this.elementos[i][j];
            }
        }
        return matrizNova;
    }

    public Matriz nula() {
        Matriz matrizNova = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizNova.elementos[i][j] = 0;
            }
        }
        return matrizNova;
    }

    public boolean identidade(){
        if (linhas == colunas) {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (i == j) {
                        if (elementos[i][j] == 1){
                            return true;
                        }
                    }
                    else {
                        if (elementos[i][j] == 0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean diagonal(){
        if (linhas == colunas) {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (i == j) {
                        if (elementos[i][j] != 0){
                            return true;
                        }
                    }
                    else {
                        if (elementos[i][j] == 0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean singular(){
        if (linhas == colunas) {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (i == j) {
                        if (elementos[i][j] == elementos[i][j]){
                            return true;
                        }
                    }
                    else {
                        if (elementos[i][j] == 0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean simetrica(){
        if(linhas == colunas){
            return this.comparar(this.transposta());
        }
        return false;
    }

    public boolean antisimetrica(){
        if(linhas == colunas){
            return this.oposta().comparar(this.transposta());
        }
        return false;
    }

    public Matriz subtrair(Matriz outra) {
        Matriz matrizNova = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizNova.elementos[i][j] = this.elementos[i][j] - outra.elementos[i][j];
            }
        }
        return matrizNova;
    }

    public Matriz multiplicacao(Matriz outra) {
        Matriz matrizNova = new Matriz(linhas, colunas);
        if (this.colunas == matrizNova.linhas) {
            for (int i = 0; i < this.linhas; i++) {
                for (int j = 0; j < outra.colunas; j++){
                    double resultado = 0;
                    for (int k = 0; k < this.colunas; k++) {

                        resultado += this.elementos[i][k]* outra.elementos[k][j];

                    }
                    matrizNova.elementos[i][j] = resultado;
                }
            }
        }
        return matrizNova;
    }

    public Matriz copia() {
        Matriz copia = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                copia.elementos[i][j] = this.elementos[i][j];
            }
        }
        return copia;
    }


    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public double getElementos(int linhas, int colunas) {
        return elementos[linhas][colunas];
    }

    public void setElementos(int linhas, int colunas, double Valor){
        elementos[linhas][colunas] = Valor;
    }
}
