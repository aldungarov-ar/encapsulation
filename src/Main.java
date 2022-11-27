public class Main {
    public static void main(String[] args) {

        /*Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/

        Dimensions d1 = new Dimensions(10, 20, 3);
        CargoInfo cargoInfo = new CargoInfo(d1, 25.0,
                "SPb, Dvortsovaya sqr, 1", false,
                "ФИС123", true);

        System.out.println(cargoInfo);

        Dimensions d2 = new Dimensions(15, 26, 7);
        CargoInfo cargoInfoDimensionsChanged = cargoInfo.setDimencions(d2);
        CargoInfo cargoInfoDimensionsAndMassChanged = cargoInfoDimensionsChanged.setMass(28.95);
        CargoInfo cargoInfoMassAndDeliveryAddressChanged =
                cargoInfoDimensionsAndMassChanged.setDeliveryAddress("Tbilisi, Godziashvili 12");

        System.out.println(cargoInfo);
        System.out.println(cargoInfoDimensionsChanged);
        System.out.println(cargoInfoDimensionsAndMassChanged);
        System.out.println(cargoInfoMassAndDeliveryAddressChanged);
    }
}
