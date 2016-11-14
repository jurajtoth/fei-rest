# 06. Deleting resource

1. Create another service that will delete a single **Book** object by its ISBN.
	- for deleting resource use `RequestMethod.DELETE` method
	- as service path use `/books/{isbn}`. You will be using `PathVariable` method parameter. You can check the sample usage in exercise 02.
	- as a return value use `void`
2. After implementing the service, restart the application and test your new service with postman.
	- try to delete any single book that is in database
	- you can try deleting book *The Lord of the Rings: The Fellowship of the Ring* by its **ISBN** @ [http://localhost:8080/books/0544003411](http://localhost:8080/books/0544003411) using **HTTP DELETE** method
3. You can try to request deleted book @ [http://localhost:8080/books/0544003411](http://localhost:8080/books/0544003411) using **HTTP GET** and check if it was removed from database.

Next exercise: [07. Creating new resource](https://github.com/jurajtoth/fei-rest/tree/master/07.%20Creating%20new%20resource)
