package com.atguigu.redistemplatetest.logTest;


import lombok.extern.log4j.Log4j2;
import org.junit.Test;

@Log4j2
public class julTest {

//    private static final Logger sl4j = LoggerFactory.getLogger(julTest.class);

//    @Test
//    public void test01(){
//        Logger logger = Logger.getLogger("julTest");
//        //获取log对象，需要调用静态方法直接获取，需要一个唯一标识
//        logger.info("hello infoAPI!");
//        logger.log(Level.WARNING,"hello warning!");
//        String name = "tom";
//        int age = 12;
//        logger.log(Level.INFO,"日志信息：{0}，{1}",new Object[]{name,age});
//    }


    public static void main(String[] args) {
        log.info("this is info log");
        log.error("this is error log");
        log.debug("this is debug log");
        log.warn("this is warn log");
        log.trace("this is trace log");
        log.fatal("this is fatal log");
    }
//    public void t2(){
//        log.info("hello word");
//        String name = "tom";
//        int age = 13;
//        log.info("名字{} 年龄{}",name,age);
//
//        try {
//            int j = 1/0;
//        } catch (Exception e) {
//            log.error(""+e);
//        }
//    }
}
