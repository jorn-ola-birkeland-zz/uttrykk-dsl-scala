package uttrykk

import java.util

import scala.collection.immutable.HashMap

/**
 * Created by jorn ola birkeland on 26.03.15.
 */
class StedbundetKroneUttrykk[T](belopUttrykk: BelopUttrykk, sted: T) extends StedbundetBelopUttrykk[T]{
  override def eval(uc: UttrykkContext): StedbundetBelop[T] = {
    val belop = uc.eval(belopUttrykk)

    new StedbundetBelop[T](HashMap(sted->belop))
  }

  override def beskriv(uc: UttrykkContext): String = ""
}
