import java.util.Locale;
import java.util.Scanner;

public class estoque {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produto produto = new produto();
        System.out.println("Digite os dados do produto:");
        System.out.println("Nome: ");
        produto.nome = sc.nextLine();
        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);

        sc.close();
    }

}