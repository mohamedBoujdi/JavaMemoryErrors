# JavaMemoryErrors

1. [Introduction](docs/src/main/java/org.example/MemoryErrorInJava.java)

4. [Memory Leak Examples](#memory-leak-examples)
   > (1) & (2) This repository [JavaMemoryErrors]( https://github.com/mohamedBoujdi/JavaMemoryErrors) contains a set of Java pieces of code commented that are intended to be used to test the behavior of the JVM when it comes to memory errors.
2. [Memory Leak Detection Tools](#memory-leak-detection)
    - [Verbose Garbage Collection](#verbose-garbage-collection)
    - [JVisualVM](#jvisualvm)
    - [JProfiler](#jprofiler)
    - [YourKit](#yourkit)
    - [JDK Mission Control](#jdk-mission-control)
    - [JDK Flight Recorder](#jdk-flight-recorder)
10. [Memory Leak blog](#memory-leak-blogs)
     - [websites](#websites)


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
### YourKit
![yourkit logo](https://www.yourkit.com/images/yklogo.png)

 YourKit is a commercial tool that is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
YourKit is a commercial tool created by ej-technologies. It is also used to monitor the CPU usage, threads, and other resources of a Java application. YourKit is a commercial tool created by ej-technologies. It is used to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.

download link: https://www.yourkit.com/java/profiler/index.jsp

### JDK Mission Control (JMC)
 JDK Mission Control is a tool that is part of the JDK and is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
link: https://docs.oracle.com/javacomponents/jmc-5-5/jmc-user-guide/about.htm#JMCUG-GUID-2B6C8F1A-2B6C-4E2A-8F1A-2B6C4E2A8F1A

### JDK Flight Recorder (JFR)
 JDK Flight Recorder is a tool that is part of the JDK and is used to monitor the memory usage of a Java application. It is a graphical tool that allows you to monitor the memory usage of a Java application. It is also used to monitor the CPU usage, threads, and other resources of a Java application.
 
link for more details: https://docs.oracle.com/javacomponents/jmc-5-4/jfr-runtime-guide/about.htm#JFRUH170

## Memory Leak blogs
- [baeldung](https://www.baeldung.com/java-memory-leak)
- [javacodegeeks](https://www.javacodegeeks.com/2015/08/java-memory-leaks.html)
    
