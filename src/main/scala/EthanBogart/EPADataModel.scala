package EthanBogart

import edu.illinois.cs.cogcomp.saul.datamodel.DataModel
import scala.collection.JavaConversions._
import Readers.EthanBogart
import Readers.EthanBogart.Facility

/**
  * Created by ethan on 10/28/16.
  */
object EPADataModel extends DataModel {
  val facility = node[Facility]

  val name = property(facility){
    x: Facility =>
      val a = x.name
      a
  }

  val id = property(facility){
    x: Facility =>
      val b = x.id
      b
  }

  val latitude = property(facility){
    x: Facility =>
      val a = x.latitude
      a
  }

  val longitude = property(facility){
    x: Facility =>
      val a = x.longitude
      a
  }

  val percentMinority = property(facility){
    x: Facility =>
      val a = x.percentMinority
      a
  }

  val populationDensity = property(facility){
    x: Facility =>
      val a = x.populationDensity
      a
  }

  val daysSinceInspection = property(facility){
    x: Facility =>
      val a = x.daysSinceInspection
      a
  }

  val complianceStatus = property(facility){
    x: Facility =>
      val a = x.complianceStatus
      a
  }

  val TRIReleases = property(facility){
    x: Facility =>
      val a = x.TRIReleases
      a
  }

}
