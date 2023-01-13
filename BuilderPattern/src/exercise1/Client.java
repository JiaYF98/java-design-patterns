package exercise1;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new LaptopBuilder();
        ComputerAssembleDirector director = new ComputerAssembleDirector();
        director.setComputerBuilder(computerBuilder);

        Computer computer = director.assemble(new CPU(), new Memory(), new HardDisk(), new MainFrame(), new Monitor());
        System.out.println(computer.toString());
    }
}
