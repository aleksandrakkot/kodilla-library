# Prosta aplikacja biblioteki
Jest to system zarządzania biblioteką, który umożliwia zarządzanie książkami, publikacjami, czytelnikami i wypożyczeniami w bibliotece. Aplikacja jest zbudowana w oparciu o Spring Boot i udostępnia RESTful API do zarządzania zasobami biblioteki.

## Technologie
Projekt zbudowany jest z wykorzystaniem następujących technologii:
- **Java 17**
- **Spring Boot 2.6**
- **Baza danych MySQL**
- **Lombok**
- **Maven**

## Endpoints API
### Books

- **GET** `/v1/library/books`  
  Pobiera listę wszystkich książek w bibliotece.

- **GET** `/v1/library/books/{bookId}`  
  Pobiera szczegóły dotyczące konkretnej książki po jej ID.

- **POST** `/v1/library/books`  
  Tworzy nową książkę.  
  **Treść żądania**: JSON z danymi `BookDto`.

- **PUT** `/v1/library/books`  
  Aktualizuje istniejącą książkę.  
  **Treść żądania**: JSON z danymi `BookDto`.

- **DELETE** `/v1/library/books/{bookId}`  
  Usuwa książkę po jej ID.

### Publications

- **GET** `/v1/library/publications`  
  Pobiera listę wszystkich publikacji w bibliotece.

- **GET** `/v1/library/publications/{publicationId}`  
  Pobiera szczegóły konkretnej publikacji po jej ID.

- **POST** `/v1/library/publications`  
  Tworzy nową publikację.  
  **Treść żądania**: JSON z danymi `PublicationDto`.

- **PUT** `/v1/library/publications`  
  Aktualizuje istniejącą publikację.  
  **Treść żądania**: JSON z danymi `PublicationDto`.

- **DELETE** `/v1/library/publications/{publicationId}`  
  Usuwa publikację po jej ID.

### Readers

- **GET** `/v1/library/readers`  
  Pobiera listę wszystkich czytelników zarejestrowanych w bibliotece.

- **GET** `/v1/library/readers/{readerId}`  
  Pobiera szczegóły konkretnego czytelnika po jego ID.

- **POST** `/v1/library/readers`  
  Rejestruje nowego czytelnika w bibliotece.  
  **Treść żądania**: JSON z danymi `ReaderDto`.

- **PUT** `/v1/library/readers`  
  Aktualizuje dane istniejącego czytelnika.  
  **Treść żądania**: JSON z danymi `ReaderDto`.

- **DELETE** `/v1/library/readers/{readerId}`  
  Usuwa czytelnika z systemu bibliotecznego po jego ID.

### Borrowings

- **GET** `/v1/library/borrowings`  
  Pobiera listę wszystkich zapisów wypożyczeń w bibliotece.

- **GET** `/v1/library/borrowings/{borrowingId}`  
  Pobiera szczegóły konkretnego wypożyczenia po jego ID.

- **POST** `/v1/library/borrowings`  
  Tworzy nowe wypożyczenie.  
  **Treść żądania**: JSON z danymi `BorrowingDto`.

- **PUT** `/v1/library/borrowings`  
  Aktualizuje dane wypożyczenia.  
  **Treść żądania**: JSON z danymi `BorrowingDto`.

- **DELETE** `/v1/library/borrowings/{borrowingId}`  
  Usuwa zapis wypożyczenia po jego ID.
