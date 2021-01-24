# MongoPerson
POC on Spring Boot + MongoDB 

# Command to login in Mongo shell
1. docker exec into the container
2. use the below command to login to the mongo shell
mongo --username root --password example --authenticationDatabase admin

## Few DB commands - 
show dbs
show collections
person -> collection name we will be working with

 db.person.find({"address.pin":"711102"}).pretty()
 db.person.find({"address.pin":"711102"},{"name":0}).pretty()
