public class Car {

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double engineVolume;

    public Car(String brand, String model, int productionYear,
               String productionCountry, String color, double engineVolume) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;

        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    void welcomeMassage() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год выпуска: "
                + productionYear + ", Страна производства: " + productionCountry + ", Цвет: "
                + color + ", Объем двигателя: " + engineVolume + ".");
    }
}
