public class ManagerApp {
    public static void main(String[] args) {
        
        var manager = new Manager("Miftah");
        manager.sayHello("Alvin");

        var vp = new VicePresident("Reza");

        vp.sayHello("Alvin");
    }
}
