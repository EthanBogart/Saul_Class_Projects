package EthanBogart

import Readers.EthanBogart.EPADataModel._
import Readers.EthanBogart.Facility
import edu.illinois.cs.cogcomp.lbjava.learn.SupportVectorMachine
import weka.classifiers.functions.MultilayerPerceptron
import weka.classifiers.bayes.NaiveBayes
import weka.classifiers.trees.RandomForest
import edu.illinois.cs.cogcomp.saul.learn.SaulWekaWrapper
import edu.illinois.cs.cogcomp.saul.classifier.Learnable
import weka.classifiers.trees.RandomForest
/**
  * Created by ethan on 11/17/16.
  */
object EPAClassifier {

  object fullSVMClassifier extends Learnable[Facility](facility) {
    def label = complianceStatus

    override def feature = using(latitude, longitude, percentMinority, populationDensity, daysSinceInspection,
      TRIReleases)

    override lazy val classifier = new SupportVectorMachine()
  }

  // Doesn't use population data like percentMinority or populationDensity
  object smallSVMClassifier extends Learnable[Facility](facility) {
    def label = complianceStatus

    override def feature = using(latitude, longitude, daysSinceInspection,
       TRIReleases)

    override lazy val classifier = new SupportVectorMachine()
  }

  object naiveBayes extends Learnable[Facility](facility) {
    def label = complianceStatus

    override def feature = using(latitude, longitude, percentMinority, populationDensity, daysSinceInspection,
       TRIReleases)

    override lazy val classifier = new SaulWekaWrapper( new NaiveBayes() )
  }

  object MLP extends Learnable[Facility](facility) {
    def label = complianceStatus

    override def feature = using(latitude, longitude, percentMinority, populationDensity, daysSinceInspection,
      TRIReleases)

    override lazy val classifier = new SaulWekaWrapper( new MultilayerPerceptron() )
  }

  object randomForest extends Learnable[Facility](facility) {
    def label = complianceStatus

    override def feature = using(latitude, longitude, percentMinority, populationDensity, daysSinceInspection,
      TRIReleases)

    override lazy val classifier = new SaulWekaWrapper( new RandomForest() )
  }
}
