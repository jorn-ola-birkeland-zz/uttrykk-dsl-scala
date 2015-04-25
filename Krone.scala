package uttrykk

/**
 * Created by jorn ola birkeland on 25.03.15.
 */
class Krone(belop: Int) {
  implicit def kr:KroneUttrykk = new KroneUttrykk(Belop.kr(belop.toDouble))
}
