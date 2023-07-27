public abstract class Actor implements ActorBehavoir{

    private String name;
    private  boolean MadeOrder;
    private boolean TookOrder;

    public Actor(String name1, boolean MadeOrder1, boolean TookOrder1){
        this.name=name1;
        this.MadeOrder=MadeOrder1;
        this.TookOrder=TookOrder1;
    }

    public String getName() {
        return name;
    }



}
