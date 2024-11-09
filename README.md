# Kodilla Library Application
This is a library management system that allows managing books, publications, readers, and borrowings in a library. It is built with Spring Boot, and it exposes a RESTful API for managing library resources.

## Technologies
This project is built with:
- **Java 17**
- **Spring Boot 2.6**
- **MySQL Database**: 
- **Lombok**
- **Maven**

## API Endpoints
### Books

- **GET** `/v1/library/books`  
  Retrieves a list of all books in the library.

- **GET** `/v1/library/books/{bookId}`  
  Retrieves details for a specific book by ID.

- **POST** `/v1/library/books`  
  Creates a new book.  
  **Request Body**: JSON with BookDto details.

- **PUT** `/v1/library/books`  
  Updates an existing book.  
  **Request Body**: JSON with BookDto details.

- **DELETE** `/v1/library/books/{bookId}`  
  Deletes a book by ID.

### Publications

- **GET** `/v1/library/publications`  
  Retrieves a list of all publications in the library.

- **GET** `/v1/library/publications/{publicationId}`  
  Retrieves details of a specific publication by its ID.

- **POST** `/v1/library/publications`  
  Creates a new publication record.  
  **Request Body**: JSON with `PublicationDto` details.

- **PUT** `/v1/library/publications`  
  Updates an existing publication record.  
  **Request Body**: JSON with `PublicationDto` details.

- **DELETE** `/v1/library/publications/{publicationId}`  
  Deletes a publication record by ID.

  ### Readers 

- **GET** `/v1/library/readers`  
  Retrieves a list of all readers registered in the library.

- **GET** `/v1/library/readers/{readerId}`  
  Retrieves details of a specific reader by their ID.

- **POST** `/v1/library/readers`  
  Registers a new reader in the library.  
  **Request Body**: JSON with `ReaderDto` details.

- **PUT** `/v1/library/readers`  
  Updates an existing reader's information.  
  **Request Body**: JSON with `ReaderDto` details.

- **DELETE** `/v1/library/readers/{readerId}`  
  Deletes a reader from the library system by their ID.

  ### Readers 

- **GET** `/v1/library/readers`  
  Retrieves a list of all readers registered in the library.

- **GET** `/v1/library/readers/{readerId}`  
  Retrieves details of a specific reader by their ID.

- **POST** `/v1/library/readers`  
  Registers a new reader in the library.  
  **Request Body**: Requires JSON payload with `ReaderDto` details.

- **PUT** `/v1/library/readers`  
  Updates an existing reader's information.  
  **Request Body**: Requires JSON payload with `ReaderDto` details.

- **DELETE** `/v1/library/readers/{readerId}`  
  Deletes a reader from the library system by their ID.
