package exercise1;

public class Client {
    public static void main(String[] args) {
        DataChart dataChart_previous, dataChart_new;
        dataChart_previous = new DataChart();
        DataSet dataSet = new DataSet();
        dataChart_previous.setDataSet(dataSet);

        try {
            dataChart_new = dataChart_previous.deepClone();
            System.out.println("图表是否相同" + (dataChart_previous == dataChart_new));
            System.out.println("数据集是否相同" + (dataChart_previous.getDataSet() == dataChart_new.getDataSet()));
        } catch (Exception e) {
            System.out.println("克隆失败！");
        }
    }
}
