import interfaces.Order;

public class Delivery implements Order {

    protected String street;
    protected String numberHome;

    //Принцип открытости и закрытости .Можно расширить класс и добавить новый метод (SOLID)
    Delivery(String street, String numberHome) {
        this.numberHome = numberHome;
        this.street = street;
    }

    @Override
    public void order(Delivery delivery) {
        if (delivery.street != null && delivery.numberHome != null)
            System.out.println("Заказ в пути! Ожидайте.");
        else
            System.out.println("Проверте заполненность полей!");
    }
}
