public class CargoInfo {

    private final Dimensions dimensions;
    private final double mass;
    private final String deliveryAddress;
    private final boolean canBeTurned;
    private final String registrationNumber;
    private final boolean fragile;

    public CargoInfo(Dimensions dimensions, double mass,
                     String deliveryAddress, boolean canBeTurned,
                     String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.deliveryAddress = deliveryAddress;
        this.canBeTurned = canBeTurned;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public CargoInfo setDeliveryAddress(String deliveryAddress) {
        return new CargoInfo(this.dimensions, this.mass,
                deliveryAddress, this.canBeTurned,
                this.registrationNumber, this.fragile);
    }

    public CargoInfo setDimencions(Dimensions dimensions) {
        return new CargoInfo(dimensions, this.mass,
                this.deliveryAddress, this.canBeTurned,
                this.registrationNumber, this.fragile);
    }

    public CargoInfo setMass(Double mass) {
        return new CargoInfo(this.dimensions, mass,
                this.deliveryAddress, this.canBeTurned,
                this.registrationNumber, this.fragile);
    }

    public Dimensions getDimencions() {
        return dimensions;
    }

    public double getMass() {
        return mass;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isCanBeTurned() {
        return canBeTurned;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    @Override
    public String toString() {
        return "Груз " + registrationNumber +
                "\nАдрес доставки: " + deliveryAddress +
                "\nГабариты: " + dimensions.getLength() + "x" + dimensions.getWidth() + "x" + dimensions.getHeight() +
                "\nМасса: " + mass +
                "\nМожно переворачивать: " + (canBeTurned ? "Да" : "Нет") +
                "\nХрупкий: " + (fragile ? "Да" : "Нет") + "\n";
    }
}
