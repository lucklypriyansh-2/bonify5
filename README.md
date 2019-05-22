# bonify5


STEPS TO RUN 

Make sure java is installed
DOWNLOAD THE PROJECT
GO TO DIRECTORY WHERE PROJECT IS DOWNLOADED 
run ./mvnw clean install
cd target/
java -jar bonify5-0.0.1-SNAPSHOT.jar &

CURL REQUEST

Sample request

# Request 1
   file path is used to provide path of file  which needs to be imported
   
curl -X GET \
  'http://localhost:8080/api/csv?filepath=/Users/p0n004h/Desktop/bankData.csv' \
  -H 'Postman-Token: d954989b-b3ac-4938-b901-7a97963378a7' \
  -H 'cache-control: no-cache'

# Request 2
   file path is used to provide path of file  which needs to be imported
   
   request should have variable http://localhost:8080/api/csv/{bankidentifierid}
curl -X GET \
  http://localhost:8080/api/csv/10010011 \
  -H 'Postman-Token: ba5c2159-4e33-48af-b752-24e04429fd48' \
  -H 'cache-control: no-cache'
