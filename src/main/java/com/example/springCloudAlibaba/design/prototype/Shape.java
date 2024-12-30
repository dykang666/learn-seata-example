package com.example.springCloudAlibaba.design.prototype;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 形状
 * @date 2024/5/24 19:34
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();
    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
