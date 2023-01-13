package exercise3;

public class Customer implements Cloneable{
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer clone() {
        try {
            return (Customer) super.clone();
        } catch (Exception e) {
            System.out.println("克隆失败！");
            return null;
        }
    }
}
