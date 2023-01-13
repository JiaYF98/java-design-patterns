package exercise4;

public class Client {
    public static void main(String[] args) {
        Customer customer_previous, customer_new;
        Address address = new Address();
        customer_previous = new Customer();
        customer_previous.setAddress(address);

        try {
            customer_new = customer_previous.deepClone();
            System.out.println("客户是否相同" + (customer_previous == customer_new));
            System.out.println("地址是否相同" + (customer_previous.getAddress() == customer_new.getAddress()));
        } catch (Exception e) {
            System.out.println("克隆失败");
        }
    }
}
