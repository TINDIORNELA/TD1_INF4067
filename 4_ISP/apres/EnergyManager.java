package isp.apres;

public class EnergyManager {
    
    public void organiserRecharge(Rechargeable rechargeable) {
        System.out.println("\nOrganisation recharge énergie:");
        rechargeable.recharge();
    }
    
    public void planifierMaintenance(Rechargeable[] equipements) {
        System.out.println("\n=== Planification maintenance ===");
        for (Rechargeable equipement : equipements) {
            equipement.recharge();
        }
    }
}