/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uber;

/**
 *
 * @author DANIC
 */
public class Driver extends Person{
    private String vehicle_1 ="Sedan";
    private String vehicle_2 ="Motorcycle";
    private int location_x = 17;

    public String getVehicle_1() {
        return vehicle_1;
    }

    public String getVehicle_2() {
        return vehicle_2;
    }

    public int getLocation_x() {
        return location_x;
    }

    public int getLocation_y() {
        return location_y;
    }
    private int location_y = 8;
    
    public Driver (char name, char last_name, char direction, String vehicle_1, String vehicle_2, int location_x, int location_y){
        super(name, last_name, direction);
        this.vehicle_1= vehicle_1;
        this.vehicle_2= vehicle_2;
        this.location_x = location_x;
        this.location_y = location_y;
    }
}
