package uttrykk

/**
 * Created by jorn ola birkeland on 28.03.15.
 */
class Kilometer(verdi: Double) {
  implicit def km:KilometerUttrykk = KilometerUttrykk.km(verdi)

}
