package uttrykk

/**
 * Created by jorn ola birkeland on 28.03.15.
 */
class DistanseSumUttrykk(ledd1: DistanseUttrykk, ledd2: DistanseUttrykk) extends DistanseUttrykk{
  override def eval(uc: UttrykkContext): Distanse = {
    uc.eval(ledd1)+uc.eval(ledd2)
  }

  override def beskriv(uc: UttrykkContext): String = ""
}
