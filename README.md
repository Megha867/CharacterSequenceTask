# CharacterSequenceTask

API endpoint http://192.168.1.124:8082/numtochar?list_of_number=1,2,3,4 (This IP address in URL is created by eureka server) to convert number to chanrachter sequence (client) created using microservices.
Please find ServiceRegistrey repository (server) https://github.com/Megha867/ServiceRegistry.git where CharacterSequence is registered as service.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Steps to run the projects:

- Run ServiceRegistry project
- Run CharachterSequenceTask project
- Go to browser, http:localhost:8761 (This is will open eureka server)
- Click the NUMBER-CONVERTER URL (This will open new page)
- Remove "http://192.168.1.124:8082/actuator/info" URL and hit below URL http://192.168.1.124:8082/numtochar?list_of_number=1,2,3,4
