package jp.ac.uryukyu.ie.e195758;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    String getname(){
        return this.name;
    }
    void setname(String name){
        this.name = name;
    }
    int gethitpoint(){
        return this.hitPoint;
    }
    void sethitpoint(int hitpoint){
        this.hitPoint = hitpoint;
    }
    int getattack(){
        return this.attack;
    }
    void setattack(int attack){
        this.attack = attack;
    }
    boolean getdead(){
        return this.dead;
    }
    void setdead(boolean dead){
        this.dead = dead;
    }

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name;
    }
    public void attack(LivingThing opponent){
        if(dead != true) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }


}
