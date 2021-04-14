
# Your discussion about testing

**Testing:**

In order to perform all the tests for Designs 2,3 and 6 we have created a class named TestingClass.java which makes calls to each PointCP design. The class runs each design and creates thousands of instances and performs thousands of methods on the instances created. Simultaneously, the test also records the time elapsed (in milliseconds) for each design during the calls and prints the output as each design is finished testing.

**Sample Output From Running the Tests:**

Average time for initializing C PointCPD2: 64ns

Average time for initializing P PointCPD2: 64ns

Average time for getting Cartesian from Cartesian PointCPD2: 13ns

Average time for getting Polar from Cartesian PointCPD2: 37ns

Average time for getting Cartesian from Polar PointCPD2: 13ns

Average time for getting Polar from Polar PointCPD2: 49ns

Average time for getting distance between two points (PointCPD2): 26ns

**Table 1.**

| **Operation Performed** | **Design 2** | **Design 3** | **Design 6** |
| --- | --- | --- | --- |
| Initialize (Cartesian) | 65 (64,67) ns | 65 (64,67) ns | 65 (64,66) ns |
| Initialize (Polar) | 65 (65,66) ns | 65 (64,66) ns | 64  (64,65)ns |
| Getting Cartesian from Cartesian | 13 ns | 13 ns | 13 ns |
| Getting Cartesian from Polar | 13 ns |  13 ns | 13 ns |
| Getting Polar from Polar | 50 (49,51) ns | 43 (37,49) ns | 44 (37,50) ns |
| Getting Polar from Cartesian |  50 (50,51) ns | 44 (37,50) ns | 37 ns |
| Getting Distance Between Two Points | 26 ns | 26 ns | 26 ns | 
| Rotation of a Point | 162 (160,163) ns | 159 ns | 161 (160,161) ns |

_*The values in each cell represent Median, Min and Max respectively_

_*Cells with one value represent a recurring value for that operation_



**Discussion:**

Evidently, looking at Table 1 above, we can conclude that both Design 6 is a much faster implementation since it is an interface that uses either Design 2 or 3 as class implementing it. Since designs 2 and 3 both only store one type of given coordinate, both classes use less memory and thus become more efficient at computations such as initializing coordinates.
