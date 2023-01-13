package exercise3;

public class Client {
    public static void main(String[] args) {
        SystemFactory factory = new AndroidFactory();
        OperationController operationController = factory.getOperationController();
        InterfaceController interfaceController = factory.getInterfaceController();
        operationController.controlOperation();
        interfaceController.controlInterface();
    }
}
