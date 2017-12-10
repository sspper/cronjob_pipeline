def branchTag() {
    return "${env.BRANCH_NAME}"
}

def branchAndBuildTag() {
    return "${env.BRANCH_NAME}${env.BUILD_NUMBER}"
}
