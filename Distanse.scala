package uttrykk

/**
 * Created by jorn ola birkeland on 27.03.15.
 */
class Distanse(val km:Double) {
  def +(that:Distanse) = new Distanse(this.km+that.km)

}
