package exercise1;

public class Nvwa {
    public static People createPeople(char type) {
        People people = null;
        switch (type) {
            case 'M':
                people = new Man();
                break;
            case 'W':
                people = new Woman();
                break;
        }
        return people;
    }
}
