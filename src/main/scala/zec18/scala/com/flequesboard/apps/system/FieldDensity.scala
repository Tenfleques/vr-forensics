package zec18.scala.com.flequesboard.apps.system

import org.apache.spark.sql._
import org.apache.spark.sql.functions._

class FieldDensity(src: String) {
  def close(): Unit ={
    this.spark.stop()
  }

  private val spark = SparkSession.builder.master("local[2]").appName("Zec Address Density").getOrCreate()
  val df = spark.sqlContext
          .read
          .format("com.databricks.spark.csv")
          .option("header", "true")
          .option("mode", "DROPMALFORMED")
          .schema(References.CSV_SCHEMA)
          .load(src)

  val roll = df.filter(!_.anyNull)

  def getFieldFrequency(fieldName : String, frequenciesOver : Long) = {
    roll.groupBy(fieldName).count().sort(desc("count")).filter(a => a.get(1).asInstanceOf[Long] > frequenciesOver).collect()
  }
  def filterByField(field : Int, values: List[Any]) = {
    roll.filter(a => values.contains(a.get(field)))
  }
  def similarNatID() = {
    roll.map(a => a(References.NATIONAL_ID).)
  }

}
