# 03. Getting all resources

1. The imported application contains **BookDatabase.java** class that represents in-memory database for storing **Book.java** objects. This database is already initialized in **BookService.java** class you will be editing.
2. Inspired by snippets from [previous exercise](https://github.com/jurajtoth/fei-rest/tree/master/02.%20Basic%20REST%20application%20with%20SpringBoot) create a service for getting all **Book** objects from **BookDatabase**.
	- for retrieving data use `RequestMethod.GET` method
	- as service path use `/books`
	- as a return value use `List<Book>`
3. After implementing your first service method, run application by right clicking **Application.java** file in NetBeans and clicking **Run File**.
4. Wait until application is started and try to access your service @ [http://localhost:8080/book](http://localhost:8080/book)
5. The **list of Book objects** will be serialized to **json** output that will be returned.

Next exercise: [04. Testing HTTP services using Postman](https://github.com/jurajtoth/fei-rest/tree/master/04.%20Testing%20HTTP%20services%20using%20Postman)