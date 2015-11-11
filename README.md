The project illustrates the attempt to pack application classes, tests and dependencies into one jar and run the JUnit test from the jar.

At the moment when project started the key problem is tha test classes do not load Spring context.

The assembly is done by the maven clean -> compile -> assembly:assembly sequence.

The run of test is done the following way: 

java -cp SpringTest-1.0-SNAPSHOT-full-pack.jar org.junit.runner.JUnitCore MessengerTest
