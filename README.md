# ifanow
assignment for ifanow



Run following commands to use the project

  1. docker build -t springboot-mongo:latest .
  2. docker run -d -p 27000:27017 --name mongo mongo
  3. docker run -p 8080:8080 --name springboot-mongo --link=mongo springboot-mongo


Use following request from to post event:
  url: http://192.168.99.100:8080/api/event
  requestBody:
  {
    "noun": "bill",
    "userId": 178765,
    "ts": "20170315 134850",
    "latLong": "19.07,72.87",
    "verb": "pay",
    "timeSpent": 72,
    "properties": {
        "bank": "hdfc",
        "merchantid": 234,
        "value": 139.5,
        "mode": "netbank"
    }
}
