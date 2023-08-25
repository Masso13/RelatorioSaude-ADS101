/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.relatoriosaude;

import java.lang.Math;

/**
 *
 * @author Masso
 */
public class HealthProfile {
    private String name, surename, gender; 
    private int day, month, year; 
    double height, weight;
    
    public HealthProfile(String name, String surename, String gender, int day, int month, int year, double height, double weight) {
        this.name = name;
        this.surename = surename;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurename() {
        return surename;
    }
    
    public void setSurename(String surename) {
        this.surename = surename;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public double getWeigth() {
        return weight;
    }
    
    public void setWeigth(float weigth) {
        this.weight = weigth;
    }
    
    public int getAge(int current_year) {
        return current_year - year;
    }
    
    public double getIMC() {
        return weight / Math.pow(height, 2.0);
    }
}
