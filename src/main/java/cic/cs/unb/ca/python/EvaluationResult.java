package cic.cs.unb.ca.python;

public class EvaluationResult {
    private String flowId;
    private String evaluation;

    public EvaluationResult(String flowId, String evaluation) {
        this.flowId = flowId;
        this.evaluation = evaluation;
    }

    public String getFlowId() {
        return flowId;
    }

    public String getResult() {
        return evaluation;
    }
}
