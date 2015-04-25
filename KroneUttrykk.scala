package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */

object KroneUttrykk {
  def kr(belop:Double) = new KroneUttrykk(new Belop(belop));
}

class KroneUttrykk(belop: Belop) extends BelopUttrykk{

  override def eval(uc: UttrykkContext): Belop = belop;

  override def beskriv(uc: UttrykkContext): String = belop + " kr"
}
