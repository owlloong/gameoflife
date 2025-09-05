package com.advitime.territory.gameoflife.app.classloader;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName ClassLoaderDemo
 * @Description TODO
 * @Author owlloongyuan
 * @Date 2025/9/2 14:22
 * @Version 0.1
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        String str = "111";
        for (int i = 0; i < 5; i++) {
            set.add(str);
        }
        System.out.println(set);
    }

}
