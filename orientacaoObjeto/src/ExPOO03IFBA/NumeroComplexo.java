package ExPOO03IFBA;

public class NumeroComplexo {
    public double parteReal ;
    public double parteImaginaria;

  public NumeroComplexo(double parteReal, double parteImaginaria){ // CONSTRUTOR
      this.parteReal = parteReal;
      this.parteImaginaria = parteImaginaria;
    }

    public double getParteImaginaria() {//GET E SET
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }
    public NumeroComplexo somar( NumeroComplexo outro){ //numero real a+c e numero imaginario bi+di
      double novaParteReal = this.parteReal + outro.parteReal;
      double novaParteImaginaria = this.parteImaginaria + outro.parteImaginaria;
      return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }
    public NumeroComplexo subtrair(NumeroComplexo outro){
        double novaParteReal = this.parteReal - outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria - outro.parteImaginaria;
        return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }
    public NumeroComplexo multiplicar(NumeroComplexo outro){
        double novaParteReal = this.parteReal * outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria * outro.parteImaginaria;
        return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }
    public NumeroComplexo divisor(NumeroComplexo outro){
        double novaParteReal = this.parteReal / outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria / outro.parteImaginaria;
        return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }
    public boolean iguais(NumeroComplexo outro){ //comparando os numero, == comparando endereços de memoria
      return this.parteReal==outro.parteReal && this.parteImaginaria == outro.getParteImaginaria();
    }
    public String toString(){//retornando a versao escrita de um obj
      return String.format("%.2f , %.2fi", parteReal, parteImaginaria);
    }
}
