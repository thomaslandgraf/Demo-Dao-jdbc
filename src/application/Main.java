import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {


    SellerDao sellerDao = DaoFactory.createSellerDao();

    IO.println("===TEST 1: Seller findById===");
    Seller seller = sellerDao.findById(4);
    IO.println(seller);
}
