public class PersonApp {

    public static void main(String[] args) {

        var person1 = new Person("Miftah", "Subang");
        // person1.country = "US";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Reza");
        person2.sayHello("Budi");

        Person person3;
        person3 = new Person();
        person3.name = "Alvin";

        person3.sayHello("Budi");
    }

}
