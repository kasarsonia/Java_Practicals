package sql;

public class Sql_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create c = new create();
		c.createNewDatabase("SSSIT.db");  
        c.createTable();
        
        insert app = new insert();
        app.insert("Aryan", 30000);  
        app.insert("Robert", 40000);  
        app.insert("Jerry", 50000);
        
        
        select s = new select();  
        s.selectAll();  
	}

}
