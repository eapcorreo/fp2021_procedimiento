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
public class Procedimiento {

    public static void main(String[] args) {
        
//        sumadora sum = new sumadora();
//        int var1 =5;
//        int var2 = 22;
//        int resultado=0;
//        resultado = sum.sumador(var1, var2);
//        System.out.println("Resultado: " + resultado);


//        sumadora2 sum2 = new sumadora2();
//        sum2.s1 = 5;
//        sum2.s2 = 22;
//        int resultado = sum2.sumador();
//        System.out.println("Resultado: " + resultado);


//        sumadora3 sum3 = new sumadora3();
//        sum3.setS1(5);
//        sum3.setS2(22);
//        int resultado = sum3.sumador();
//        System.out.println("Resultado: " + resultado);
        

//        sumadora4 sum4 = new sumadora4(5,22);
//        int resultado = sum4.sumador();
//        System.out.println("Resultado: " + resultado);
        
        
        sumadora4 sum4 = new sumadora4();
        sum4.setS1(5);
        sum4.setS2(22);
        int resultado = sum4.sumador();
        System.out.println("Resultado: " + resultado);
        
    }
    
}
