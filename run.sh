alias native-image=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-20.1.0/Contents/Home/lib/svm/bin/native-image

rm helloworld
mvn clean package -PJAVA
native-image -jar ./target/graalvmnidemos-1.0-SNAPSHOT-jar-with-dependencies.jar --no-fallback --no-server -H:Class=oracle.HelloWorld -H:Name=helloworld
