package isp.avant;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        
        Worker humain = new HumanWorker();
        manager.manageWork(humain);
        manager.manageLunchBreak(humain);
        
        Worker robot = new RobotWorker();
        manager.manageWork(robot);
        manager.manageLunchBreak(robot); 
        

        System.out.println("L'interface Worker est trop large !");
        System.out.println("Les clients sont forcés de dépendre de méthodes qu'ils n'utilisent pas");
    }
}