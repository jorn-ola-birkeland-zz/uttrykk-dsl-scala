package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
class BelopMindreEnnUttrykk(ledd1: BelopUttrykk, ledd2: BelopUttrykk) extends BolskUttrykk {
  override def eval(uc: UttrykkContext): Boolean = {
    uc.eval(ledd1) < uc.eval(ledd2)
  }

  override def beskriv(uc: UttrykkContext): String = {
    uc.beskriv(ledd1)+" < " + uc.beskriv(ledd2)
  }
}
