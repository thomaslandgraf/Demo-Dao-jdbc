import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {


    SellerDao sellerDao = DaoFactory.createSellerDao();

    IO.println("===TEST 1: Seller findById===");
    Seller seller = sellerDao.findById(4);
    IO.println(seller);

    IO.println("===TEST 2: Find seller by DepartmentId===");
    Department dep = new Department(4, null);
    List<Seller> list  = sellerDao.findByDepartment(dep);
    for(Seller obj : list) {
        System.out.println(obj);
    }

    IO.println("===TEST 3: Find seller findAll===");
    list = sellerDao.findAll();
    for(Seller obj : list) {
        System.out.println(obj);
    }

}
