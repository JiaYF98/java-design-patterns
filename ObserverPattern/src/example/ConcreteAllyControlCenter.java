package example;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("--------------");
        this.allName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allName + "战队紧急通知，盟友" + name + "遭受到敌人攻击！");

        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
