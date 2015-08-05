# ServiceLoaderExample

An example of how to implement the service loader

-- Goto your bin director of this project using windows explorer.
-- you will notice a directory structure as mentioned under https://groups.google.com/forum/#!msg/testng-users/ZVloM26gEoI/wxummGZh7YIJ
-- All you have to do is goto the bin director of this project from your command prompt.
and run the following command  jar cvf ../sl.jar * so that we create the sl.jar file.
Once you run the command, you will notice something like below:

Note: * tells the command to package all the files under the directory into the jar file.

$ jar cvf ../sl.jar *
added manifest
ignoring entry META-INF/
adding: META-INF/services/(in = 0) (out= 0)(stored 0%)
adding: META-INF/services/org.testng.ITestNGListener(in = 26) (out= 28)(deflated -7%)
adding: test/(in = 0) (out= 0)(stored 0%)
adding: test/tmp/(in = 0) (out= 0)(stored 0%)
adding: test/tmp/TmpSuiteListener.class(in = 849) (out= 470)(deflated 44%)

-- Now, take this sl.jar file and add it to your classpath. You are good to go. 

# If you want to give it a try, there is a compiled sl.jar file already under the root folder (ServiceLoaderExample) of this project. You can simply add it to your class path and give it a try.