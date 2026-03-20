import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    Scanner sc = new Scanner(System.in);

    SellerDao sellerDao = DaoFactory.createSellerDao();

    IO.println("===TEST 1: Seller findById===");
    Seller seller = sellerDao.findById(4);
    IO.println(seller);

    IO.println();
    IO.println("===TEST 2: Find seller by DepartmentId===");
    Department dep = new Department(4, null);
    List<Seller> list  = sellerDao.findByDepartment(dep);
    for(Seller obj : list) {
        System.out.println(obj);
    }

    IO.println();
    IO.println("===TEST 3: Find seller findAll===");
    list = sellerDao.findAll();
    for(Seller obj : list) {
        System.out.println(obj);
    }

    IO.println();
    IO.println("===TEST 4: Seller Insert===");
    Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, dep);
    sellerDao.insert(newSeller);
    IO.println("Inserted! New id = " + newSeller.getId());

    IO.println();
    IO.println("===TEST 5: Seller UPDATE===");
    seller = sellerDao.findById(1);
    seller.setName("Martha Waine");
    sellerDao.update(seller);
    IO.println("Update complete!");

    IO.println();
    IO.println("===TEST 5: Seller DELETE===");
    System.out.print("Enter id for delete test: ");
    int id = sc.nextInt();
    sc.nextLine();
    sellerDao.deleteById(id);
    System.out.println("DELETE COMPLETE!");

    sc.close();
}
