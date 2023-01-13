package exercise2;

public class Client {
    public static void main(String[] args) {
        OfficialDocument doc1, doc2, doc3, doc4;
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();
        doc1 = prototypeManager.getOfficialDocument("far");
        doc1.display();
        doc2 = prototypeManager.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = prototypeManager.getOfficialDocument("srs");
        doc3.display();
        doc4 = prototypeManager.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);
    }
}
