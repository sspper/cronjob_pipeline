/*node {
    stage('Example') {
     checkout scm
        if (env.BRANCH_NAME == 'master') {
            echo 'This is Master Branch'
        } else {
            echo ' Not a Master Branch'
        }
    }
}*/

node{
stage('Build') {
    node {
        echo 'Pulling...' + env.BRANCH_NAME
        checkout scm

    }
}
}
