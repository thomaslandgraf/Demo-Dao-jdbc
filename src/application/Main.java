import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    Department obj = new Department(1, "Books");
    IO.println(obj);

    SellerDao sellerDao = DaoFactory.createSellerDao();

    LocalDate date = LocalDate.now();
    Seller seller = new Seller(1, "Bob", "bob@gmail.com", date, 2500.0, obj);

    IO.println(seller);
}
