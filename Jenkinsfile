pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
		def branchName = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
		echo branchName
            }
        }
    }
}
