package example;

import com.orientechnologies.orient.core.db.ODatabaseType;
import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;

import example.dto.Doctor;

public class Main {

    public static void main(String[] args) {

      final String DATABASE = "Health";

      OrientDB orient = new OrientDB("plocal:db", OrientDBConfig.defaultConfig());
      orient.create(DATABASE, ODatabaseType.PLOCAL);
      ODatabaseSession db = orient.open(DATABASE, "admin", "admin");

      Doctor doctor = new Doctor(db);

      final String[] doctors = new String[]{
        "Adam", "Bill", "Charlie"
      };
      for (String name : doctors)
        doctor.insert(name);

      doctor.findAll();
      doctor.findInEdge();
      doctor.findOutEdge();
      doctor.findBothEdge();

      db.close();
      orient.close();

  }

}
