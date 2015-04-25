package uttrykk

import KroneUttrykk.kr
import KilometerUttrykk.km
import BelopGrenseUttrykk.begrens
import Implicits.intTilKm;
import Implicits.intTilKr;

object Test {

//  implicit def pimpInt(belop: Int): Krone = new Krone(belop)

  def main(args: Array[String]) = {

    val SATS_HOY = kr(1.50)/km
    val SATS_LAV = kr(1.70)/km
    val SATS_NULL = kr(0)/km
    val totalBomFergeTunnel = kr(14350)
    val reiseKm = (13500 km) + (24350 km)
    val egenandel = 16000 kr

    val begrensetBom = totalBomFergeTunnel begrensetOppadTil kr(3300)

    val kilometerfradrag = reiseKm *< (SATS_HOY,km(50000)) <*< (SATS_LAV,km(75000)) <* SATS_NULL

    val reisefradrag = begrensetBom + kilometerfradrag - egenandel

    val stedbundetReisefradrag = reisefradrag i "Lom"

    val kontekst = new SkattyterKontekst()

    println(stedbundetReisefradrag.eval(kontekst))
  }
}