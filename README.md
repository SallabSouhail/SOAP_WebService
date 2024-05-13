# SOAP_WebServices

## Overview

This project is a SOAP-based web service implemented in Java. It provides functionality for managing products, such as adding, retrieving, updating, and deleting products. Additionally, it offers operations for retrieving product prices, getting all products, and deleting all products. 

The project consists of two main components:
- **WebService**: Defines the service interface and implementation for managing products.
- **Client**: A client application demonstrating how to consume the web service functionalities.

## Technologies Used

- Java
- Jakarta XML Web Services (JAX-WS)
- IntelliJ IDEA

## Project Structure

The project is structured into the following packages:

- `amoa.domain`: Contains domain classes representing products and collections of products.
- `amoa.exceptions`: Defines custom exception classes.
- `amoa.webservices`: Defines the web service interface and its implementation.
- `amoa.server`: Contains the class responsible for publishing the web service.
- `amoa.client`: Provides a client application for consuming the web service.

## Web Service Interface

The `ProductsManager` interface defines the operations available in the web service:

- `addProduct`: Add a new product.
- `getProduct`: Retrieve a product by its ID.
- `getProductPrice`: Retrieve the price of a product by its ID.
- `getProducts`: Retrieve all products.
- `updateProduct`: Update an existing product.
- `deleteProduct`: Delete a product by its ID.
- `deleteAllProducts`: Delete all products.

## Web Service Implementation

The `ProductsManagerImpl` class implements the `ProductsManager` interface. It provides the logic for handling product management operations.

## Client Application

The `ClientWS` class demonstrates how to consume the web service functionalities. It performs operations such as adding, retrieving, updating, and deleting products.

## Usage

1. **Start the Server**: Run the `ServicePublisher` class to publish the web service.
2. **Run the Client**: Execute the `ClientWS` class to interact with the web service.

## Testing

The web service has been tested using SOAPUI. The test scenarios and results can be found in the test documentation.

## How to Use

To use this project:

1. Clone the repository.
2. Import the project into IntelliJ IDEA.
3. Build and run the project ([Usage Section](#usage))
4. Access the web service endpoints using SOAPUI or any SOAP client.

## Contributors

- SALLAB Souhail
