pipeline {
    agent any

    stages {
        stage('Load and Execute Groovy Script') {
            steps {
                script {
                    def exampleModule = load "SimpleScript.groovy"
                    echo exampleModule.exampleMethod('jenkins')
                }
            }
        }
    }
}
