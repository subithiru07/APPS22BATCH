package com.usingcallable;
import java.util.concurrent.Callable;
public class PowerCalc implements Callable{
private double number;
 
 PowerCalc(double number)
 {
	 
	 this.number=number; 
 }
 
public Double call() throws Exception {
{
	System.out.println("Calculating Square with "+Thread.currentThread().getName());
	Thread.sleep(2000);
	  return Math.pow(number, number);
  
 }
 

 
}

}
