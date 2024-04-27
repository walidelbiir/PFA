def checkout(String credentialsId , String githubURL) {
    git branch: 'main', credentialsId: credentialsId , url: githubURL
}

return this