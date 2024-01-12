pipeline {
    agent any

    stages {
        stage('Load and Execute Groovy Script') {
            steps {
                script {
                    // Load the Groovy script
//                    def simpleScript = load './SimpleScript.groovy'

                    // Call a method from the loaded script
  //                  def greeting = simpleScript.greet('Jenkins')
                    
                    // Print the result
    //                echo greeting

                    modules.first = load "SimpleScript.groovy"                    modules.second.init(modules.first)
                    modules.first.greet('Jenkins')
                }
            }
        }
    }
}
