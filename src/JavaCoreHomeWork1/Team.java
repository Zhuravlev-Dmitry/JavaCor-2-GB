package JavaCoreHomeWork1;

public class Team {
    private String teamName;
    private TeamMembers members[];



    public Team(String teamName, TeamMembers... members) {
        this.teamName = teamName;
        this.members = members;
    }

    public TeamMembers[] getMembers() {
        return members;
    }

    public void getAllInfoTeam() {
        System.out.println("Список всех участников: ");
        for (TeamMembers members : members)
            System.out.println(members);
    }



   public void showResults() {
       System.out.printf("%s info:\n", teamName);
           for (TeamMembers c : members)
               c.result();
    }

}
