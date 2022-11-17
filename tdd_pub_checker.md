## TDD Server Checker

Today we are working with different types of servers - we are being asked to write a piece of software able to check if a guest at our pub can be served or not!

The `Guest` class is very barebones, you need to add properties, getters, and optionally setters to pass the tests below.

The `Server` class has a `canServeGuest` method, that takes in a guest, and returns a boolean if the guest can be served or not!

The following criteria need to be met:

* Guest must be over 18
* Guest must have enough money (each drink should cost £5.00, if they have more, they can be served)
* Guest must be sober enough (using an integer scale, 100-50 they are sober enough, under 50 refused!)
* Guest must not be banned from the pub
* Guest must have money in the local currency (Hint: Use a char for the currency symbol)

### MVP:

Using TDD, write tests to meet all criteria, then write code to pass the tests.

### Extensions:

* Guests should only be served if their preferred drink can be served by our server (Hint: Use an `ArrayList` of `String`s for drink names on the server, and add a `favouriteDrink` for the guest)
* The test might seem repetitive - think of ways how you can simplify/refactor them - then refactor!

There is starter code provided, but you can start from scratch if you're comfortable with it! Don't forget to use TDD to solve the task!