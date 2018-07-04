package zec18.scala.com.flequesboard.apps.system

object Application extends App{
  val songFile = "resources/station-to-station.lyrics"
  val stopWordsFile = "resources/small-stopwords.txt"

  val textStats = new TextStats(songFile)
  val sensibilityRate = textStats.getWeanedWordsRatio(stopWordsFile)
}

