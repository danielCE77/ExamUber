/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uber;

/**
 *
 * @author DANIC
 */
public class User extends Person{
    private int actual_location_x =3;
    private int actual_location_y=2;

    public int getActual_location_x() {
        return actual_location_x;
    }

    public int getActual_location_y() {
        return actual_location_y;
    }

    public int getDestination_location_x() {
        return destination_location_x;
    }

    public int getDestination_location_y() {
        return destination_location_y;
    }
    private int destination_location_x= 5;
    private int destination_location_y= 11;
    
    
    public User(char name, char last_name, char direction, int actual_location_x, int actual_location_y, int destination_location_x, int destination_location_y ){
        super(name, last_name, direction);
        this.actual_location_x = actual_location_x;
        this.actual_location_y = actual_location_y;
        this.destination_location_x= destination_location_x;
        this.destination_location_y = destination_location_y;
    }
}
