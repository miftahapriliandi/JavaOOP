public class ManagerApp {
    public static void main(String[] args) {
        
        var manager = new Manager("Miftah");
        manager.sayHello("Alvin");

        var vp = new VicePresident("Reza");

        vp.sayHello("Alvin");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
