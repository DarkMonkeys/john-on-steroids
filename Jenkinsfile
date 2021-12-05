pipeline {
    agent any

    stages {
        stage('Git') {
            steps {
                sh 'rm -rf john-on-steroids'
                sh 'git clone https://github.com/DarkMonkeys/john-on-steroids'
            }
        }
        stage('Maven clean') {
            steps {
                sh 'cd john-on-steroids && mvn clean'
            }
        }
         stage('Maven install') {
            steps {
                sh 'cd john-on-steroids && mvn install'
            }
        }
    }
}
