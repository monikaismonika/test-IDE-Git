package com.review.PC;

import com.review.cd.CD;
import com.review.cd.gameCd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class lenovo implements oldPC{

    private CD cd;

    @Override
    public void CDPlayer() {
        System.out.println("aaaaa");
        cd.play();

    }

    @Autowired
    public lenovo(CD cd){
        this.cd = cd;
    }
}
