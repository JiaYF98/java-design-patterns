package example;

public class Client {
    public static void main(String[] args) {
        ActorBuilder actorBuilder;
        actorBuilder = (ActorBuilder) XMLUtil.getBean();
        if (actorBuilder != null) {
            ActorController actorController = new ActorController();
            Actor actor = actorController.construct(actorBuilder);
            System.out.println(actor.getType());
            System.out.println(actor.getSex());
            System.out.println(actor.getFace());
            System.out.println(actor.getCostume());
            System.out.println(actor.getHairstyle());
        }
    }
}
