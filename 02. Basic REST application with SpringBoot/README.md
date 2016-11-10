# 02. Basic REST application with SpringBoot
1. In next set of exercises you will be creating basic RESTful web application using **SpringBoot** library
2. Only file you will be editing is **BookService.java**
3. Creating **REST services** with SpringBoot is very easy. Here are some simple examples:
<pre>
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public String helloWorld() {
    return "Hello World";
}
</pre>
will return **Hello World** text if you access the application @ `http://localhost:8080/hello` using **HTTP GET** method.
<pre>
@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
public String helloWorld(@PathVariable("name") String name) {
    return "Hello "+name;
}
</pre>
will return **Hello John** text if you access the application @ `http://localhost:8080/hello/John` using **HTTP GET** method.
<pre>
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public String helloWorld(@RequestParam("name") String name) {
    return "Hello "+name;
}
</pre>
will return **Hello John** text if you access the application @ `http://localhost:8080/hello?name=John` using **HTTP GET** method.

You can now start implementing in next exercise: [03. Getting all resources](https://github.com/jurajtoth/fei-rest/tree/master/03.%20Getting%20all%20resources)

