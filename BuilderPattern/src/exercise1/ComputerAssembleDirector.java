package exercise1;

public class ComputerAssembleDirector {

    public ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer assemble(CPU cpu, Memory memory, HardDisk hardDisk, MainFrame mainFrame, Monitor monitor) {
        computerBuilder.buildCPU(cpu);
        computerBuilder.buildMemory(memory);
        computerBuilder.buildHardDisk(hardDisk);
        computerBuilder.buildMainFrame(mainFrame);
        if (computerBuilder.isMonitor()) {
            computerBuilder.buildMonitor(monitor);
        }
        return computerBuilder.produceComputer();
    }
}
