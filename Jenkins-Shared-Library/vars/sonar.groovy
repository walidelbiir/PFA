def declareScanner(String scannername) {
    return tool scannername
}

def executeAnalysis(String scannername , String sonarServerName , String sonar_properties_path) {
    scannerHome = declareScanner(scannername)
    withSonarQubeEnv(sonarServerName) {
            sh "${scannerHome}/bin/sonar-scanner -Dproject.settings=${sonar_properties_path}"
        }
}

def qualityGateAnalysis() {
    timeout(time: 1 , unit: 'HOURS') {
        waitForQualityGate(abortPipeline: true)
    }
}

return this