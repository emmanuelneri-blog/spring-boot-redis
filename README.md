```
curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1010", "name": "Company 1"}'

curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1020", "name": "Company 2"}'

curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1030", "name": "Company 3"}'

curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1040", "name": "Company 4"}'
```
 
``` 
curl -s http://localhost:8080/company/
```

```
curl -s -X PUT http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1010", "name": "Company 1010"}'
```


```
curl -s http://localhost:8080/company/1010
```
```
curl -s -X DELETE http://localhost:8080/company/1040 
```