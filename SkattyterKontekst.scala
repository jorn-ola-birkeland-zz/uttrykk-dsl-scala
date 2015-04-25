package uttrykk

/**
 * Created by jorn ola birkeland on 26.03.15.
 */
class SkattyterKontekst extends UttrykkContext{
  override def eval[T](uttrykk: Uttrykk[T]): T = uttrykk.eval(this)

  override def beskriv[T](uttrykk: Uttrykk[T]): String = uttrykk.beskriv(this)
}
