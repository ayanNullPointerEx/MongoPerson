# MongoPerson
POC on Spring Boot + MongoDB 

# Command to login in Mongo shell
* docker exec into the container
* use the below command to login to the mongo shell
```bash
mongo --username root --password example --authenticationDatabase admin
```
## Few DB commands - 
```bash
show dbs
show collections
db.person.find({"address.pin":"711102"}).pretty()
db.person.find({"address.pin":"711102"},{"name":0}).pretty()
```

person -> collection name we will be working with

