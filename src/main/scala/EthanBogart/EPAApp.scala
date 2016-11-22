package EthanBogart

import EthanBogart.EPAClassifier
import Readers.EthanBogart.{DataReader, EPADataModel}

import scala.collection.JavaConversions._

/**
  * Created by ethan on 11/17/16.
  */
object EPAApp extends App {

  val facilityReader = new DataReader()

  val facilityData = facilityReader.facilities

  val train = math.ceil(facilityData.size() * 0.7).toInt
  val trainSet = facilityData.subList(0, train)
  val testSet = facilityData.subList(train, facilityData.size() - 1)

  EPADataModel.facility.populate(trainSet)
  EPADataModel.facility.populate(testSet,false)
  EPAClassifier.randomForest.learn(10)
  EPAClassifier.randomForest.test()


}