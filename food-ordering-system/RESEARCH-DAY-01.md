# RESEARCH-DAY-01.md

### Q1. What does CRUD stand for?
CRUD stands for **Create, Read, Update, and Delete**. These are the four basic operations you can perform on any data stored in a database.

### Q2. Difference between HTTP methods POST, PUT, PATCH, DELETE?
* **POST:** Used to submit data to **create** a brand-new record.
* **PUT:** Used to **replace** an entire existing record with updated information. If you leave fields out, they might get cleared.
* **PATCH:** Used to make **partial updates** to a record (changing only one or two fields while leaving the rest alone).
* **DELETE:** Used to completely **remove** a record from the database.

### Q3. Give the correct HTTP status code for each:
* **a. A new category was created:** `201 Created`
* **b. A category was deleted successfully:** `200 OK` or `204 No Content`
* **c. The id requested does not exist:** `404 Not Found`
* **d. The request body is missing a required field:** `400 Bad Request`
* **e. The user is logged in but not allowed:** `403 Forbidden`

### Q4. Difference between @RequestBody, @RequestParam, @PathVariable - with one tiny example of each.
* **@PathVariable:** Grabs a variable directly from the URL path itself.
    * *Example:* `/api/categories/{id}` -> `/api/categories/5` (grabs `5`).
* **@RequestParam:** Grabs filter parameters appended to the end of the URL after a question mark.
    * *Example:* `/api/categories?search=Burgers` (grabs `"Burgers"`).
* **@RequestBody:** Grabs the complete JSON data object sent in the hidden background body of the request.
    * *Example:* `{ "name": "Burgers" }` mapped to a Java object.

### Q5. What is Jakarta Bean Validation? Explain @Valid, @NotBlank, @Size.
It is a tool used to make sure data coming from the frontend is correct before Java processes it.
* **@Valid:** Tells Spring to check the validation rules on an incoming object body.
* **@NotBlank:** Ensures a text field is not empty and doesn't just contain blank spaces.
* **@Size:** Restricts a field's characters to a specific length (e.g., a name must be between 2 and 50 characters).

### Q6. Why return a DTO and not the entity itself? Give 2 reasons.
1. **Security & Privacy:** Entities map directly to database tables. Returning them might accidentally leak sensitive columns (like passwords or internal database keys) to the frontend. DTOs let you hide what you don't want seen.
2. **Decoupling:** If you change your database structure later, your backend code might break. DTOs act as a buffer so database changes don't force frontend developers to change their code.

### Q7. What is Optional<T>? Why does findById return Optional?
`Optional<T>` is a special Java container wrapper that might or might not contain a value.
* **Why findById uses it:** If you search for an ID (like category `999`) that doesn't exist, a database would normally return `null`, which causes app crashes. By returning an `Optional`, Java safely forces you to check if the data is actually there before you try to use it.