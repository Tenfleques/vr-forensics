package zec18.scala.com.flequesboard.apps.system

class NatID() {
  private var regCenter = new String
  private var id = new String
  private var letter = new String
  private var origin = new String
  private var fullID = new String

  def this(natID: NatID) {
    this()
    regCenter = new String(natID.regCenter)
    id = new String(natID.id)
    letter = new String(natID.letter)
    origin = new String(natID.origin)
    fullID = new String(natID.fullID)
  }

  def this(natidIn: String) {
    this()
    val natid = natidIn.replace(" ", "")
    fullID = new String(natid)
    val splitParts = natid.split("-")
    regCenter = new String(splitParts(0))
    id = new String(splitParts(1))
    letter = new String(splitParts(2).substring(0, 1))
    origin = new String(splitParts(2).substring(1))
  }

  def getLetter: String = letter

  def getId: String = id

  def getOrigin: String = origin

  def getRegCenter: String = regCenter

  def getFullID: String = fullID

  override def toString: String = getFullID
}
