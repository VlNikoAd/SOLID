import interfaces.SearchProduct;
import interfaces.ShowStockShop;

import java.util.Scanner;

public class Shop implements SearchProduct, ShowStockShop {
    Scanner scan = new Scanner(System.in);

    String[] listProducts = new String[]{
            "Молоко", "Яйца", "Хлеб", "Авакадо"};

    int[] count = new int[]{
            50, 80, 60, 20};

    protected void purchase() {
        System.out.println("Что вы хотите купить ");
        int choice = scan.nextInt();
        System.out.println("В количестве ...");
        int amount = scan.nextInt();
        if (choice <= listProducts.length) {
            System.out.println(" Вы купили " + listProducts[choice - 1]
                    + " В количестве " + amount + " шт.");
        } else {
            System.out.println("Такого пункта нет");
        }
    }

    //Принцип инверсии зависимости (SOLID)
    //Принцип разделения интерфейсов (SOLID)
    @Override
    public void showStockShop(String[] listProduct, int[] count) {
        System.out.println("Наш ассортимент: ");
        for (int i = 0; i < listProduct.length; i++) {
            String product = listProduct[i];
            int price = count[i];
            System.out.println(i + 1 + " " + product + " - в наличии,  " + "цена: " + price);
        }
    }

    ////Метод DRY, позволяющий отказаться от повтора ввода продукта
    @Override
    public void searchProduct(String products, String[] listProduct) {
        for (String s : listProduct) {
            if (s.equals(products)) {
                System.out.println(s + " в наличии");
            }
        }
    }
}

