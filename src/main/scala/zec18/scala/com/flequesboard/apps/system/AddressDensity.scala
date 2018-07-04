package zec18.scala.com.flequesboard.apps.system

import org.apache.spark.sql.SparkSession

/*require the test source file and the source of the stop words */
class AddressDensity(src: String) {
  private val spark = SparkSession.builder.master("local[2]").appName("Zec Address Density").getOrCreate().sparkContext
  private val allWords = spark.textFile(src).flatMap(word => word.split(" "))


  def close(): Unit ={
    this.spark.stop()
  }
}
