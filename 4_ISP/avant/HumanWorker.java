package isp.avant;

public class HumanWorker implements Worker {
    
    @Override
    public void work() {
        System.out.println("L'humain travaille avec concentration");
    }
    
    @Override
    public void eat() {
        System.out.println("L'humain mange pendant la pause déjeuner");
    }
}