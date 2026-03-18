import model.entities.Department;
import model.entities.Seller;

void main() {

    Department obj = new Department(1, "Books");
    IO.println(obj);

    LocalDate date = LocalDate.now();
    Seller seller = new Seller(1, "Bob", "bob@gmail.com", date, 2500.0, obj);

    IO.println(seller);
}
