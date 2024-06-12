#!/bin/bash

# 프로젝트를 빌드
./gradlew clean build

# 빌드가 성공했는지 확인
if [ $? -eq 0 ]; then
    echo "Build succeeded. Running the JAR file..."

    # JAR 파일을 실행합니다.
    java -jar build/libs/sakak-algorithm-1.0-SNAPSHOT.jar
else
    echo "Build failed. Please check the errors and try again."
    exit 1
fi
