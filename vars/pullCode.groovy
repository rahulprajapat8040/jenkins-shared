def call(String url, String branch = 'main') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: url]]
    ])
}
