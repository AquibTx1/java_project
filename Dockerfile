FROM amd64/maven:3.5.4-jdk-8

ENV SENARIO=

WORKDIR /code
COPY . .

RUN mvn compile

CMD ["sh", "-c", "/code/scripts/test.sh ${SENARIO}"]
