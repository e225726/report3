package jp.ac.uryukyu.ie.e225726;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    
    @Test void warriorTest() {
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
        Enemy slime = new Enemy("スライムもどき", 1000, 2);
        
        for(int count=0; count<3; count++){
            int beforeHp = slime.hitPoint;
            int weponSkill_1 = (int)1.5 * demoWarrior.attack;
            demoWarrior.attackWithWeponSkill(slime);
            int afterHp = slime.hitPoint;
            int weponSkill_2 = beforeHp - afterHp;
            assertEquals(weponSkill_1, weponSkill_2);
        }
   
    }
}
