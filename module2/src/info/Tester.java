package info;

import utils.TimeUtil;

/**
 * 测试类
 */
public class Tester {

    public static void main(String[] args) {

        System.out.println("开始时间："+ TimeUtil.getCurrentTime());

        long val = 0;
        for(int i=0;i<1000_000_000;++i){
            val+=i<<1;
        }
        System.out.println(val);

        System.out.println("结束时间："+ TimeUtil.getCurrentTime());
    }

}
