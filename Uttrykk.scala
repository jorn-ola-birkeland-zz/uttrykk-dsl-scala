package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
trait Uttrykk[T] {
  def eval(uc: UttrykkContext): T
  def beskriv(uc: UttrykkContext): String
}
