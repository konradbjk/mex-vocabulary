package log4mex;

import org.aksw.mex.log4mex.MEXSerializer;
import org.aksw.mex.log4mex.MyMEX;
import org.aksw.mex.util.MEXConstant;
import org.aksw.mex.util.MEXEnum.*;

import java.util.Date;

/**
 * Created by esteves on 27.06.15.
 */
public class Example03_lightweight {

    public static void main(String[] args) {

        System.out.println("starting example 03...");

        //the MEX wrapper!
        MyMEX mex = new MyMEX();

        try{

            //basic authoring provenance
            {
                //change later here the sets for adds
                mex.setAuthorName("D Esteves");
                mex.setAuthorEmail("esteves@informatik.uni-leipzig.de");
                mex.setContext(EnumContexts.RECOMENDER_SYSTEMS);
                mex.setOrganization("Leipzig University");

                mex.setExperimentId("E001");
                mex.setExperimentTitle("my first experiment");
                mex.setExperimentDate(new Date());
                mex.setExperimentDescription("my first MEX experiment");
            }

            String eid = "E001S001";
            //ml-experiment-configuration
            {

                mex.Configuration().setDescription("analyzing 10-fold cross validation for SVM");
                mex.Configuration().setModel("svm20150322", "model generated by LibSVM", new Date());
                mex.Configuration().setSamplingMethod(EnumSamplingMethods.CROSS_VALIDATION, 0.8, 0.2);
                mex.Configuration().setHardwareConfiguration("ubuntu", EnumProcessors.INTEL_COREI7, EnumRAM.SIZE_16GB, "SSD", EnumCaches.CACHE_3MB);
                mex.Configuration().setDataSet("http://www.bmfbovespa.com.br/shared/iframe.aspx?idioma=pt-br&url=http://www.bmfbovespa.com.br/pt-br/cotacoes-historicas/FormSeriesHistoricas.asp", "bovespads", "bovespa");

                mex.Configuration().addFeature("min");
                mex.Configuration().addFeature("max");
                mex.Configuration().addFeature("ope");
                mex.Configuration().addFeature("clo");

            }

            //AlgorithmVO alg1, alg2;
            String alg1, alg2;
            //adding algorithms and parameters
            {
                mex.Configuration().setTool(EnumTools.WEKA, "3.6.6");
                String[] param = {"C", "10^3", "alpha", "0.2"};
                alg1 = mex.Configuration().addAlgorithm("svm", EnumAlgorithmsClasses.SupportVectorMachines);
                mex.Configuration().Algorithm(alg1).addParameter(param);

                alg2 = mex.Configuration().addAlgorithm("nb", EnumAlgorithmsClasses.NaiveBayes);
                mex.Configuration().Algorithm(alg2).addParameter(param);
            }

            String ex1 = "EX001";
            String ex2 = "EX002";
            //associate your run x each algorithm
            {
                mex.Configuration().addExecution(EnumExecutionsType.OVERALL, EnumPhases.TRAIN);
                mex.Configuration().setExecutionId(0, ex1);

                mex.Configuration().Execution(ex1).setStartDate(new Date());
                mex.Configuration().Execution(ex1).setAlgorithm(alg1);
                mex.Configuration().Execution(ex1).setStartsAtPosition("1233");
                mex.Configuration().Execution(ex1).setEndsAtPosition("1376");


                //your models call here !
                mex.Configuration().Execution(ex1).setEndDate(new Date());

                mex.Configuration().addExecution(EnumExecutionsType.OVERALL, EnumPhases.TEST);
                mex.Configuration().setExecutionId(1, ex2);

                mex.Configuration().Execution(ex2).setStartDate(new Date());
                mex.Configuration().Execution(ex2).setAlgorithm(alg2);
                mex.Configuration().Execution(ex2).setStartsAtPosition("1377");
                mex.Configuration().Execution(ex2).setEndsAtPosition("1420");


                //your models call here !
                mex.Configuration().Execution(ex2).setEndDate(new Date());

            }

            //saving performances for each run
            {
                mex.Configuration().Execution(ex1).addPerformance(EnumMeasures.ACCURACY, .96);
                mex.Configuration().Execution(ex1).addPerformance(EnumMeasures.TRUEPOSITIVERATE, .70);
                mex.Configuration().Execution(ex2).addPerformance(EnumMeasures.ERROR, .04);
                mex.Configuration().Execution(ex2).addPerformance(EnumMeasures.ACCURACY, .83);
                mex.Configuration().Execution(ex2).addPerformance(EnumMeasures.TRUEPOSITIVERATE, .61);
            }

            //exporting your ML experiment

            try{
                MEXSerializer.getInstance().saveToDisk("/Users/dnes/Github/mexproject/metafiles/log4mex/ex003", "http://mex.aksw.org/examples/", mex, MEXConstant.EnumRDFFormats.TTL);
            }catch (Exception e){
                System.out.print(e.toString());
            }

            System.out.println("The MEX file [ex003] has been successfully created: share it ;-)");

            System.exit(0);

        }catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
