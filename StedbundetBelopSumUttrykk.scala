package uttrykk

/**
 * Created by jorn ola birkeland on 26.03.15.
 */
class StedbundetBelopSumUttrykk[T](ledd1: StedbundetBelopUttrykk[T], ledd2: StedbundetBelopUttrykk[T]) extends StedbundetBelopUttrykk[T]{
  override def eval(uc: UttrykkContext): StedbundetBelop[T] = {
    uc.eval(ledd1)+uc.eval(ledd2)
  }

  override def beskriv(uc: UttrykkContext): String = ""
}
