package zec18.scala.com.flequesboard.apps.system

object CosineSimilarity {
  def calculateCosineSimilarity(a : Map[Char,List[Int]], b: Map[Char,List[Int]]): Double ={
    val intersection = a.keySet.intersect(b.keySet)
    var dotProduct = 0.0
    for (item <- intersection) {
      val max = Math.max(a.size, b.size)
      var i = 0
      while (i < max){
        val m = a(item)
        val n = b(item)
        if(m.size > i && n.size > i)
          dotProduct += m(i) * n(i)
        i += 1
      }
    }

    var magnitudeA = .0
    for(item <- a){
      magnitudeA += item._2.map(Math.pow(_,2.0)).sum
    }
    var magnitudeB = .0
    for(item <- b){
      magnitudeB += item._2.map(Math.pow(_,2.0)).sum
    }
    return dotProduct / Math.sqrt(magnitudeA * magnitudeB)
  }
  def cosineSimilarity (text1: String, text2: String) :Double = {
    //Get vectors
    //val a = text1.split("\\W+").map(a=>(a,1)).groupBy(_._1).map(a => (a._1, a._2.length))
    //val b = text2.split("\\W+").map(a=>(a,1)).groupBy(_._1).map(a => (a._1, a._2.length))
    var i = 0
    val a = text1.map(a=> {
      i += 1
      (a, i)
    }).groupBy(_._1)
      .map(x => (x._1, x._2.map(_._2).toList))

    i = 0
    val b = text2.map(a=>{
      i += 1
      (a,i)
    }).groupBy(_._1)
      .map(x => (x._1, x._2.map(_._2).toList))
    return calculateCosineSimilarity(a,b)
  }

}
