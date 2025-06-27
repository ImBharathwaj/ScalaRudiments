import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder()
            .master("Local[1]") // set master URL
            .appName("mySparkApplication") //name of the application
            .getOrCreate()

