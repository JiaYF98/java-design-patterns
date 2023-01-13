package example;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("一号");

        Observer player1, player2, player3, player4;
        player1 = new Player("用户1");
        player2 = new Player("用户2");
        player3 = new Player("用户3");
        player4 = new Player("用户4");

        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);

        player2.beAttacked(acc);
    }
}
