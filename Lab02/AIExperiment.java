class AIExperiment {

    String experimentName;
    int completedEpochs;
    int targetEpochs;

    void runEpochs(int epochs) {
        completedEpochs = completedEpochs + epochs;
    }

    void runEpochs(int epochs, int bonusEpochs) {
        completedEpochs = completedEpochs + epochs + bonusEpochs;
    }

    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs;
        return remaining;
    }

    String status() {
        return experimentName + " - Completed: "
                + completedEpochs + "/" + targetEpochs;
    }
}