package entities;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adcionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removaDoEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
               + ", $ "
               + String.format("%.2f" , preco)
               + ", "
               + quantidade
               + " units, Total: $ "
               + String.format("%.2f" , valorTotalEmEstoque()) ;
    }
}
