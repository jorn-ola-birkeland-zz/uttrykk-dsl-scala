package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
object Implicits {
  implicit def intTilKr(belop: Int): Krone = new Krone(belop)
  implicit def intTilKm(km: Int): Kilometer = new Kilometer(km)


}
