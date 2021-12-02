package JavaCoreHomeWork1;

public class Swim extends Action{
    private float dist;

    public Swim(float dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(TeamMembers c) {
        TeamMembers.swim(dist);
    }
}
