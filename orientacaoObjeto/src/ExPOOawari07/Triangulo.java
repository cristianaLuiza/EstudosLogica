package ExPOOawari07;

public class Triangulo {
    private int a;
    private int b;
    private int c;

    public double Verificador() {
        double area = 0;
        if (a + b > c & b + c > a & a + c > b) {
            System.out.println("Valores válidos");
            float p = (a + b + c) / 2f;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println("Valores inválidos");
        }
        return area;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
