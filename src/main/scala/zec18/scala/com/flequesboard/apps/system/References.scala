package zec18.scala.com.flequesboard.apps.system

import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

object References {

  val SER = 0
  val SURNAME = 1
  val FORENAMES = 2
  val NATIONAL_ID = 3
  val GENDER = 4
  val DATE_OF_BIRTH = 5
  val ADDRESS = 7
  val POLLING_STATION_CODE = 6
  val POLLING_STATION_NAME = 8
  val WARD = 9
  val LOCAL_AUTHORITY = 10
  val CONSTITUENCY = 11
  val DISTRICT = 12
  val PROVINCE = 13
  val IMAGE_HASH = 14

  val CSV_SCHEMA = StructType(
  Array(
    StructField("SER", IntegerType, false),
    StructField("SURNAME", StringType, false),
    StructField("FORENAMES", StringType, false),
    StructField("NATIONAL_ID", StringType, false),
    StructField("GENDER", StringType, false),
    StructField("DATE_OF_BIRTH", StringType, false),
    StructField("ADDRESS", StringType, false),
    StructField("POLLING_STATION_CODE", StringType, false),
    StructField("POLLING_STATION_NAME", StringType, false),
    StructField("WARD", StringType, false),
    StructField("LOCAL_AUTHORITY", StringType, false),
    StructField("CONSTITUENCY", StringType, false),
    StructField("DISTRICT", StringType, false),
    StructField("PROVINCE", StringType, false)
  ))
  val FIELDS = CSV_SCHEMA.fieldNames.toList
}
