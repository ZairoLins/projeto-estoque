import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto:");
        System.out.println("Nome: ");
        product.nome = sc.nextLine();
        System.out.println("Preço: ");
        product.preco = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        product.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.println("Digite a quantidade de produtos a ser adicionado: ");
        int quantidade = sc.nextInt();
        product.adcionarProdutos(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.println("Digite a quantidade de produtos a ser removidos: ");
        quantidade = sc.nextInt();
        product.removaDoEstoque(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        sc.close();
    }

}