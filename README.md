# Go here instead https://github.com/sarnobat/graalvm_aotc_java

## verdict: 
worked nicely on cold retry 1 year after I last touched it. 

* negative: binary is big.
* negative: you need to create a jar-with-dependencies through the whole maven/gradle song-and-dance 
* positive: building the native binary is relatively straightforward


# java_aotc_helloworld
Java Ahead of Time compilation (aot, aotc) using GraalVM, JDK 11 native-image

    find | ./helloworld
