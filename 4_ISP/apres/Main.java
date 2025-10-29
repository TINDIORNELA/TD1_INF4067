package isp.apres;

public class Main {
    public static void main(String[] args) {

        HumanWorker humain = new HumanWorker();
        RobotWorker robot = new RobotWorker();
        

        WorkManager workManager = new WorkManager();
        LunchManager lunchManager = new LunchManager();
        EnergyManager energyManager = new EnergyManager();
        
        Workable[] equipeTravail = {humain, robot};
        workManager.superviserEquipe(equipeTravail);
        

        lunchManager.organiserPauseDejeuner(humain);
        

        energyManager.organiserRecharge(robot);
        

        System.out.println("On peut ajouter de nouveaux types de travailleurs:");
        System.out.println("- Cyborg: implémente Workable, Eatable ET Rechargeable");
        System.out.println("- Animal: implémente seulement Eatable");
        System.out.println("- Machine: implémente seulement Workable");
    }
}