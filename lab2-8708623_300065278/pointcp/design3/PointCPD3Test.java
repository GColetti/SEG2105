// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;

/**
* This class tests all methods of the class PointCPD3 and measures the average run time for each operation
* performed
* @author Gianluca Coletti 
*/
public class PointCPD3Test
{
  //Class methods *****************************************************

  public static long initPointCPD3(char type, long testTimeSeconds){
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    while(System.nanoTime() < limit){
        new PointCPD3(type, 10*Math.random(), 10*Math.random());
        
        count++;
    }

    long result = testTimeNano/count;
    return result;
  }

  public static long getCPointCPD3(char type, long testTimeSeconds){
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD3 tmp = new PointCPD3(type, 10*Math.random(), 10*Math.random());
    while(System.nanoTime() < limit){
        tmp.getX();
        count++;
        tmp.getY();
        count++;
    }
    long result = testTimeNano/count;
    return result;
  }

  public static long getPPointCPD3(char type, long testTimeSeconds) {
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD3 tmp = new PointCPD3(type, 10 * Math.random(), 10 * Math.random());
    while (System.nanoTime() < limit) {
        tmp.getRho();
        count++;
        tmp.getTheta();
        count++;
    }

    long result = testTimeNano / count;
    return result;
  }

  public static long getDistancePointCPD3(char type, long testTimeSeconds) {
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD3 p1 = new PointCPD3(type, 10 * Math.random(), 10 * Math.random());
    PointCPD3 p2 = new PointCPD3(type, 10 * Math.random(), 10 * Math.random());
    while (System.nanoTime() < limit) {
        p1.getDistance(p2);
        count++;
    }

    long result = testTimeNano / count;
    return result;
  }

  public static long rotatePointCPD3(char type, long testTimeSeconds) {
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD3 p1 = new PointCPD3(type, 10 * Math.random(), 10 * Math.random());

    while (System.nanoTime() < limit) {
        p1.rotatePoint(180);
        count++;
    }

    long result = testTimeNano / count;
    return result;
  }


  /**
  * Main method to run tests and print results 
  * @param args
  */
  public static void main(String[] args){
    int testTime = 10;

    System.out.println("Average time for initializing C PointCPD3: "+initPointCPD3('C', testTime)+"ns");
    System.out.println("Average time for initializing P PointCPD3: "+initPointCPD3('P', testTime)+"ns");
    System.out.println("Average time for getting Cartesian from Cartesian PointCPD3: "+getCPointCPD3('C', testTime)+"ns");
    System.out.println("Average time for getting Polar from Cartesian PointCPD3: "+getPPointCPD3('C', testTime)+"ns");
    System.out.println("Average time for getting Cartesian from Polar PointCPD3: "+getCPointCPD3('P', testTime)+"ns");
    System.out.println("Average time for getting Polar from Polar PointCPD3: "+getPPointCPD3('P', testTime)+"ns");

    System.out.println("Average time for getting distance between two points (PointCPD3): "+getDistancePointCPD3('P', testTime)+"ns");
    System.out.println("Average time for rotating a point (PointCPD3): "+rotatePointCPD3('P', testTime)+"ns");
  }

    
}
