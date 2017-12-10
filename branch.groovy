/*def branchTag() {
    return "${env.BRANCH_NAME}"
}

def branchAndBuildTag() {
    return "${env.BRANCH_NAME}${env.BUILD_NUMBER}"
}
*/


package org.jenkinsci.plugins.pipeline.modeldefinition.when.impl

import org.jenkinsci.plugins.pipeline.modeldefinition.when.DeclarativeStageConditionalScript
import org.jenkinsci.plugins.workflow.cps.CpsScript


class BranchConditionalScript extends DeclarativeStageConditionalScript<BranchConditional> {
    public BranchConditionalScript(CpsScript s, BranchConditional c) {
        super(s, c)
    }

    @Override
    public boolean evaluate() {
        return describable.branchMatches(script.getProperty("env").getProperty("BRANCH_NAME"))
    }
}
return this;
