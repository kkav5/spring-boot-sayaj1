package com.udarn.sayaj.model;



public class Employee {
    private final int id;
    private final String f_name;
    private final String l_name;
    private final String address;
    private final int phone;

    private static int count = 1;

    public Employee(int id, String f_name, String l_name, String address, int phone){
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.phone = phone;
    }

    public Employee(String f_name,
                    String l_name,
                    String address,
                    int phone){
        this.id = count;
        count++;
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.phone = phone;
    }

    public int getId(){
        return this.id;
    }

    public String getF_name(){
        return this.f_name;
    }

    public String getL_name(){
        return this.l_name;
    }

    public String getAddress(){
        return this.address;
    }

    public int getPhone(){
        return this.phone;
    }
}
