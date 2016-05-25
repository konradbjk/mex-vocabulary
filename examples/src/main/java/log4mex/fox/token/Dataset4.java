package log4mex.fox.token;

import org.aksw.mex.log4mex.MEXSerializer;
import org.aksw.mex.log4mex.MyMEX;
import org.aksw.mex.util.MEXConstant;
import org.aksw.mex.util.MEXEnum.*;

import java.util.Date;

/**
 * Created by Moussallem on 26.04.16.
 */
public class Dataset4 {

    public static void main(String[] args) {

        System.out.println("starting Fox");

        //the MEX wrapper!
        MyMEX mex = new MyMEX();

        try{

        //basic authoring provenance
        {
            //change later here the sets for adds
            mex.setAuthorName("René Speck");
            mex.setAuthorEmail("speck@informatik.uni-leipzig.de");
            mex.setContext(EnumContexts.NAMED_ENTITY_RECOGNITION);
            mex.setOrganization("Leipzig University");

            mex.setExperimentId("E1_token");
            mex.setExperimentTitle("token-based experiment");
            mex.setExperimentDate(new Date());
            mex.setExperimentDescription("Token-based evaluation on 15 ensemble learning algorithms");
        }

        String eid = "E001S004";
        //ml-experiment-configuration
        {
            mex.addConfiguration(eid);

            mex.Configuration(eid).setDescription("analyzing 10-fold cross validation for 15 algorithms");
            //mex.Configuration(eid).setModel("svm20150322", "model generated by LibSVM", new Date());
            mex.Configuration(eid).setSamplingMethod(EnumSamplingMethods.CROSS_VALIDATION, 10);
            mex.Configuration(eid).SamplingMethod().setTrainSize(0.9);
            mex.Configuration(eid).SamplingMethod().setTestSize(0.1);
            mex.Configuration(eid).SamplingMethod().setSequential(true);

            mex.Configuration(eid).setHardwareConfiguration("ubuntu", EnumProcessors.INTEL_COREI7, EnumRAM.SIZE_16GB, "SSD", EnumCaches.CACHE_3MB);


            mex.Configuration(eid).DataSet().setName("Reuters");
            mex.Configuration(eid).DataSet().setDescription("consists of 50 documents randomly chosen out of the Reuters-215788 corpus");
            mex.Configuration(eid).DataSet().setURI("http://kdd.ics.uci.edu/databases/reuters21578/reuters21578.html.");

        }

        /*
        //adding algorithms and parameters
        AlgorithmVO alg1,alg2,alg3,alg4,alg5,alg6,alg7,alg8,alg9,alg10,alg11,alg12,alg13,alg14,alg15,alg16,alg17,alg18,alg19;
        {
            //mex.Configuration(eid).setImplementation(EnumImplementations., "3.6.6");

            alg1 = mex.Configuration(eid).addAlgorithm("alg", EnumAlgorithmsClasses.BaggingJ48);
            alg2 = mex.Configuration(eid).addAlgorithm("SMO", EnumAlgorithmsClasses.SequentialMinimalOptimization);
            alg3 = mex.Configuration(eid).addAlgorithm("LMR", EnumAlgorithmsClasses.AdditiveLogisticRegression);
            alg4 = mex.Configuration(eid).addAlgorithm("DT", EnumAlgorithmsClasses.DecisionTable);
            alg5 = mex.Configuration(eid).addAlgorithm("NB", EnumAlgorithmsClasses.NaiveBayes);
            alg6 = mex.Configuration(eid).addAlgorithm("SV", EnumAlgorithmsClasses.SimpleVoting);
            alg7 = mex.Configuration(eid).addAlgorithm("LMT", EnumAlgorithmsClasses.LogisticModelTrees);
            alg8 = mex.Configuration(eid).addAlgorithm("NER", EnumAlgorithmsClasses.NER_OPEN_NLP);
            alg9 = mex.Configuration(eid).addAlgorithm("MP", EnumAlgorithmsClasses.MultilayerPerceptron);
            alg10 = mex.Configuration(eid).addAlgorithm("J48", EnumAlgorithmsClasses.J48);
            alg11 = mex.Configuration(eid).addAlgorithm("MP", EnumAlgorithmsClasses.NER_STANFORD);
            alg12 = mex.Configuration(eid).addAlgorithm("SVM", EnumAlgorithmsClasses.SupportVectorMachines);
            alg13 = mex.Configuration(eid).addAlgorithm("NER" , EnumAlgorithmsClasses.NER_ILLINOIS_EXTENDED);
            alg14 = mex.Configuration(eid).addAlgorithm("FT", EnumAlgorithmsClasses.FunctionalTrees);
            alg15 = mex.Configuration(eid).addAlgorithm("ADA", EnumAlgorithmsClasses.AdaBoostM1);
            alg16 = mex.Configuration(eid).addAlgorithm("CLV", EnumAlgorithmsClasses.ClassLevelVoting);
            alg17 = mex.Configuration(eid).addAlgorithm("NER", EnumAlgorithmsClasses.NER_BALIE);
            alg18 = mex.Configuration(eid).addAlgorithm("RF", EnumAlgorithmsClasses.RandomForest);
            alg19 = mex.Configuration(eid).addAlgorithm("alg", EnumAlgorithmsClasses.LogisticRegression);

            String[] param = {"C", "10^3", "alpha", "0.2"};
            alg1.addParameter(param);
        }
*/
        String ex1;
        String ex2;
        String ex3;
        String ex4;
        String ex5;
        String ex6;
        String ex7;
        String ex8;
        String ex9;
        String ex10;
        String ex11;
        String ex12;
        String ex13;
        String ex14;
        String ex15;
        String ex16;
        String ex17;
        String ex18;
        String ex19;
        
        //associate your run x each algorithm
        {
            ex1 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);

            mex.Configuration(eid).Execution(ex1).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex1).setAlgorithm(mex.Configuration(eid).addAlgorithm("SMO", EnumAlgorithmsClasses.SequentialMinimalOptimization));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.RECALL, .8445);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.PRECISION, .8849);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.F1MEASURE, .8628);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.ERROR, 0.98);
            mex.Configuration(eid).Execution(ex1).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.859);

                //your models call here !
            mex.Configuration(eid).Execution(ex1).setEndDate(new Date());
        }
        
        
         {
            ex2 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex2).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex2).setAlgorithm(mex.Configuration(eid).addAlgorithm("LMR", EnumAlgorithmsClasses.AdditiveLogisticRegression));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.RECALL, .8422);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.PRECISION, .9101);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.F1MEASURE, .8722);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.ERROR, 0.9);
            mex.Configuration(eid).Execution(ex2).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .87);

                //your models call here !
            mex.Configuration(eid).Execution(ex2).setEndDate(new Date());
        }
         
                 {
            ex3 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex3).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex3).setAlgorithm(mex.Configuration(eid).addAlgorithm("DT", EnumAlgorithmsClasses.DecisionTable));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.RECALL, .8441);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.PRECISION, .89);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.F1MEASURE, .8643);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.ERROR, 0.99);
            mex.Configuration(eid).Execution(ex3).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.861);

                //your models call here !
            mex.Configuration(eid).Execution(ex3).setEndDate(new Date());
        }
                 
                {
            ex4 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex4).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex4).setAlgorithm(mex.Configuration(eid).addAlgorithm("NB", EnumAlgorithmsClasses.NaiveBayes));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.RECALL, .8654);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.PRECISION, .8318);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.F1MEASURE, .8477);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.ERROR, 1.1);
            mex.Configuration(eid).Execution(ex4).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .842);

                //your models call here !
            mex.Configuration(eid).Execution(ex4).setEndDate(new Date());
        }
                
                        
                                {
            ex5 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex5).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex5).setAlgorithm(mex.Configuration(eid).addAlgorithm("ADA", EnumAlgorithmsClasses.AdaBoostM1));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.RECALL, .8451);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.PRECISION, .9047);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.F1MEASURE, .8715);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.ERROR, 0.93);
            mex.Configuration(eid).Execution(ex5).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.868);
          
                //your models call here !
            mex.Configuration(eid).Execution(ex5).setEndDate(new Date());
        }

                                        {
            ex6 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex6).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex6).setAlgorithm(mex.Configuration(eid).addAlgorithm("alg", EnumAlgorithmsClasses.BaggingJ48));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.RECALL, .8470);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.PRECISION, .9016);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.F1MEASURE, .8714);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.ERROR, 0.94);
            mex.Configuration(eid).Execution(ex6).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .868);

                //your models call here !
            mex.Configuration(eid).Execution(ex6).setEndDate(new Date());
        }
                                        
                                                {
           ex7 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex7).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex7).setAlgorithm(mex.Configuration(eid).addAlgorithm("LMT", EnumAlgorithmsClasses.LogisticModelTrees));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.RECALL, .8441);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.PRECISION, .9108  );
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.F1MEASURE, .8743);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.ERROR, 0.89);
            mex.Configuration(eid).Execution(ex7).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .871);

                //your models call here !
            mex.Configuration(eid).Execution(ex7).setEndDate(new Date());
        }
                                                
                                                        {
            ex8 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex8).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex8).setAlgorithm(mex.Configuration(eid).addAlgorithm("NER", EnumAlgorithmsClasses.NER_OPEN_NLP));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.RECALL, .6794);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.PRECISION, .8208);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.F1MEASURE, .7396);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.ERROR, 1.76);
            mex.Configuration(eid).Execution(ex8).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.736);
                //your models call here !
            mex.Configuration(eid).Execution(ex8).setEndDate(new Date());
        }
                                                        
                                                                {
            ex9 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex9).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex9).setAlgorithm(mex.Configuration(eid).addAlgorithm("MP", EnumAlgorithmsClasses.MultilayerPerceptron));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.RECALL, .8589);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.PRECISION, .8946);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.F1MEASURE, .8755);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.ERROR, 0.9);
            mex.Configuration(eid).Execution(ex9).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.871);

                //your models call here !
            mex.Configuration(eid).Execution(ex9).setEndDate(new Date());
        }
                                                                
                                                                       {
            ex10 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex10).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex10).setAlgorithm(mex.Configuration(eid).addAlgorithm("J48", EnumAlgorithmsClasses.J48));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.RECALL, .8464);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.PRECISION, .9070);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.F1MEASURE, .8733);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.ERROR, 0.93);
            mex.Configuration(eid).Execution(ex10).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.87);

                //your models call here !
            mex.Configuration(eid).Execution(ex10).setEndDate(new Date());
        }
                                                                       
                                                                               {
            ex11 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex11).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex11).setAlgorithm(mex.Configuration(eid).addAlgorithm("MP", EnumAlgorithmsClasses.NER_STANFORD));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.RECALL, .8157);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.PRECISION, .8485);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.F1MEASURE, .8285);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.ERROR, 1.2);
            mex.Configuration(eid).Execution(ex11).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .824);

                //your models call here !
            mex.Configuration(eid).Execution(ex11).setEndDate(new Date());
        }
                                                                                                       {
           ex12 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex12).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex12).setAlgorithm(mex.Configuration(eid).addAlgorithm("SV", EnumAlgorithmsClasses.SimpleVoting));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.RECALL, .8011);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.PRECISION, .8115);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.F1MEASURE, .7941);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.ERROR, 1.43);
            mex.Configuration(eid).Execution(ex12).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .793);

                //your models call here !
            mex.Configuration(eid).Execution(ex12).setEndDate(new Date());
        }
                                                                               
                                                                                       {
            ex13 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex13).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex13).setAlgorithm(mex.Configuration(eid).addAlgorithm("SVM", EnumAlgorithmsClasses.SupportVectorMachines));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.RECALL, .8457);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.PRECISION, .9175);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.F1MEASURE, .8778);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.ERROR, 0.89);
            mex.Configuration(eid).Execution(ex13).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .875);

                //your models call here !
            mex.Configuration(eid).Execution(ex13).setEndDate(new Date());
        }
                                                                                       
                                                                                               {
           ex14 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex14).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex14).setAlgorithm(mex.Configuration(eid).addAlgorithm("NER", EnumAlgorithmsClasses.NER_BALIE));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.RECALL, .6492);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.PRECISION, .6861);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.F1MEASURE, .6478);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.ERROR, 2.62);
            mex.Configuration(eid).Execution(ex14).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .645);

                //your models call here !
            mex.Configuration(eid).Execution(ex14).setEndDate(new Date());
        }
                                                                                               
                                                                                                       {
            ex15 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex15).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex15).setAlgorithm(mex.Configuration(eid).addAlgorithm("FT", EnumAlgorithmsClasses.FunctionalTrees));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.RECALL, .8525);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.PRECISION, .8875);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.F1MEASURE, .8687);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.ERROR, 0.95);
            mex.Configuration(eid).Execution(ex15).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.864);

                //your models call here !
            mex.Configuration(eid).Execution(ex15).setEndDate(new Date());
        }
                                                                                                       
                                                                                                               {
            ex16 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex16).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex16).setAlgorithm(mex.Configuration(eid).addAlgorithm("CLV", EnumAlgorithmsClasses.ClassLevelVoting));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.RECALL, .8196);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.PRECISION, .8866);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.F1MEASURE, .8464);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.ERROR, 1.14);
            mex.Configuration(eid).Execution(ex16).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.844);

                //your models call here !
            mex.Configuration(eid).Execution(ex16).setEndDate(new Date());
        }

                                                                                                                       {
           ex17 =  mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex17).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex17).setAlgorithm(mex.Configuration(eid).addAlgorithm("RF", EnumAlgorithmsClasses.RandomForest));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.RECALL, .8611);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.PRECISION, .8924);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.F1MEASURE, .8758);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.ERROR, 0.9);
            mex.Configuration(eid).Execution(ex17).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.872);

                //your models call here !
            mex.Configuration(eid).Execution(ex17).setEndDate(new Date());
        }
                                                                                                                               {
            ex18 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex18).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex18).setAlgorithm(mex.Configuration(eid).addAlgorithm("alg", EnumAlgorithmsClasses.LogisticRegression));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.RECALL, .8433);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.PRECISION, .9085);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.F1MEASURE, .8727);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.ERROR, 0.89);
            mex.Configuration(eid).Execution(ex18).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, .87);

                //your models call here !
            mex.Configuration(eid).Execution(ex18).setEndDate(new Date());
        }
                                                                                                                                       {
            ex19 = mex.Configuration(eid).addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
           // mex.Configuration(eid).setExecutionId(0, ex1);

            mex.Configuration(eid).Execution(ex19).setStartDate(new Date());
            mex.Configuration(eid).Execution(ex19).setAlgorithm(mex.Configuration(eid).addAlgorithm("NER" , EnumAlgorithmsClasses.NER_ILLINOIS_EXTENDED));
            //mex.Configuration(eid).Execution(ex1).setStartsAtPosition("1233");
           // mex.Configuration(eid).Execution(ex1).setEndsAtPosition("1376");
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.RECALL, .8374);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.PRECISION, .8827);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.F1MEASURE, .8535);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.ERROR, 1.09);
            mex.Configuration(eid).Execution(ex19).addPerformance(EnumMeasures.MATTHEWSCORRELATIONCOEFICIENT, 0.851);

                //your models call here !
            mex.Configuration(eid).Execution(ex19).setEndDate(new Date());
        }
                                                                                                                                       
            try{
                MEXSerializer.getInstance().saveToDisk("./metafiles/log4mex/fox/token/4", "http://mex.aksw.org/examples/", mex, MEXConstant.EnumRDFFormats.TTL);
            }catch (Exception e){
                System.out.print(e.toString());
            }

            System.out.println("The MEX file has been successfully created: share it ;-)");

        System.exit(0);

        }catch (Exception e){
            System.out.println(e.toString());
        }


    }

}