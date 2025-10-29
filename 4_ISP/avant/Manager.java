package isp.avant;

public class Manager {
    
    public void manageWork(Worker worker) {
        System.out.println("\nGestion d'un travailleur:");
        worker.work();
        
        try {
            worker.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
    
    public void manageLunchBreak(Worker worker) {
        System.out.println("\nPause déjeuner:");

        try {
            worker.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("Impossible de faire manger ce travailleur: " + e.getMessage());
        }
    }
}
