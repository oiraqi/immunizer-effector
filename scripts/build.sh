cd ../framework
./gradlew agentLibs
jar cfm ./build/libs/immunizer-response-agent.jar ../scripts/manifest.mf
