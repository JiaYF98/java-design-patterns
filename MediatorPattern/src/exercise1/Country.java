package exercise1;

public abstract class Country {
    protected UnitedNations unitedNations;

    public void setUnitedNations(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    public abstract void getMessage(String message);
}
