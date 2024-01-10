script {
    def simpleScript = load 'SimpleScript.groovy'
    echo "Loaded script: ${simpleScript}"
    def greeting = simpleScript?.greet('Jenkins')
    echo "Greeting: ${greeting}"
}