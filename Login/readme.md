This is just a simple login function that checks to see if a user is authorized or not.
I simply used a base64 encryption on the string that is that username or password and check to see
if it is correct to what we are looking for.

Using The below we can encode the hardcoded string

Base64.getEncoder().encodeToString("STRINGTOENCODE".getBytes());

or get input from a user and encode it

var username = scala.io.StdIn.readLine()
var encryptedUsername = Base64.getEncoder().encodeToString(username.getBytes());

To decode it and check to make sure user inputted what you want you can use:
var decodedBytes = Base64.getDecoder().decode(encodedString);
var decodedString = new String(decodedBytes);
