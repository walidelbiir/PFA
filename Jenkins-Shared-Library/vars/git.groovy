
// def call(String credentialsId , String githubURL) {
//     checkout(credentialsId , githubURL)
// }


def checkout(Map params) {
    def credentials = params.credentials
    def githubURL = params.githubURL
    git branch: 'main', credentialsId: credentials , url: githubURL
}

return this