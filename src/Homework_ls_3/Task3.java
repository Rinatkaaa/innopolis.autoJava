package Homework_ls_3;

public class Task3 {
    public static void main(String[] args) {

        Item product1 = new Item("Рубашка", "145346е", 2000, 3, "Gucci" );
        Item product2 = new Item("Брюки", "456789а", 7000, 2, "Armani" );
        Item product3 = new Item("Телефон", "363221т", 80000, 1, "iPhone" );
        Item product4 = new Item("Холодильник", "855438н", 40000, 1, "LG" );
        Item product5 = new Item("Клавиатура", "615478и", 20000, 5, "ARDOR" );

        System.out.println("\"" + product1.vendorCode + " - " + product1.name + " - " + product1.price + " - " + product1.quantity + " - " + "[Yellow]\"");
        System.out.println("\"" + product2.vendorCode + " - " + product2.name + " - " + product2.price + " - " + product2.quantity + " - " + "[Blue]\"");
        System.out.println("\"" + product3.vendorCode + " - " + product3.name + " - " + product3.price + " - " + product3.quantity + " - " + "[Green]\"");
        System.out.println("\"" + product4.vendorCode + " - " + product4.name + " - " + product4.price + " - " + product4.quantity + " - " + "[Red]\"");
        System.out.println("\"" + product5.vendorCode + " - " + product5.name + " - " + product5.price + " - " + product5.quantity + " - " + "[White]\"");

    }
}
