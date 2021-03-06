# 07. Creating new resource

1. Create another service that will create a single **Book** object. New resource is sent in the request body as **json object** and it is mapped to the service method parameter using `@RequestBody Book newBook` method parameter.
	- for creating new resource use `RequestMethod.POST` method
	- as service path use `/books`
	- as a return value use `void`
	- as a method parameter use `@RequestBody Book newBook`
	- in case there is already a book with ISBN from the request in database, `throw new Forbidden403Exception()` in the service method.
2. After implementing the service, restart the application and test your new service with postman.
	- try to create new book that is not in database
	- you can try creating new book by calling [http://localhost:8080/books](http://localhost:8080/books) using **HTTP POST** method and sending the data in request body
	- to send data in request body click on **Body** in postman, select **raw** and **JSON (application/json)** content type. Paste the json book object in the body, for example: 
	<pre>{
    "isbn": "0321356683",
    "title": "Effective Java (2nd Edition)",
    "author": "Joshua Bloch",
	"numberOfPages": 346
	}
	</pre>
	- click **Send**
3. Try to GET all resources and check if new book was added.
4. You can also try to call the service from step 2 multiple times. Resource should be already in database after the first call and the service will return **HTTP 403 Forbidden**.

Next exercise: [08. Updating existing resource](https://github.com/jurajtoth/fei-rest/tree/master/08.%20Updating%20existing%20resource)
