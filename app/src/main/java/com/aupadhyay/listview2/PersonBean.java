package com.aupadhyay.listview2;

/**
 * Created by aupadhyay on 7/17/16.
 */
public class PersonBean {

    private int icon;
    private String name, phone;

    public PersonBean(int icon, String name, String phone) {
        this.icon = icon;
        this.name = name;
        this.phone = phone;
    }

    public PersonBean() {
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {

        String str = "Name: "+name+"\n Phone: "+phone;
        return str;

    }
}
