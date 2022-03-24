public class ManagerApp {
    public static void main(String[] args) {
        
        var manager = new Manager();
        manager.name = "Miftah";
        manager.sayHello("Alvin");

        var vp = new VicePresident();
        vp.name = "Reza";
        vp.sayHello("Alvin");
    }
}
