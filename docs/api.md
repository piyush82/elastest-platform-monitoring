# Using sentinel APIs

Sentinel monitoring exposes a rich set of APIs for user and space management. The current release of sentinel has APIs supporting bare-minimal features and as the features set get richer, so will be the APIs. Below are the list of APIs currently offered by the framework -

* /v1/api/ - shows list of supported APIs
* /v1/api/user/ - everything to do with user management
* /v1/space/ - management of monitoring space
* /v1/series/ - management of series with any space
* /v1/api/key/ - API to retrieve user's API key if forgotten
* /v1/api/endpoint - API to retrieve Sentinel's data interface parameters

## Key concepts

`Space`: Think of it as a collection of metrics belonging to different streams but somehow belonging to the same scope, application or service. A space could be allocated to metrics of smaller services making up a larger application or service.

`Series`: A series in Sentinel is a stream of metrics coming from the same source.

## API return codes at a glance

API endpoint | Verb | Return codes | Comments
-------------|------|--------------|---------
/v1/api/     | GET  | 200          | OK
             |      | 500          | Service down