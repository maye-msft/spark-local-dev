# Download this repo in your local to have a Spark local dev envrionment with Eclipse

 
- Java 1.8
- Spark 2.3.2
- Hadoop-2.7

Import the Java project in Eclipse.

Set *HADOOP_HOME* as 'tools\hadoop-2.7.7'

Run the java file SparkHive.java

Done!


---------------

Fix the issuse below.
```
The root scratch dir: /tmp/hive on HDFS should be writable. Current permissions are: rw-rw-rw-
```
With the command below.

```
tools\hadoop-2.7.7\bin\winutils chmod 777 /tmp/hive
```