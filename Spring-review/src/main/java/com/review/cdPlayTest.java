package com.review;




import com.review.CDPlayConfig;
import com.review.PC.lenovo;
import com.review.cd.gameCd;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class cdPlayTest {
    @Autowired
    private gameCd game;

    @Autowired
    private lenovo lenovo;

    @Test
    public void testCDObjectIsNull(){
            assertNotNull(game);
            game.play();
            lenovo.CDPlayer();
        System.out.println("不许修改");
    }
}
