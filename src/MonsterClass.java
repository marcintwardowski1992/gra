public class MonsterClass{


    int HP;
    int AT;

    public MonsterClass(int HP, int AT) {
        this.HP = HP;
        this.AT = AT;
    }

    public int getHP() {
        return HP;
    }

    public int getAT() {
        return AT;
    }

    public void setAT(int AT) {
        this.AT = AT;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public MonsterClass() {
    }


    public String getRace() {
        MonsterRandomGenerator monster = new MonsterRandomGenerator();
        return monster.monsterRaceGenerator();
    }

    /*@Override
    public int getHP() {
        return 0;
    }

    @Override
    public int setHP() {
        return 0;
    }

    @Override
    public int getAT() {
        return 0;
    }

    @Override
    public int setAT() {
        return 0;
    }*/
}
