import java.util.*;

class Order {
    int orderId;
    String customerName;
    String productName;
    int quantity;
    double price;

    Order(int orderId, String customerName, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return orderId + " " + customerName + " " + productName + " " + quantity + " " + price;
    }
}

public class RetailOrderDesk {
    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== RETAIL ORDER DESK =====");
            System.out.println("1. Add Order");
            System.out.println("2. Display Orders");
            System.out.println("3. Remove Order");
            System.out.println("4. Update Order");
            System.out.println("5. Sort by Order ID");
            System.out.println("6. Sort by Customer Name");
            System.out.println("7. Sort by Product Name");
            System.out.println("8. Sort by Price");
            System.out.println("9. Binary Search");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addOrder();
                    break;
                case 2:
                    displayOrders();
                    break;
                case 3:
                    removeOrder();
                    break;
                case 4:
                    updateOrder();
                    break;
                case 5:
                    sortById();
                    break;
                case 6:
                    sortByCustomer();
                    break;
                case 7:
                    sortByProduct();
                    break;
                case 8:
                    sortByPrice();
                    break;
                case 9:
                    binarySearch();
                    break;
                case 10:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 10);
    }

    static void addOrder() {
        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Order o = new Order(id, name, product, quantity, price);
        orders.add(o);

        System.out.println("Order Added Successfully!");
    }

    static void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No Orders Found");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println(orders.get(i));
            }
        }
    }

    static void removeOrder() {
        System.out.print("Enter Order ID to remove: ");
        int id = sc.nextInt();

        boolean flag = false;

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).orderId == id) {
                orders.remove(i);
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Order Removed Successfully!");
        } else {
            System.out.println("Order Not Found");
        }
    }

    static void updateOrder() {
        System.out.print("Enter Order ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean flag = false;

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).orderId == id) {
                System.out.print("Enter New Customer Name: ");
                orders.get(i).customerName = sc.nextLine();

                System.out.print("Enter New Product Name: ");
                orders.get(i).productName = sc.nextLine();

                System.out.print("Enter New Quantity: ");
                orders.get(i).quantity = sc.nextInt();

                System.out.print("Enter New Price: ");
                orders.get(i).price = sc.nextDouble();

                flag = true;
                System.out.println("Order Updated Successfully!");
                break;
            }
        }

        if (!flag) {
            System.out.println("Order Not Found");
        }
    }

    static void sortById() {
        Order temp;

        for (int i = 0; i < orders.size(); i++) {
            for (int j = 0; j < orders.size() - 1 - i; j++) {
                if (orders.get(j).orderId > orders.get(j + 1).orderId) {
                    temp = orders.get(j);
                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted by Order ID!");
        displayOrders();
    }

    static void sortByCustomer() {
        Order temp;

        for (int i = 0; i < orders.size(); i++) {
            for (int j = 0; j < orders.size() - 1 - i; j++) {
                if (orders.get(j).customerName.compareToIgnoreCase(orders.get(j + 1).customerName) > 0) {
                    temp = orders.get(j);
                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted by Customer Name!");
        displayOrders();
    }

    static void sortByProduct() {
        Order temp;

        for (int i = 0; i < orders.size(); i++) {
            for (int j = 0; j < orders.size() - 1 - i; j++) {
                if (orders.get(j).productName.compareToIgnoreCase(orders.get(j + 1).productName) > 0) {
                    temp = orders.get(j);
                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted by Product Name!");
        displayOrders();
    }

    static void sortByPrice() {
        Order temp;

        for (int i = 0; i < orders.size(); i++) {
            for (int j = 0; j < orders.size() - 1 - i; j++) {
                if (orders.get(j).price > orders.get(j + 1).price) {
                    temp = orders.get(j);
                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted by Price!");
        displayOrders();
    }

    static void binarySearch() {
        sortById();

        System.out.print("Enter Order ID to search: ");
        int id = sc.nextInt();

        int b = 0;
        int l = orders.size() - 1;
        boolean flag = false;

        while (b <= l) {
            int mid = (b + l) / 2;

            if (orders.get(mid).orderId == id) {
                System.out.println("Order Found!");
                System.out.println(orders.get(mid));
                flag = true;
                break;
            } else if (id < orders.get(mid).orderId) {
                l = mid - 1;
            } else {
                b = mid + 1;
            }
        }

        if (!flag) {
            System.out.println("Order Not Found");
        }
    }
}