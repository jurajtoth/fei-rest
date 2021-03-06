# 05. Getting single resource

1. Create another service that will return a single **Book** object by its ISBN.
	- for retrieving data use `RequestMethod.GET` method
	- as service path use `/books/{isbn}`. You will be using `PathVariable` argument. You can check the sample usage in [exercise 02](https://github.com/jurajtoth/fei-rest/tree/master/02.%20Basic%20REST%20application%20with%20SpringBoot).
	- as a return value use `Book`
	- if Book with requested **ISBN is not found**, `throw new NotFound404Exception("Requested book not found")` in your service. 
2. After you are finished with implementation, restart the application and test your new service with postman.
	- try to request any single book that is in database
	- you can try requesting book *Thinking in Java* by its **ISBN** @ [http://localhost:8080/books/0131872486](http://localhost:8080/books/0131872486) using **HTTP GET** method
3. You can also try requesting **unexisting ISBN**. The server should respond with **HTTP 404 Not Found**.

Next exercise: [06. Deleting resource](https://github.com/jurajtoth/fei-rest/tree/master/06.%20Deleting%20resource)