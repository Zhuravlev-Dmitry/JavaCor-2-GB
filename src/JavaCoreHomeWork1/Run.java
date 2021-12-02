package JavaCoreHomeWork1;

class Run extends Action{
    private float dist;

    public Run(float dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(TeamMembers c) {
        TeamMembers.run(dist);
    }
}
