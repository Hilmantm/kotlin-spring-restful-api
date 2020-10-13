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
  "createdAt": "date",
  "updatedAt": "date"
}
```

## Get Siswa

Request :
- Method : `GET`
- Endpoint : `/api/products/{id_product}`
- Header :
    - Accept: `application/json`

Response :

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer",
  "createdAt": "date",
  "updatedAt": "date"
}
```

## Update Siswa

Request :
- Method : `PUT`
- Endpoint : `/api/product/{id_product}`
- Header :
    - Content-Type: `application/json`
    - Accept: `application/json`
- Body :

```json
{
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
  "createdAt": "date",
  "updatedAt": "date"
}
```

## Delete Siswa

Request :
- Method : `PUT`
- Endpoint : `/api/product/{id_product}`
- Header :
    - Accept: `application/json`

Response :

```json

```