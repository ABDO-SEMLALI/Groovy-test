pipeline {
    agent any

    stages {
        stage('Load and Execute Groovy Script') {
            steps {
                script {
                        def rootDir = pwd()
                        def exampleModule = load "${rootDir}@script/Example.Groovy "
                        exampleModule.exampleMethod()
                        exampleModule.otherExampleMethod()
                    }       
                }
        }
    }
}
