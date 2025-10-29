package isp.apres;

public class HumanWorker implements Workable, Eatable {
    
    @Override
    public void work() {
        System.out.println("L'humain travaille avec concentration et créativité");
    }
    
    @Override
    public void eat() {
        System.out.println("L'humain mange un repas équilibré");
    }
    
    public void prendrePause() {
        System.out.println("L'humain prend une pause café");
    }
}