# 03. Getting all resources

1. The imported application contains **BookDatabase.java** class that represents in-memory database for storing **Book.java** objects. This database is already initialized in **BookService.java** class you will be editing.
2. Inspired by snippets from previous exercise create a service for getting all **Book** objects from **BookDatabase**.
	- for retrieving data use `RequestMethod.GET` method
	- as service path use `/book`
	- as a return value use `List<Book>`
3. After implementing your first service method, run application by right clicking **Application.java** file in NetBeans and clicking **Run File**.
4. Wait until application is started and try to access your service @ [http://localhost:8080/book](http://localhost:8080/book)
5. The **list of Book objects** will be serialized to **json** output that will be returned.

Next exercise: