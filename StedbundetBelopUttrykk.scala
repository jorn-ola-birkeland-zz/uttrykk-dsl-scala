package uttrykk

/**
 * Created by jorn ola birkeland on 26.03.15.
 */
trait StedbundetBelopUttrykk[T] extends Uttrykk[StedbundetBelop[T]]{
  def + (that: StedbundetBelopUttrykk[T]): StedbundetBelopUttrykk[T] = new StedbundetBelopSumUttrykk(this,that)

}
