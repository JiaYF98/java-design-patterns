package exercise1;

public class Client {
    public static void main(String[] args) {
        WTO wto = new WTO();
        China china = new China(wto);
        America america = new America(wto);

        wto.setChina(china);
        wto.setAmerica(america);

        china.declare("中国发送的消息");
        america.declare("美国发送的消息");
    }
}
