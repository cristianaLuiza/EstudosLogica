package ExPOO04IFBA;

public class Reta {

    public int coeficienteAngular;
    public int coefieicneteLinear;

    public Reta(int coeficienteAngular, int coefieicneteLinear) { //CONSTRUTORES SOBRECARREGADOS
        int x = 1;
        this.coeficienteAngular = coeficienteAngular * x;
        this.coefieicneteLinear = coefieicneteLinear;
    }

    public int getCoeficienteAngular() { //METODOS DE ACESSO
        return coeficienteAngular;
    }

    public void setCoeficienteAngular(int coeficienteAngular) {
        this.coeficienteAngular = coeficienteAngular;
    }

    public int getCoefieicneteLinear() {
        return coefieicneteLinear;
    }

    public void setCoefieicneteLinear(int coefieicneteLinear) {
        this.coefieicneteLinear = coefieicneteLinear;
    }

    public boolean verifica() { // VERIFICA SE UM PONTO X OU Y PERTENCE A RETA
        int reta = 2;
        int x = 1;
        return reta == (this.coeficienteAngular * x) + this.coeficienteAngular;
    }

    @Override
    public String toString() { //RETORNO TIPO STRING DA RETA
        return "Reta " +
                "Coeficiente Angular= " + coeficienteAngular +
                ", Coeficiente Linear= " + coefieicneteLinear +
                '}';
    }

    public boolean outraReta() { //INTERSEÇÃO OU PARALELAS
        int outraRetaAngular = 5;
        int outraRetaLinear = 8;
        if (outraRetaAngular == this.coeficienteAngular && outraRetaLinear == this.coefieicneteLinear) {
           return true;
        } else {
             return false;
        }
    }
}


//) Escreva em Java uma classe que represente uma reta (y=ax+b).
//Forneça os seguintes membros de classe:
//a) Construtores sobrecarregados que criem uma reta a partir de:
//i) Dois valores, representando o coeficiente angular e o
//coeficiente linear da reta;
//ii) Dois pontos;
//b) Métodos de acesso para o coeficiente angular e para o
//coeficiente linear da reta;
//c) Um método que verifique se um ponto dado pertence a reta;
//d) Um método que gere e retorne a representação String da reta;
//e) Um método que dada uma outra reta, retorne o ponto de interseção
//da reta dada ou null se as retas forem paralelas.