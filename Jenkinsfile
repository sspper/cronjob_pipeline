pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
                echo env.BRANCH_NAME
            }
        }
    }
}
