package uttrykk

object Belop {
  def kr(belop:Double) = new Belop(belop)
  def kr0() = new Belop(0d)
}

class Belop(val verdi:Double) {
  def +(that:Belop) = new Belop(this.verdi+that.verdi)
  def -(that:Belop) = new Belop(this.verdi-that.verdi)
  def /(that:Belop):Double = this.verdi/that.verdi
  def <(that:Belop):Boolean = this.verdi<that.verdi

  override def toString: String = verdi + " kr"
}
