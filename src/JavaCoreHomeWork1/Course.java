package JavaCoreHomeWork1;

import java.util.Arrays;

public class Course {
    private Action obsts[];

    public Course(Action... obsts) {
        this.obsts = obsts;
    }

    public Action[] getObsts() {
        return obsts;
    }

    public void doIt(Team team) {
            for (TeamMembers c : team.getMembers()) {
                for (Action o : getObsts()) {
                    o.doIt(c);
                    System.out.println();
                }
            }
    }
}