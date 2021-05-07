/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimiento;

/**
 *
 * @author eperez50
 */
public class sumadora3 {
    
    private int s1;
    private int s2;
    
    public int sumador() {
        
        int suma;
        suma = s1 + s2;
        return suma;
    }

    // getter
    public int getS1() {
        return s1;
    }

    public int getS2() {
        return s2;
    }

    // setter
    public void setS1(int s1) {
        this.s1 = s1;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }
    
}
