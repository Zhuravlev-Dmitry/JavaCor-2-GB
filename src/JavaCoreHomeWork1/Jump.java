package JavaCoreHomeWork1;

public class Jump extends Action{
    private float dist;

    public Jump(float dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(TeamMembers c) {
        TeamMembers.jump(dist);
    }
}
