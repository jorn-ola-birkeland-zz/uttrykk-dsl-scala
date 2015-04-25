package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
trait BelopUttrykk extends Uttrykk[Belop]{

  def < (that: BelopUttrykk): BolskUttrykk = new BelopMindreEnnUttrykk(this,that)
  def + (that: BelopUttrykk): BelopUttrykk = new BelopSumUttrykk(this,that)
  def - (that: BelopUttrykk): BelopUttrykk = new BelopDiffUttrykk(this,that)
  def / (that: BelopUttrykk): TallUttrykk = new BelopDivisjonUttrykk(this,that)
  def / (that: DistanseUttrykk) = new BelopPerKilometerUttrykk(this,that)
  def i[T] (sted: T): StedbundetBelopUttrykk[T] = new StedbundetKroneUttrykk(this,sted)
  def begrensetOppadTil(that:BelopUttrykk) = new BelopGrenseUttrykk(this).oppadTil(that)

}
