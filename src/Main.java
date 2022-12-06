public class Main {


    public static void main(String[] args) {

        //  ООП Задание 1,2,4,6
        System.out.println("ООП Задание 1,2,4,6");



        Human maxim = new Human("Максим ","Минск", -1988, "");
        System.out.println(maxim);
        Human anna = new Human("Аня ", "Москва", -1993, "методиста образовательных программ");
        System.out.println(anna);
        Human katy = new Human("", "Калининград", 1992, "продакт-менеджера");
        System.out.println(katy);
        Human artem = new Human("Артём ", "Москва", 1995,"директора по развитию бизнеса");
        System.out.println(artem);

        System.out.println(" ");

        // Задание 3,5,7
        System.out.println("Задание 3,5,7");

        Car lada = new Car("Lada", "Granta", 2015,
                "Россия", "", 1.7);
        lada.welcomeMassage();
        Car audi = new Car("Audi", "A8 50L TDI quattro", 2020,
                "", "Черный", 3.0);
        audi.welcomeMassage();
        Car bmw = new Car("BMW", "Z8", 0,
                "null", "Черный", 3.0);
        bmw.welcomeMassage();
        Car kia = new Car("Kia", "Sportage 4-ого поколения", 2018,
                "Южная Корея", "", 2.4);
        kia.welcomeMassage();
        Car hyundai = new Car("Hyundai", "Avante", -2016,
                "Южная Корея", "Оранжевый", 1.6);
        hyundai.welcomeMassage();

    }
}