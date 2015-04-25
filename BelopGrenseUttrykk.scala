package uttrykk

object BelopGrenseUttrykk {
  def begrens(uttrykk: BelopUttrykk) = new BelopGrenseUttrykk(uttrykk)
}
class BelopGrenseUttrykk(uttrykk: BelopUttrykk) extends BelopUttrykk{
  def oppadTil(oevregrense: BelopUttrykk) = this

  override def eval(uc: UttrykkContext): Belop = uc.eval(uttrykk)

  override def beskriv(uc: UttrykkContext): String = uc.beskriv(uttrykk)
}
