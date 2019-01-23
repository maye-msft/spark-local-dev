package test.spark;

import java.io.File;

import org.apache.spark.sql.SparkSession;

public class SparkHive {
	public static void main(String[] args) {
		String warehouseLocation = new File("spark-warehouse").getAbsolutePath();
		SparkSession spark = SparkSession
		  .builder()
		  .master("local")
		  .appName("Java Spark Hive Example")
		  .config("spark.sql.warehouse.dir", warehouseLocation)
		  .enableHiveSupport()
		  .getOrCreate();

		spark.sql("CREATE TABLE IF NOT EXISTS src (key INT, value STRING) USING hive");
		spark.sql("INSERT INTO TABLE src VALUES (1, 'A'), (2, 'B')");
		spark.sql("SELECT * FROM src").show();
	}
}
