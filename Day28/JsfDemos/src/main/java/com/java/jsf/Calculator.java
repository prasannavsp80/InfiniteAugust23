/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.jsf;

import javax.faces.event.ActionEvent;

/**
 *
 * @author anuj
 */

public class Calculator {

    private int num1;
    private int num2;
    private int sum;

    /** Creates a new instance of Calculator */
    public Calculator() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void addNumber(ActionEvent e)
    {
        sum=num1+num2;
    }


}
