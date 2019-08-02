# book-info-service
book-info-service
	input -> bookId
	output -> book details for bookId

the below url has exposed

GET http://localhost:9092/book/{bookId}  this is used by book-catalog-service
GET http://localhost:9092/books
POST http://localhost:9092/book
PUT http://localhost:9092/book
GET http://localhost:9092/book/count

"data.sql" which is available in src/main/resources will exucuted at the time of deployment 
here name must be same as data.sql
insert into BOOK_ENTITY
values(1,'Kathy Sierra, Jonathan','1234','Head First is a series of introductory instructional books to many topics',
'2009-06-15', 'Head First');

insert into BOOK_ENTITY
values(2,'Chetan Bhagat','2345','Half Girlfriend is an Indian English coming of age, young adult romance novel by 
Indian author Chetan Bhagat','2014-10-15', 'Half Girlfriend');


{
    "book": [
        {
            "bookId": "1234",
            "name": "Head First",
            "desc": "Head First is a series of introductory instructional books to many topics",
            "author": "Kathy Sierra, Jonathan",
            "launchedDate": "2009-06-15"
        },
        {
            "bookId": "2345",
            "name": "Half Girlfriend",
            "desc": "Half Girlfriend is an Indian English coming of age, young adult romance novel by \nIndian author Chetan Bhagat",
            "author": "Chetan Bhagat",
            "launchedDate": "2014-10-15"
        }
    ]
}
