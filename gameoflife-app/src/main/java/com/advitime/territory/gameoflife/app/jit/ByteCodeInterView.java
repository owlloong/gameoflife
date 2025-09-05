package com.advitime.territory.gameoflife.app.jit;

/**
 * @ClassName ByteCodeInterView
 * @Description TODO
 * @Author owlloongyuan
 * @Date 2025/9/2 13:45
 * @Version 0.1
 */
public class ByteCodeInterView {

    public void typeTest(){
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2);
        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1 == d2);
    }

    public int mathTest(){
        int k = 1;
        k = k++;
        return k;
    }

    public int inc(){
        int x ;
        try {
            x= 1;
        } catch (Exception e) {
            x=2;
        }finally {
            x = 3;
        }
        return x;
    }
}
