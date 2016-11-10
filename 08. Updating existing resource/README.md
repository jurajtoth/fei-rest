# 08. Updating existing resource

1. Create another service that will update a single **Book** object by its ISBN. Updated resource is sent in the request body as **json object** and it is mapped to the service method parameter using `@RequestBody Book newBook` method parameter.
	- for creating new resource use `RequestMethod.PUT` method
	- as service path use `/book/{isbn}`. You will be using `PathVariable` method parameter.
	- as a return value use `void`
	- as a method parameter use also `@RequestBody Book updateBook`
	- in case there is no book with ISBN from the request, `throw new Forbidden403Exception()` in the service method.
2. After implementing the service, restart the application and test your new service with postman.
	- try to update an existing book
	- you can try updating the author name of *The Lord of the Rings: The Fellowship of the Ring* from **J.R.R Tolkien** to **John Ronald Reuel Tolkien** by calling [http://localhost:8080/book/0544003411](http://localhost:8080/book/0544003411) using **HTTP PUT** method and sending the data in request body
	- to send data in request body click on **Body** in postman, select **raw** and **JSON (application/json)** content type. Paste the json book object in the body, for example: 
	<pre>{
    "isbn": "0544003411",
    "title": "The Lord of the Rings: The Fellowship of the Ring",
    "author": "John Ronald Reuel Tolkien",
    "numberOfPages": 480
  	}
	</pre>
3. Try to GET the book *The Lord of the Rings: The Fellowship of the Ring* and check if author name was updated.
4. You can also try to call this service for unexisting book (ISBN). Service should return **HTTP 403 Forbidden**.

Next exercise: