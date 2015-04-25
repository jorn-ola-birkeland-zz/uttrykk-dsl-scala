package uttrykk

/**
 * Created by jorn ola birkeland on 27.03.15.
 */

object KilometerUttrykk {
  def km = new KilometerUttrykk(1)
  def km(km:Double) = new KilometerUttrykk(km)
}

class KilometerUttrykk(km:Double) extends DistanseUttrykk{
  override def eval(uc: UttrykkContext): Distanse = new Distanse(km)

  override def beskriv(uc: UttrykkContext): String = km + " km"
  
  def *< (sats: BelopPerKilometerUttrykk,oevreGrense: KilometerUttrykk) = new MultisatsUttrykk(this,sats,oevreGrense)
}
