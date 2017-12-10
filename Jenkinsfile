pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
		def del = 'load branch.groovy'
		del.getbranch()
            }
        }
    }
}
