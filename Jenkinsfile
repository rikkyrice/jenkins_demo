pipeline {
    agent {
        label 'agent01'
    }
    stages {
        stage ('app build'){
            steps {
                sh "gradlew build"
            }
        }
        stage ('app run'){
            steps {
                sh "gradlew bootRun"
            }
        }
    }
    post {
        success {
            echo 'success'
        }
        failure {
            echo 'fail'
        }
    }
}