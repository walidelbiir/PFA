def send(String channel = "#pfa,walid.elbir" , String msg , String status) {
    slackSend channel: channel , message: msg , color: status
}

def uploadFile(String path , String channel = "#pfa,walid.elbir" , String comment) {
    slackUploadFile filePath: path, channel: channel, initialComment: comment
}

return this