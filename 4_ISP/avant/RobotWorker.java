package isp.avant;


public class RobotWorker implements Worker {
    
    @Override
    public void work() {
        System.out.println("Le robot travaille 24h/24 sans fatigue");
    }
    
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Les robots ne mangent pas !");
    }
}