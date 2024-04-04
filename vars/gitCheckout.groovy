def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: stagePrams.branch]],
        userRemoteConfigs: [[url: stageParams.url]]
    ])
}