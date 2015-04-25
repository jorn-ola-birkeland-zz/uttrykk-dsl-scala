package uttrykk

/**
 * Created by jorn ola birkeland on 30.03.15.
 */
class MultisatsUttrykk(grunnlag: DistanseUttrykk, sats: BelopPerKilometerUttrykk, oevreGrense: DistanseUttrykk) extends BelopUttrykk{
  def <*(sats: BelopPerKilometerUttrykk) = { this; }

  def <*<(sats: BelopPerKilometerUttrykk, oevreGrense: KilometerUttrykk): MultisatsUttrykk = {
    this;
  }

  override def eval(uc: UttrykkContext): Belop = ???

  override def beskriv(uc: UttrykkContext): String = ???
}
