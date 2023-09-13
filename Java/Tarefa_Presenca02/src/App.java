import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        double sumProducts = 0;
        double averageProducts = 0;
        int totalQuantities = 0;
        Produto produto;
        for(int index = 0; index < 20; index++) {
            produto = new Produto();
            //produtos[index] = produto; //
            produtos.add(produto);
            boolean ok = false;
            while(!ok) {
                boolean nameOk = true;
                System.out.println("Informe o nome do produto" + (index +1)+"/20");
                String name = teclado.nextLine();
                for(int i = 0; i< index; i++) {
                    if(name.equals(produtos.get(i).getName())) { //
                        nameOk = false;
                        System.out.println("Produto já cadastrado.");
                        break;
                    }
                }
                if(nameOk) {
                    produto.setName(name);
                    ok = true;
                }
            }
            System.out.println("Informe a Descrição do produto" + (index +1)+"/20");
            produto.setDescription(teclado.nextLine());
            double value = -1;
            while(value < 0) {
                System.out.println("Informe o valor do produto"  + (index +1)+"/20");
                value = Double.parseDouble(teclado.nextLine());
            }
            produto.setValue(value);
            int quantity = -1;
            while(quantity < 0) {
                System.out.println("Informe a quantidade do produto em estoque"  + (index +1)+"/20");
                quantity = Integer.parseInt(teclado.nextLine());
            }
            produto.setQuantity(quantity);
            sumProducts += produto.getTotalValue();
            totalQuantities += produto.getQuantity();
        }
        averageProducts = sumProducts/totalQuantities;
        System.out.println("O valor total dos produtos é "+sumProducts);
        System.out.println("O valor médio dos produtos é "+averageProducts);
        System.out.println("A quantidade total de produtos em estoque é "+totalQuantities);
        double sum = 0;
        System.out.println("Os produtos com baixo estoque são");

        for(int index = 0; index < produtos.size(); index++) {
            if(produtos.get(index).getQuantity() <= 5) { //
                System.out.println(produtos.get(index).getName());
                sum+= produtos.get(index).getTotalValue();
            }
        }
        System.out.println("O valor total dos produtos com baixo estoque é "+sum);
        teclado.close();
    }
}
