# FROM amd64/maven:3.5.4-jdk-8
FROM amd64/maven:3-openjdk-8-slim

ENV SENARIO=

WORKDIR /code
COPY . .

RUN mvn compile

CMD ["sh", "-c", "/code/scripts/test.sh ${SENARIO}"]
