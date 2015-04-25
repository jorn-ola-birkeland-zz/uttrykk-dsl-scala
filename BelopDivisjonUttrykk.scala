package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
class BelopDivisjonUttrykk(divident: BelopUttrykk, divisor: BelopUttrykk) extends TallUttrykk{
  override def eval(uc: UttrykkContext): Double = {
     uc.eval(divident) / uc.eval(divisor)
  }

  override def beskriv(uc: UttrykkContext): String = ""
}
