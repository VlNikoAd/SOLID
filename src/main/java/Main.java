import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        Delivery delivery = new Delivery("Koroleva", "26");

        while (true) {
            System.out.println("""
                    Меню магазина
                    Поиск по названию\s
                    Покупка\s
                    Доставка\s""");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> shop.showStockShop(shop.listProducts, shop.count);
                case 2 -> shop.searchProduct("Молоко", shop.listProducts);
                case 3 -> shop.purchase();
                case 4 -> delivery.order(delivery);
            }
        }
    }
}
