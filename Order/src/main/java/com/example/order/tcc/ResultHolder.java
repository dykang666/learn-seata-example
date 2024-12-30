package com.example.order.tcc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/30 11:43
 */
public class ResultHolder {
    private static Map<Class<?>, Map<String, String>> map = new ConcurrentHashMap<>();

    public static void setResult(Class<?> actionClass, String xid, String v) {
        Map<String, String> results = map.get(actionClass);

        if (results == null) {
            synchronized (map) {
                if (results == null) {
                    results = new ConcurrentHashMap<>();
                    map.put(actionClass, results);
                }
            }
        }

        results.put(xid, v);
    }

    public static String getResult(Class<?> actionClass, String xid) {
        Map<String, String> results = map.get(actionClass);
        if (results != null) {
            return results.get(xid);
        }

        return null;
    }

    public static void removeResult(Class<?> actionClass, String xid) {
        Map<String, String> results = map.get(actionClass);
        if (results != null) {
            results.remove(xid);
        }
    }
}
