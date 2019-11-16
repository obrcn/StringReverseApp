from maven
copy . /
run mvn clean package
cmd java -jar /target/demo-0.0.1-SNAPSHOT.jar
