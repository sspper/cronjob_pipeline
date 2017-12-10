pipeline {
    agent any
    stages {
        stage('SCM') {
                checkout scm
        }
       stage('Branch'){

	def branch = ${BRANCH_NAME}
        echo branch
	sh 'echo $BRANCH_NAME'
    }
}
