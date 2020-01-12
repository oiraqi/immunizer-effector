cd ../framework
./gradlew agentLibs
jar cfm ./build/libs/immunizer-response-agent.jar ../scripts/manifest.mf
cd ../../ofbiz-framework
java -javaagent:../immunizer-response/framework/build/libs/immunizer-response-agent.jar -jar build/libs/ofbiz.jar
