package exercise1;

public class TCLFactory implements AbstractFactory {
    @Override
    public TV productTV() {
        System.out.println("TCL电视生产成功");
        return new TCLTV();
    }

    @Override
    public AirConditioning productAirConditioning() {
        System.out.println("TCL空调生产成功");
        return new TCLAirConditioning();
    }
}
