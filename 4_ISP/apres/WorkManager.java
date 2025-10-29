package isp.apres;

public class WorkManager {
    
    public void assignWork(Workable worker) {
        System.out.println("\nAssignation de travail:");
        worker.work();
    }
    
    public void superviserEquipe(Workable[] equipe) {
        System.out.println("\n=== Supervision d'équipe ===");
        for (Workable worker : equipe) {
            worker.work();
        }
    }
}