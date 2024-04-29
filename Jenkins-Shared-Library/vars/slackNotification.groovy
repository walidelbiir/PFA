def send(Map params) {
    channel = params.channel
    msg = params.msg
    status = params.status
    slackSend channel: channel , message: msg , color: status
}

def uploadFile(String path , String channel = "#pfa,walid.elbir" , String comment) {
    slackUploadFile filePath: path, channel: channel, initialComment: comment
}

return this