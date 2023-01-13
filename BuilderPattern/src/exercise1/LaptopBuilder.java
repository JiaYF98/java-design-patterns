package exercise1;

public class LaptopBuilder extends ComputerBuilder {
    @Override
    public void buildCPU(CPU cpu) {
        System.out.println("笔记本 CPU 组装成功！");
        computer.setCPU(cpu);
    }

    @Override
    public void buildMemory(Memory memory) {
        System.out.println("笔记本内存组装成功！");
        computer.setMemory(memory);
    }

    @Override
    public void buildHardDisk(HardDisk hardDisk) {
        computer.setHardDisk(hardDisk);
        System.out.println("笔记本硬盘组装成功！");
    }

    @Override
    public void buildMainFrame(MainFrame mainFrame) {
        System.out.println("笔记本主机组装成功！");
        computer.setMainFrame(mainFrame);
    }

    @Override
    public void buildMonitor(Monitor monitor) {
        System.out.println("笔记本显示器组装成功！");
        computer.setMonitor(monitor);
    }
}
