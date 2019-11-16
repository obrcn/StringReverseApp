from maven
copy . /target
run mvn clean package
cmd java -jar /demo-0.0.1-SNAPSHOT.jar
