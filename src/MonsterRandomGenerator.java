import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class MonsterRandomGenerator  {

    String monsterRaceGenerator(){

        int x = randomIntGenerator();
        String[] monster = new String[10];
        monster[0] = "Ork";
        monster[1] = "Goblin";
        monster[2] = "Minotaur";
        monster[3] = "Smok";
        monster[4] = "Ghul";
        monster[5] = "Duch";
        monster[6] = "Elf";
        monster[7] = "Trol";
        monster[8] = "Wampoir";
        monster[9] = "Ludzie";

        return monster[x];
    }

    int randomIntGenerator(){
        Random generator = new Random();
        int i = generator.nextInt(10);
        return i;
    }

    /*HashMap<String, MonsterClass> =

    int setHPgenerator(int x){
        MonsterClass monsterClass = new MonsterClass();
        monsterClass.setHP();

    }*/

}
