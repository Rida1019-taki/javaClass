//void main(){
//    System.out.println("-----------------------Student-----------------------------");
//    Student s1 = new Student("rida" , 20 , "A+");
//    s1.displayInfo();
//
//    System.out.println("----------------------Product-----------------------------");
//
//    Product p1 = new Product(101 , "Latop" , 8500.0);
//    p1.displayProduct();
//
//    System.out.println("---------------------Rectangle------------------------------");
//
//    Rectangle r1 = new Rectangle(4 , 3);
//    r1.display();
//    System.out.println("The area : " + r1.calculateArea());
//
//    System.out.println("--------------------BankAccount--------------------------");
//
//    BankAccount b1 = new BankAccount(10 , 10000.0);
//    b1.deposit(2000);
//    b1.withdraw(1000);
//    b1.displayBalance();
//
//    System.out.println("-----------------------Car-------------------------------");
//
//    Car c1 = new Car("Mercedes" , "Maybach" , 2025);
//    c1.displayCar();
//
//    System.out.println("----------------------Circle------------------------------");
//
//    Circle cir1 = new Circle(20.0);
//    cir1.getArea();
//    cir1.getCircumference();
//    cir1.display();
//
//    System.out.println("-----------------------Movie-------------------------------");
//
//    Movie m1 = new Movie("The Boys" , 10);
//    m1.displayRating();
//
//    System.out.println("----------------------Employee-------------------------------");
//
//    Employee e1 = new Employee("rida" , 12000.0);
//    System.out.println("The Salary of year : " + e1.annualSalary());
//    e1.display();
//
//    System.out.println("------------------------Book-------------------------------");
//
//    Book bo1 = new Book("One Piece" , "Oda" , 1000.0);
//    bo1.display();
//
//    System.out.println("------------------------Temperature-------------------------------");
//
//    Temperature t1 = new Temperature(20.0);
//    t1.display();
//}
//
//public class Student {
//    String name ;
//    int age ;
//    String grade ;
//
//    public Student(String name, int age , String grade){
//        this.name = name ;
//        this.age = age ;
//        this.grade = grade ;
//    }
//
//    void displayInfo(){
//        System.out.println(name + " " + age + " " + grade);
//    }
//}
//
//public class Product{
//    int id ;
//    String name ;
//    double price ;
//
//    public Product(int id , String name , double price){
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//
//    void  displayProduct(){
//        System.out.println(id + " " + name + " " + price);
//    }
//}
//
//public class Rectangle{
//    int length;
//    int width;
//
//    public Rectangle(int length , int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    int calculateArea(){
//        return length * width;
//    }
//
//    void display(){
//        System.out.println("length : " + length + " width : " + width);
//    }
//}
//
//public class BankAccount{
//    int accountNumber ;
//    double balance;
//
//    public BankAccount(int accountNumber , double balance){
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//    void deposit(double amount){
//        double salaire = balance + amount;
//        System.out.println(salaire);
//    }
//
//    void withdraw(double amount){
//        double salaire = balance - amount;
//        System.out.println(salaire);
//    }
//
//    void displayBalance(){
//        System.out.println("The account number : " + accountNumber + " and the balance :" + balance);
//    }
//
//}
//
//public class Car {
//    String brand;
//    String model;
//    int year;
//
//    public Car(String brand , String model , int year){
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//    }
//
//    void displayCar(){
//        System.out.println("Brand : " + brand + " Model : " + model + " Year : " + year);
//    }
//}
//
//public class Circle{
//    double raduis;
//
//    public Circle(double raduis){
//        this.raduis = raduis;
//    }
//
//    void getArea(){
//        double area = 3.14 * raduis;
//        System.out.println(area);
//    }
//
//    void getCircumference(){
//        double umference = 2 * 3.14 * raduis;
//        System.out.println(umference);
//    }
//
//    void display(){
//        System.out.println("Raduis : " + raduis);
//    }
//}
//
//public class Movie{
//    String title;
//    int rating;
//
//    public Movie(String title , int rating){
//        this.title = title;
//        this.rating = rating;
//    }
//
//    void  displayRating(){
//        if (rating > 8){
//            System.out.println("Excellent");
//        } else if (rating < 8 && rating >= 5) {
//            System.out.println("Good");
//        }else {
//            System.out.println("Poor");
//        }
//    }
//}
//
//public class Employee{
//    String name;
//    double salary;
//
//    public Employee(String name , double salary){
//        this.name = name;
//        this.salary = salary;
//    }
//
//    double annualSalary(){
//        return salary * 12;
//    }
//
//    void display(){
//        System.out.println("The name : " + name + " Salary : " + salary);
//    }
//}
//
//public class Book{
//    String title;
//    String author;
//    double price;
//
//    public Book(String title, String author , double price){
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    void display(){
//        System.out.println("Title : " + title + " Author : " + author + " Price : " + price);
//    }
//}
//
//public class Temperature{
//    double celsuis;
//
//    public Temperature(double celsuis){
//        this.celsuis = celsuis;
//    }
//
//    double toFahrenheit(double total){
//        return  total =(celsuis * 9/5) + 32;
//    }
//
//    void display(){
//        System.out.println("Celuis : " + celsuis + " To Fahrenheit : " + toFahrenheit(celsuis));
//    }
//}