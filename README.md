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
  "code": "number",
  "status": "string",
  "data": {
      "id": "string, unique",
      "name": "string",
      "price": "long",
      "quantity": "integer",
      "createdAt": "date",
      "updatedAt": "date"
  }
}
```

## Get Product

Request :
- Method : `GET`
- Endpoint : `/api/products/{id_product}`
- Header :
    - Accept: `application/json`

Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
      "id": "string, unique",
      "name": "string",
      "price": "long",
      "quantity": "integer",
      "createdAt": "date",
      "updatedAt": "date"
  }
}
```

## List Products

Request :
- Method : `GET`
- Endpoint : `/api/products`
- Header :
    - Accept: `application/json`
- Parameter :
    - size: `number`
    - page: `number`

Response :

```json
{
  "code": "number",
  "status": "string",
  "data": [
      {
          "id": "string, unique",
          "name": "string",
          "price": "long",
          "quantity": "integer",
          "createdAt": "date",
          "updatedAt": "date"
      }, 
      {
           "id": "string, unique",
           "name": "string",
           "price": "long",
           "quantity": "integer",
           "createdAt": "date",
           "updatedAt": "date"
       }
  ]
}
```

## Update Product

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
  "code": "number",
  "status": "string",
  "data": {
      "id": "string, unique",
      "name": "string",
      "price": "long",
      "quantity": "integer",
      "createdAt": "date",
      "updatedAt": "date"
  }
}
```

## Delete Product

Request :
- Method : `PUT`
- Endpoint : `/api/product/{id_product}`
- Header :
    - Accept: `application/json`

Response :

```json
{
  "code": "number",
  "status": "string"
}
```