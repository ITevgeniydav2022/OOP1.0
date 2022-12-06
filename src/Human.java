public class Human {


    public String name;
    public String town;
    public int yearBirth;
    public String job;




    public Human(String name, String town, int yearBirth, String job) {

        if (name == null || name.isEmpty()) {
            name = "Информация не указана";
        }
        this.name = name;

        if (town == null || town.isEmpty()) {
            town = "Информация не указана";
        }
        this.town = town;

        if (yearBirth < 0) {
            yearBirth = 0;
        }
        this.yearBirth = yearBirth;

        if (job == null || job.isEmpty()) {
            job = "Информация не указана";
        }
        this.job = job;
    }

    @Override
    public String toString() {
        return ("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился (лась) в " + yearBirth + " году. Я работаю на должности " + job +
                ". Будем знакомы!");
    }



    /// public void welcomeMassage() {
    //    System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
    //            ". Я родился (лась) в " + yearBirth + " году. Я работаю на должности " + job +
    //            ". Будем знакомы!");
    //}
}
