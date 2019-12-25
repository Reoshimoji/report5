package jp.ac.uryukyu.ie.e195758;

public class Enemy extends LivingThing {
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        sethitpoint(gethitpoint()-damage);
        if( gethitpoint() < 0 ) {
            setdead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }


}
