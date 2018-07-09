package zec18.scala.com.flequesboard.apps.system

object Application extends App{
  println(CosineSimilarity.cosineSimilarity("bobra", "borba"))

  /*val fieldDensity = new FieldDensity(Provinces.national)
  val natIdField = References.FIELDS(References.NATIONAL_ID)
  val duplicateNatIds = fieldDensity.getFieldFrequency(natIdField, 1L).map(a => a.get(0)).toList
  println(duplicateNatIds.size)
  fieldDensity.filterByField(References.NATIONAL_ID,duplicateNatIds).write.csv("results/duplicate_ids.csv")*/

  //val fieldDensity = new FieldDensity(Provinces.harare)
  //val natIdField = References.FIELDS(References.NATIONAL_ID)

}

