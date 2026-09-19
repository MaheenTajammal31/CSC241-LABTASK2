public class AIExperimentDemo {

    static void addBonus(AIExperiment experiment) {
        experiment.completedEpochs = experiment.completedEpochs + 2;
    }

    public static void main(String[] args) {

        AIExperiment exp1 = new AIExperiment();
        AIExperiment exp2 = new AIExperiment();

        exp1.experimentName = "Image Classification";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 20;

        exp2.experimentName = "Chatbot Training";
        exp2.completedEpochs = 5;
        exp2.targetEpochs = 15;

        System.out.println("Initial State:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(3);
        exp2.runEpochs(4, 2);

        System.out.println("\nAfter Running Epochs:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        System.out.println("\nRemaining Epochs:");
        System.out.println(exp1.remainingEpochs());
        System.out.println(exp2.remainingEpochs());

        addBonus(exp1);

        System.out.println("\nAfter Pass-by-Value Mutation:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
    }
}