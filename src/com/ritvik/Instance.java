package com.ritvik;

/**
 * Created by u6023478 on 12/11/2014.
 */
public class Instance {
    private static Instance ourInstance = new Instance();

    public static Instance getInstance() {
        return ourInstance;
    }

    public static Instance getOurInstance() {
        return ourInstance;
    }

    private static void setOurInstance(Instance ourInstance) {
        Instance.ourInstance = ourInstance;
    }

    private Instance() {

    }
}
