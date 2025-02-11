package ExPOO02IFBA;

public class Ponto2D {
    public double x;
    public double y;

    public Ponto2D(double x, double y) {//Construtores sobrecarregados que permitam a inicialização do ponto
        this.x = x;
        this.y = y;
    }

    public Ponto2D() {//Por default (sem parâmetros) na origem do espaço 2D
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(Ponto2D ponto) {//Construindo com outro parametro que foi passado
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public double getX() { //Métodos de acesso (getter/setter) dos atributos do ponto
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

    public void mover(double mx, double my) { // Sobrecarga de movimentos com os mesmos parametros dos contrutores
        this.x = mx;
        this.y = my;
    }

    public void mover(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    @Override
    public boolean equals(Object o) {//) Método de comparação semântica do ponto (equals)
        if (this == o) return true; //VERIFICA SE EH O MSM OBJETO, SE FOR, SÃO IGUAIS
        if (o == null || getClass() != o.getClass()) return false; // verifica se eh nulo ou se são objetos de classes diferentes;
        Ponto2D ponto2D = (Ponto2D) o; //fazer o cast do objeto para a classe Ponto2D
        return Double.compare(x, ponto2D.x) == 0 && Double.compare(y, ponto2D.y) == 0; //verifica se os atributos dos objetos tem os mesmos valores em x e y
    }

    @Override
    public String toString() {//Método de representação ou seja toString do objeto como String;
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distancia(Ponto2D ponto2D) { //Calcular distancia de dois pontos(pitagora)
        double distancias = 0;
        double raiz = ((this.x- ponto2D.x) + (this.y - ponto2D.y));
        distancias = Math.sqrt(raiz);
        return distancias;
    }

    public Ponto2D clone(){ // Cria e retorna uma nova instância de Ponto2D no mesmo local.
        return new Ponto2D(this);
    }
}
//OBS: Em Java, o clone serve para criar uma cópia de um objeto.
// É útil quando é necessário passar um objeto como parâmetro,
// mas não se quer que o objeto original seja alterado.