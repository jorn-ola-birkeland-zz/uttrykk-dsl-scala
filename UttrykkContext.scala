package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
trait UttrykkContext {
  def eval[T](uttrykk: Uttrykk[T]):T
  def beskriv[T](uttrykk: Uttrykk[T]):String

}
