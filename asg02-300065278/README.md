# Lloseng

This repository contains a copy of [code available to students](https://github.com/TimLethbridge/Lloseng)
using the book [Object-Oriented Software Engineering: Practical Software
Development using UML and Java](http://www.site.uottawa.ca/school/research/lloseng/), 2nd Edition, 2004 McGraw Hill.
by [Timothy C. Lethbridge](http://www.eecs.uottawa.ca/~tcl) and
[Robert Laganière](http://www.eecs.uottawa.ca/~laganier).

# Assignment 2 (6%)

Assignment Submission before October 22, 11:30pm using [BrightSpace](https://uottawa.brightspace.com/)

This is an individual assignment. You must work strictly alone on this.

You can clone this repository using the following invitation

```
https://classroom.github.com/a/GH8ziUV9
```

## Format

Your repository must be named \[prefix\]-\[student-number\], for example


```
asg02-1484511
```

When finished, submit a text file named after your student number (asg02-xxxxx.txt)
with the lower student number first.  For example,

```
asg02-1484511.txt
```

Within the file please include:

* Your name and student number
* A link to your last commit in your asg02 branch in GitHub
* A link to your pull request (PR) of asg02 branch into master

For example

```
Andrew Forward 1484511
https://github.com/professor-forward/asg02-1484511/commit/a7187f5a2270495e02adb52b9eb0746d52c3d63b
https://github.com/professor-forward/asg02-1484511/pull/1
```

Your GitHub repository should contain all solutions to the Assignment 2,
no solution submissions via BrightSpace will be evaluated. 
Only the information above should be submitted to BrightSpace.


#### Set Up

This Assignment will focus on [OCSF](/ocsf) and [SimpleChat](/simplechat1) from this repository,
so all instructions will be relative to that directory.

```
cd simplechat1
```

Setup [OCSF](/ocsf) and [SimpleChat](/simplechat1) before committing any code.  BrightSpace
includes a SWF how-to video (sorry might be difficult to run on some machines) which covers
the same information as available in the links above.

Now create a branch for this lab called `f/asg02`

```
git checkout -b f/asg02
git push -u origin HEAD
```

All modifications should be done within `/simplechat1` directory of your `f/asg02` branch.
Do not change the framework `/ocsf` code at all.

All answers, documentation and _non code items_ should be uploaded
within the `/simplechat1` directory (e.g. screenshots) and referenced within
your [REPORT.md](/simplechat1/REPORT.md).

## Part 1 (Chapter 3)

### Q1. (30 marks) Answer E49, pages 104-105:

All changes should be aparent from your `f/asg02` pull request.  Add normal code comments
explaining anything non-obvious in what you are doing.


### Q2. Run the server, and two clients

Run the server on port 5XXX (where XXX corresponds to the last three digits of your student number), and two clients.

2.1 (5 points) Using the jps and jstat tools, find how many threads are currently running
in the JVM. Take a screenshot of the console and include it in your report.

2.2 (5 points) Type the command `netstat -aon` in your terminal and identify the port used by your server
connection. In Linux, you can use the command `netstat -vatn`. Take a screenshot of the
console and include it in your report.


### Info about the tools can be found here:

* https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jps.html
* https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jstat.html


## Part 2 (Chapter 5)

### Q1 (30 points) Create a UML class diagram for system described below.

Make sure you include correct multiplicity. Show all attributes and associations plus at
least five important operations. If generalizations are necessary, show them too.
Marks will be given for effort, even if you do not have a perfect solution.
However, marks will be lost for the common types of mistakes we talked about in class
(e.g. poor generalizations, wrong multiplicity, etc). Make any necessary assumptions.

* (+10 points) use Umple, OR
* (+ 5 points) use another professional tool (e.g. Visual Paradigm Community Version, ArgoUML, Papyrus for Eclipse)

### Q2 (30 points) Create a UML object diagram for the types in your class diagram

You will need at least to represent the following cases:

* Messi, a driver, drives a bus to cover the bus route #5 from Rideau to Billings Bridge. He works 7 hours per day and has been involved in 7 incidents (2 major accidents and 5 fines).
* Ronaldo, a driver, drives a train, to cover the train route #20 Bayview to Greenboro. Ronaldo has a clean record and works 9 hours per day.

The city's public transportation is revamping its public transportation management systems
and needs your help. The city has several bus routes that operate throughout the day at
various times. Each route has one or more peak hours, during which more buses would be
assigned. A bus route is composed of a point of origin, a destination, a number (e.g. route 95)
and a list of stops.

### System Description

Bus drivers work in shifts of 7.5 hours per day, any more would be considered overtime.
Upon arrival each day a bus driver is assigned a route, and throughout their shift they
might be re-assigned to ensure all bus routes are adequately staffed.

Bus drivers are identified by name, employee number and have different seniority and experience
levels giving them the authority to drive: normal buses, extended buses, double- decker, and trains.
Only experienced drivers can drive trains (10+ years). The system keeps track of all accidents,
fines and incidents on which the drivers were involved.

Passengers are identified by name, customer number. They can check routes to travel between
their starting point and any number of destinations. Passengers can access public transit by
using paper tickets, passes, or presto cards.

Presto cards can be filled with credit, and money will automatically be deducted when passenger uses a bus/train. Passenger can get notification if their balance is below certain threshold.

