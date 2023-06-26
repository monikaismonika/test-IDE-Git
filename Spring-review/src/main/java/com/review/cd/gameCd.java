package com.review.cd;


import com.review.cd.CD;
import org.springframework.stereotype.Component;

@Component("cs1.6")
public class gameCd implements CD {
    private String title = "biu biu biu~";
    private String author = "tom";
    @Override
    public void play() {
        System.out.println("game stater~");
    }
}
