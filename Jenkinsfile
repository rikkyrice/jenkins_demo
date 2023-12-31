pipeline {
    agent {
        label 'agent_for_java'
    }
    stages {
        stage ('app build'){
            steps {
                sh "./gradlew build"
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