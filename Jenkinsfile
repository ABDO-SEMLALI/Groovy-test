pipeline {
    agent any

    stages {
        stage('Load and Execute Groovy Script') {
            steps {
                script {
                    // Load the Groovy script
                    def rootDir = pwd()
                    def exampleModule = load "${rootDir}@script/SimpleScript.groovy "

                    // Call a method from the loaded script
                    def greeting = simpleScript.greet('Jenkins')
                    
                    // Print the result
                    echo greeting
                }
            }
        }
    }
}
