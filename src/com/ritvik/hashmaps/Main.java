package com.ritvik.hashmaps;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by u6023478 on 11/9/2016.
 */
public class Main {

    public static void main(String[] args) {
        HashObject hashObject = new HashObject(1,"a", new TestKey(new Date(2016,11,9)));
        HashObject hashObject2 = new HashObject(2,"a", new TestKey(new Date(2016,11,9)));

        HashMap<HashObject,HashObject> map = new HashMap<>();

        map.put(hashObject,hashObject2);
        map.put(hashObject2,hashObject);

        System.out.println(map);


    }
}
