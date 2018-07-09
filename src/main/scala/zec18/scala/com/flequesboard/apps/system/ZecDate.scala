package zec18.scala.com.flequesboard.apps.system

import java.text.{ParseException, SimpleDateFormat}
import java.util.{Date, Locale}

class ZecDate() {
  private var date = new Date
  private var dateString = new String
  private var dateSerial = new Date().getTime
  private val statDateFormat = new SimpleDateFormat("yyyy-M-d")

  def this(zecDate: ZecDate) {
    this()
    date = new Date(zecDate.date.getTime)
    dateString = new String(zecDate.dateString)
    dateSerial = zecDate.dateSerial
  }

  def this(date: String){
    this()
    val format = new SimpleDateFormat("M/d/yyyy", Locale.ENGLISH)
    try
      this.date = format.parse(date)
    catch {
      case e: ParseException =>
        e.printStackTrace()
        this.date = new Date
    }
    dateString = new String(statDateFormat.format(this.date))
    dateSerial = this.date.getTime
  }

  override def toString: String = dateString.toString
}
