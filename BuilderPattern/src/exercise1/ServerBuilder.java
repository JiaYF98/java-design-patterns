package exercise1;

public class ServerBuilder extends ComputerBuilder {
    @Override
    public void buildCPU(CPU cpu) {
        System.out.println("服务器 CPU 组建成功！");
        computer.setCPU(cpu);
    }

    @Override
    public void buildMemory(Memory memory) {
        System.out.println("服务器内存组建成功！");
        computer.setMemory(memory);
    }

    @Override
    public void buildHardDisk(HardDisk hardDisk) {
        System.out.println("服务器硬盘组建成功！");
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void buildMainFrame(MainFrame mainFrame) {
        System.out.println("服务器主机组建成功！");
        computer.setMainFrame(mainFrame);
    }

    @Override
    public void buildMonitor(Monitor monitor) {

    }

    @Override
    public boolean isMonitor() {
        return false;
    }
}
