package exercise1;

public abstract class FileConvertor {
    protected DataHandler handler;

    public void setHandler(DataHandler handler) {
        this.handler = handler;
    }

    public abstract void convertData();
}
