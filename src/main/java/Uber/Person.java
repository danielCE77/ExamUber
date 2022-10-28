/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uber;

/**
 *
 * @author DANIC
 */
public class Person {
    private char name;
    private char last_name;

    public char getName() {
        return name;
    }

    public char getLast_name() {
        return last_name;
    }

    public char getDirection() {
        return direction;
    }
    private char direction;
    
    public Person(char name, char last_name, char direction){
        this.name=name;
        this.last_name= last_name;
        this.direction=direction;
    }
}
