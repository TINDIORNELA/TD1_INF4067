package isp.apres;

public class LunchManager {
    
    public void organiserPauseDejeuner(Eatable mangeur) {
        System.out.println("\nOrganisation pause déjeuner:");
        mangeur.eat();
    }
    
    public void organiserBuffet(Eatable[] mangeurs) {
        System.out.println("\n=== Organisation buffet ===");
        for (Eatable mangeur : mangeurs) {
            mangeur.eat();
        }
    }
}