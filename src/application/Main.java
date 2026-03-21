import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    Scanner sc = new Scanner(System.in);

    SellerDao sellerDao = DaoFactory.createSellerDao();
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

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

    IO.println();
    IO.println("-------------------------DEPARTMENT-----------------");
    IO.println("===TEST 1: Department findById===");
    Department department = departmentDao.findById(4);
    IO.println(department);

    List<Department> departmentList = new ArrayList<>();
    IO.println();
    IO.println("===TEST 2: Find Department findAll===");
    departmentList = departmentDao.findAll();
    for(Department obj : departmentList) {
        System.out.println(obj);
    }

    IO.println();
    IO.println("===TEST 3: Department Insert===");
    Department newDepartment = new Department(null, "Cashier");
    departmentDao.insert(newDepartment);
    IO.println("Inserted! New id = " + newDepartment.getId());

    IO.println();
    IO.println("===TEST 4: Department UPDATE===");
    department = departmentDao.findById(1);
    department.setName("Administration");
    departmentDao.update(department);
    IO.println("Update complete!");

    IO.println();
    IO.println("===TEST 5: Department DELETE===");
    System.out.print("Enter id for delete test: ");
    int dep_id = sc.nextInt();
    sc.nextLine();
    departmentDao.deleteById(dep_id);
    System.out.println("DELETE COMPLETE!");

    sc.close();
}
