def install_dependencies() {
    sh 'npm install'
}

def install_backend_test_dependencies() {
    sh 'npm i --save-dev chai chai-http mocha sinon nyc mocha-junit-reporter'
    sh 'npm i --save-dev mongodb-memory-server --ignore-scripts'
}

def backend_test() {
    sh 'NODE_ENV=test npm test ./tests'
}

return this