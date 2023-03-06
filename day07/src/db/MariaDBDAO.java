package db;

public class MariaDBDAO implements DAO {

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted MariaDBDAO Database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Delited Database");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("Updated  MariaDBDAO Database");
	}

}
