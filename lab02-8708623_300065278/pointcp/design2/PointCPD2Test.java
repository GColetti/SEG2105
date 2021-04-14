// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;

/**
* This class tests all methods of the class PointCPD2 and measures the average run time for each operation
* performed
* @author Gianluca Coletti 
*/
public class PointCPD2Test
{
  //Class methods *****************************************************

  public static long initPointCPD2(char type, long testTimeSeconds){
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    while(System.nanoTime() < limit){
        new PointCPD2(type, 10*Math.random(), 10*Math.random());
        
        count++;
    }

    long result = testTimeNano/count;
    return result;
  }

  public static long getCPointCPD2(char type, long testTimeSeconds){
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD2 tmp = new PointCPD2(type, 10*Math.random(), 10*Math.random());
    while(System.nanoTime() < limit){
        tmp.getX();
        count++;
        tmp.getY();
        count++;
    }
    long result = testTimeNano/count;
    return result;
  }

  public static long getPPointCPD2(char type, long testTimeSeconds) {
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD2 tmp = new PointCPD2(type, 10 * Math.random(), 10 * Math.random());
    while (System.nanoTime() < limit) {
        tmp.getRho();
        count++;
        tmp.getTheta();
        count++;
    }

    long result = testTimeNano / count;
    return result;
  }

  public static long getDistancePointCPD2(char type, long testTimeSeconds) {
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD2 p1 = new PointCPD2(type, 10 * Math.random(), 10 * Math.random());
    PointCPD2 p2 = new PointCPD2(type, 10 * Math.random(), 10 * Math.random());
    while (System.nanoTime() < limit) {
        p1.getDistance(p2);
        count++;
    }

    long result = testTimeNano / count;
    return result;
  }

  public static long rotatePointCPD2(char type, long testTimeSeconds) {
    long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
    long count = 0;
    long start = System.nanoTime();
    long limit = start + testTimeNano;
    PointCPD2 p1 = new PointCPD2(type, 10 * Math.random(), 10 * Math.random());

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

    System.out.println("Average time for initializing C PointCPD2: "+initPointCPD2('C', testTime)+"ns");
    System.out.println("Average time for initializing P PointCPD2: "+initPointCPD2('P', testTime)+"ns");
    System.out.println("Average time for getting Cartesian from Cartesian PointCPD2: "+getCPointCPD2('C', testTime)+"ns");
    System.out.println("Average time for getting Polar from Cartesian PointCPD2: "+getPPointCPD2('C', testTime)+"ns");
    System.out.println("Average time for getting Cartesian from Polar PointCPD2: "+getCPointCPD2('P', testTime)+"ns");
    System.out.println("Average time for getting Polar from Polar PointCPD2: "+getPPointCPD2('P', testTime)+"ns");

    System.out.println("Average time for getting distance between two points (PointCPD2): "+getDistancePointCPD2('P', testTime)+"ns");
    System.out.println("Average time for rotating a point (PointCPD2): "+rotatePointCPD2('P', testTime)+"ns");

  }

    
}
