package exercise1;

public class DesktopBuilder extends ComputerBuilder {
    @Override
    public void buildCPU(CPU cpu) {
        System.out.println("台式机 CPU 组建成功！");
        computer.setCPU(cpu);
    }

    @Override
    public void buildMemory(Memory memory) {
        System.out.println("台式机内存组建成功！");
        computer.setMemory(memory);
    }

    @Override
    public void buildHardDisk(HardDisk hardDisk) {
        System.out.println("台式机硬盘组建成功！");
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void buildMainFrame(MainFrame mainFrame) {
        System.out.println("台式机主机组建成功！");
        computer.setMainFrame(mainFrame);
    }

    @Override
    public void buildMonitor(Monitor monitor) {
        System.out.println("台式机显示器组建成功！");
        computer.setMonitor(monitor);
    }
}
