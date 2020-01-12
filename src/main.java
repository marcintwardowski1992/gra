public class main {
    public static void main(String[] args) {
        System.out.println("DUPA");

        MonsterRandomGenerator monster1 = new MonsterRandomGenerator();
        System.out.println(monster1.monsterRaceGenerator());

        MonsterClass monster2 = new MonsterClass();
        System.out.println(monster2.getRace());

        MonsterClass monster3 = new MonsterClass(3,4);
        System.out.println(monster3.getRace());
        System.out.println(monster3.getAT());
        /*Ork ork1 = new Ork();
        System.out.println(ork1.getRace());
        Goblin goblin1 = new Goblin();
        System.out.println(goblin1.getRace());*/
    }
}
