# 09. Getting filtered resources

1. Update the existing **GET /book** service to support filtering books by author:
	- add `@RequestParam(value = "author", required = false) String author` parameter to this method. This parameter represents query string parameter **author**.
	- update to code to check if value of this added parameter is not null. If it is not, return new list containing only books with author equal to value of author `@RequestParam`.
2. After you are finished with changes, restart the application and test your updated service with postman.
	- try to request all books filtered by author
	- you can try requesting books by *J.K. Rowling* @ [http://localhost:8080/book?author=J.K. Rowling](http://localhost:8080/book?author=J.K.%20Rowling) using **HTTP GET** method

If you would like you can try final [bonus exercise](https://github.com/jurajtoth/fei-rest/tree/master/Bonus%20exercise). 
