package JavaCoreHomeWork1;

public class TeamMembers  {
    private static String name;
    private static float maxDistRun;
    private static float maxDistSwim;
    private static float maxDistJump;
    private static boolean completeDist;



    public TeamMembers(String name, float maxDistRun, float maxDistSwim, float maxDistJump) {
        this.name = name;
        this.maxDistRun = maxDistRun;
        this.maxDistSwim = maxDistSwim;
        this.maxDistJump = maxDistJump;
        this.completeDist = true;

    }


    public boolean isCompleteDist() {
        return completeDist;
    }

    public static void run(float dist) {
        if (dist <= maxDistRun) {
            System.out.printf(name + " Ура!!! Пробежал!)");
        } else {
            System.out.printf(name + " Увы(( Сошел с дистанции.");
            completeDist = false;

        }
    }

    public static void jump(float dist) {
        if (dist <= maxDistJump) {
            System.out.printf(name + " Хороший прыжок в длину!");
        } else {
            System.out.printf(name + " Не допрыгнул(");
            completeDist = false;

        }
    }


    public static void swim(float dist) {
        if (dist <= maxDistSwim) {
            System.out.printf(name + " Ура!!! Проплыл!)");
        } else {
            System.out.printf(name + " Не доплыл, утонул(");
            completeDist = false;

        }
    }


   public void result() {
      System.out.println(name + ": "  + (isCompleteDist() ? "прошёл дистанцию" : "не прошёл дистанцию" ));
  }

}
