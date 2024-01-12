pipeline {
    agent any

    stages {
        stage('Load and Execute Groovy Script') {
            steps {
                script {
                        def exampleModule = load "SimpleScript.groovy"
                        exampleModule.exampleMethod('jenkins')
                    }       
                }
        }
    }
}
