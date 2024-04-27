
def call(String credentialsId , String githubURL) {
    checkout(credentialsId , githubURL)
}


def checkout(String credentials , String githubURL) {
    git branch: 'main', credentialsId: credentials , url: githubURL
}

return this