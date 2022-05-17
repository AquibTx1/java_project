FROM amd64/maven:3.5.4-jdk-8
# FROM maven:3.5.4-jdk-8

ENV SENARIO=

WORKDIR /code
COPY . .

RUN apt-get update
RUN apt-get install libglib2.0-0

RUN mvn compile

# CMD ["sh", "-c", "/code/scripts/test.sh ${SENARIO}"]
CMD ["bash"]
