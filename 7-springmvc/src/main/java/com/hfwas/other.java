package com.hfwas;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: HFwas
 * @Date: 2021/3/30
 * @Description: com.hfwas
 * @version: 1.0
 */
public class other {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> hash = new ConcurrentHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Object o = new Object();
        String s = new String();
    }
}
class father implements Runnable{
    @Override
    public void run() {

    }
}

class father2 implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}