/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aishw
 */
public class CarHist {
    private ArrayList<Car> hist; 
    public CarHist(){
    this.hist = new ArrayList<Car>();
    }

    public ArrayList<Car> getHist() {
        return hist;
    }

    public void setHist(ArrayList<Car> hist) {
        this.hist = hist;
        
    }
    public Car addNewCar(){
        Car newCar =new Car() ;
        hist.add(newCar);
        return newCar;
    }
    
    
}

