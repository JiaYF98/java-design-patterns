package exercise1;

public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCPU(CPU cpu);

    public abstract void buildMemory(Memory memory);

    public abstract void buildHardDisk(HardDisk hardDisk);

    public abstract void buildMainFrame(MainFrame mainFrame);

    public abstract void buildMonitor(Monitor monitor);

    public Computer produceComputer() {
        return computer;
    }

    public boolean isMonitor() {
        return true;
    }
}
