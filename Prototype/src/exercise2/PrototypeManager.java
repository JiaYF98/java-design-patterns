package exercise2;

import java.util.HashMap;

public class PrototypeManager {
    private final HashMap<String, OfficialDocument> hashMap = new HashMap<>();
    private static final PrototypeManager prototypeManager = new PrototypeManager();

    private PrototypeManager() {
        hashMap.put("far", new FAR());
        hashMap.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        hashMap.put(key, doc);
    }

    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) hashMap.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return prototypeManager;
    }
}
