package uttrykk

import Belop.kr0

class StedbundetBelop[T](val verdier: Map[T,Belop]) {

  def + (that:StedbundetBelop[T]): StedbundetBelop[T] = {
    new StedbundetBelop[T](this.verdier ++ that.verdier.map{ case (k,v) => k -> (v + this.verdier.getOrElse(k,kr0)) })
  }
  override def toString: String = verdier.toString
}
