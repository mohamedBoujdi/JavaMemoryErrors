![issues open](https://img.shields.io/github/issues/mohamedBoujdi/JavaMemoryErrors)
![issues closed](https://img.shields.io/github/issues-closed/mohamedBoujdi/JavaMemoryErrors)
![pull requests](https://img.shields.io/github/issues-pr/mohamedBoujdi/JavaMemoryErrors)
![pull requests closed](https://img.shields.io/github/issues-pr-closed/mohamedBoujdi/JavaMemoryErrors)
![last commit](https://img.shields.io/github/last-commit/mohamedBoujdi/JavaMemoryErrors)
![contributors](https://img.shields.io/github/contributors/mohamedBoujdi/JavaMemoryErrors)
![forks](https://img.shields.io/github/forks/mohamedBoujdi/JavaMemoryErrors)
![stars](https://img.shields.io/github/stars/mohamedBoujdi/JavaMemoryErrors)  
[![GitHub license](https://img.shields.io/github/license/mohamedBoujdi/JavaMemoryErrors?style=plastic)](https://github.com/mohamedBoujdi/JavaMemoryErrors/blob/main/LICENSE.txt)
![size](https://img.shields.io/github/repo-size/mohamedBoujdi/JavaMemoryErrors)
![top language](https://img.shields.io/github/languages/top/mohamedBoujdi/JavaMemoryErrors)
![awesome badge](https://awesome.re/badge-flat2.svg)
![contact](https://img.shields.io/badge/contact-%24%20%7B%20boujdi.medz@gmail.com%20%7D-orange)

# JavaMemoryErrors

1. [Introduction](#introduction)

2. [Memory Leak Examples](#memory-leak-examples)
   > (1) & (2) This repository [JavaMemoryErrors]( https://github.com/mohamedBoujdi/JavaMemoryErrors/blob/main/src/main/java/org/example/MemoryErrorInJava.java) contains a set of Java pieces of code commented that are intended to be used to test the behavior of the JVM when it comes to memory errors.
3. [Memory Leak Detection Tools](#memory-leak-detection)
    - [Verbose Garbage Collection](#verbose-garbage-collection)
    - [JVisualVM](#jvisualvm)
    - [JProfiler](#jprofiler)
    - [YourKit](#yourkit)
    - [JDK Mission Control](#jdk-mission-control)
    - [JDK Flight Recorder](#jdk-flight-recorder)
    - [Heap Dumps](#heap-dumps)
    - [Code Reviews](#code-reviews)
    - [Code Benchmarking](#code-benchmarking)
    - [IDE Memory Leak Warnings](#ide-memory-leak-warnings)
    - [Java Virtual Machine Monitoring Tools](#java-virtual-machine-monitoring-tools)
4. [websites](#websites)


## Memory Leak Examples

#### 1. Memory Leak in Java
  look at the code [MemoryErrorInJava.java](docs/src/main/java/org.example/MemoryErrorInJava.java) is documented with comments to explain the behavior of the JVM when it comes to memory errors.
## Memory Leak Detection Tools
  memory leak detection tools are used to detect memory leaks in Java applications. These tools are used to monitor the memory usage of the application and to detect memory leaks. The following are the most popular memory leak detection tools:
### Verbose Garbage Collection
 verbose garbage collection is a feature of the JVM that allows you to monitor the garbage collection process. This feature is enabled by adding the following JVM argument to the command line:
```   
-verbose:gc
```
for example:
```
java -verbose:gc -jar myapp.jar
```
jcmd is a command-line tool that allows you to send diagnostic commands to a running JVM. The following command can be used to enable verbose garbage collection:
```
jcmd <pid> VM.flags -verbose:gc
```
more information about verbose garbage collection can be found in the following link:
https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr006.html
### JVisualVM
 ![img.png](img.png)

 JVisualVM is a tool that is part of the JDK and is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application. JVisualVM is a tool that is part of the JDK and is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
 
download link: https://visualvm.github.io/download.html

how to use JVisualVM: https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr007.html

### JProfiler
![jprofiler logo](https://www.ej-technologies.com/images/product_banners/jprofiler_large.png)

 JProfiler is a commercial tool that is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
JProfiler is a commercial tool created by ej-technologies. It is used to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application. JProfiler is a commercial tool created by ej-technologies. It is used to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.

download link: https://www.ej-technologies.com/products/jprofiler/overview.html

how to use JProfiler: https://www.ej-technologies.com/products/jprofiler/quickstart.html

### YourKit
![yourkit logo](https://www.yourkit.com/images/yklogo.png)

 YourKit is a commercial tool that is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
YourKit is a commercial tool created by ej-technologies. It is also used to monitor the CPU usage, threads, and other resources of a Java application. YourKit is a commercial tool created by ej-technologies. It is used to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.

download link: https://www.yourkit.com/java/profiler/index.jsp

how to use YourKit: https://www.yourkit.com/docs/java/help/startup_options.jsp

### JDK Mission Control (JMC)
 JDK Mission Control is a tool that is part of the JDK and is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.

link: https://docs.oracle.com/javacomponents/jmc-5-5/jmc-user-guide/about.htm#JMCUG-GUID-2B6C8F1A-2B6C-4E2A-8F1A-2B6C4E2A8F1A

### JDK Flight Recorder (JFR)
 JDK Flight Recorder is a tool that is part of the JDK and is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
 
link for more details: https://docs.oracle.com/javacomponents/jmc-5-4/jfr-runtime-guide/about.htm#JFRUH170

### Heap Dumps
 Heap dumps are files that contain the memory usage of a Java application. They are used to analyze the memory usage of a Java application. They are also used to detect memory leaks in Java applications.They are used to analyze the memory usage of a Java application. They are also used to detect memory leaks in Java applications.
example of a heap dump:
```
java -XX:+HeapDumpOnOutOfMemoryError -jar myapp.jar
```
>file name: java_pid<process id>.hprof (for example: java_pid1234.hprof)
>- this file exits in the current directory of the application
### Code Reviews
 Code reviews are used to detect memory leaks in Java applications.They are also used to detect memory leaks in Java applications.
 who should do this kind of code review:
>- developers
>- architects
>- team leads
>- managers
>- etc.
### Code Benchmarking
 Code benchmarking is used to detect memory leaks in Java applications. It is used to compare the memory usage of a Java application before and after a change. It is also used to compare the memory usage of a Java application with other Java applications.
how to do code benchmarking:  
>- use a tool like JProfiler to monitor the memory usage of a Java application
>- make a change to the Java application
>- use the same tool to monitor the memory usage of the Java application after the change
>- compare the memory usage before and after the change
>- compare the memory usage of the Java application with other Java applications
>- if the memory usage of the Java application increased after the change, then there is a memory leak

### IDE Memory Leak Warnings
 IDEs such as IntelliJ IDEA and Eclipse can detect memory leaks in Java applications. They can detect memory leaks by analyzing the code and by analyzing the memory usage of the application. They can also detect memory leaks by analyzing the memory usage of the application.
#### IntelliJ IDEA
IntelliJ IDEA can detect memory leaks in Java applications. It can detect memory leaks by analyzing the code and by analyzing the memory usage of the application. 
how to enable memory leak detection in IntelliJ IDEA:
>- go to File -> Settings -> Build, Execution, Deployment -> Compiler -> Java Compiler
>- check the box "Show warnings for missing @Override annotations"
>- click OK
>- restart IntelliJ IDEA


>CPU and Memory Profiler
>- open the project
>- open the class that contains the memory leak
>- click on the line number of the line that contains the memory leak
>
> ![profiler in intelliJ IDEA](/home/boujdimkinot7991/Pictures/Screenshots/Screenshot from 2022-10-08 17-35-41.png)

#### Eclipse
Eclipse can detect memory leaks in Java applications by analyzing the memory usage of the application.
how to enable memory leak detection in Eclipse:
>- go to Window -> Preferences -> Java -> Compiler -> Errors/Warnings
>- check the box "Potential programming problems"
>- click OK
>- restart Eclipse
### Java Vitual Machine Monitoring Tools
 JVM Monitoring is used to detect memory leaks in Java applications. It is used to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
the standard JVM monitoring tools are:
>- jstat (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jstat.html)
>- jmap (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jmap.html)
>- jstack (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jstack.html)
>- jcmd (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jcmd.html)
>- jinfo (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jinfo.html)
>- jps (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jps.html)
>- jhat (https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jhat.html)
>- jconsole (https://docs.oracle.com/javase/8/docs/technotes/guides/management/jconsole.html)
>- jvisualvm (https://docs.oracle.com/javase/8/docs/technotes/guides/visualvm/index.html)

## websites
- [oracle](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/memleaks002.html)
- [baeldung](https://www.baeldung.com/java-memory-leaks)
- [javarevisited](https://javarevisited.blogspot.com/search?q=memory+issues)
