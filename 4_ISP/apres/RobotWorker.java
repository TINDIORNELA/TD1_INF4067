package isp.apres;

public class RobotWorker implements Workable, Rechargeable {
    
    @Override
    public void work() {
        System.out.println("Le robot travaille avec précision et efficacité");
    }
    
    @Override
    public void recharge() {
        System.out.println("Le robot se recharge sur sa station d'énergie");
    }
    

    public void effectuerMaintenance() {
        System.out.println("Le robot effectue son auto-diagnostic");
    }
}