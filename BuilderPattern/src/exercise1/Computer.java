package exercise1;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;
    private MainFrame mainFrame;
    private Monitor monitor;

    public CPU getCPU() {
        return cpu;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", hardDisk=" + hardDisk +
                ", mainFrame=" + mainFrame +
                ", monitor=" + monitor +
                '}';
    }
}
