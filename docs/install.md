# Installation
Sentinel can be easily installed using docker. The docker compose file is provided for convenience.

## Using docker-compose
Change into 'docker-support' subfolder under the root folder of the git repo clone. Then execute docker-compose as shown below:

```
docker-compose up
```
This command brings all the dependencies needed for sentinel:
* Grafana - grafana/grafana:4.3.2
* InfluxDB - influxdb:1.2.4-alpine
* Java8 - rolvlad/alpine-oraclejdk8
* Kafka - spotify/kafka:latest

The sentinel framework allows certain parameters to be set via environment variables. An example environment block is shown next:
```
      - STREAM_ADMINUSER=root
      - STREAM_ADMINPASS=pass1234
      - STREAM_DBENDPOINT=influxdb:8086
      - STREAM_ACCESSURL=localhost:8083
      - STREAM_DBTYPE=influxdb
      - ZOOKEEPER_ENDPOINT=kafka:2181
      - KAFKA_ENDPOINT=kafka:9092
      - TOPIC_CHECK_INTERVAL=30000
```
Currently, sentinel works only with InfluxDB time-series backend. Support for emerging alternatives such as Timescaledb is planned and will be added very soon.