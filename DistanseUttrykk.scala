package uttrykk

/**
 * Created by jorn ola birkeland on 27.03.15.
 */
trait DistanseUttrykk extends Uttrykk[Distanse]{
  def + (that: DistanseUttrykk): DistanseUttrykk = new DistanseSumUttrykk(this,that)
  def *< (that: Tuple2[BelopPerKilometerUttrykk,DistanseUttrykk]): MultisatsUttrykk = new MultisatsUttrykk(this,that._1,that._2)

}
