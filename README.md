# API Spec

## Create Product

Request :
- Method : `POST`
- Endpoint : `/api/product`
- Header :
    - Content-Type: `application/json`
    - Accept: `application/json`
- Body :

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer",
  "createdAt": "date"
}
```

Response :

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer",
  "createdAt": "date"
}
```

## Get Siswa

## Update Siswa

## Delete Siswa