package JavaCoreHomeWork1;

public class Main {
    private Team team;


    public static void main(String[] args) {


        Course c = new Course(new Run(400),new Swim(100),new Jump(1.5f));

        Team team = new Team("GU_QA_1416", new TeamMembers("Dmitry",500,100,
                2.5f),new TeamMembers("Olga",300,50,1.5f),
                new TeamMembers("Fedor",200,15,1.3f),
                new TeamMembers("Viktor",400,150,2.3f));


        team.getAllInfoTeam();

        c.doIt(team);

        System.out.println("\n======== Результаты ========\n");

       team.showResults();


    }



}
