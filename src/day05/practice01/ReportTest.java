package day05.practice01;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReportTest {
	@Test
	public void testReport() throws Exception {

		Writer out = new OutputStreamWriter(System.out);
		
		Machine machine1= new Machine("name1", "location1");
		Machine machine2= new Machine("name2", "location2");
		Machine machine3= new Machine("name3", "location3");
		
		machine1.takeBasket("basket1");
		machine2.takeBasket("basket2");
		machine3.takeBasket("basket3");
		
		List<Machine> machines = new ArrayList<Machine>();
		
		machines.add(machine1);
		machines.add(machine2);
		machines.add(machine3);
				
		Robot robot = new Robot();
		robot.moveToMachine(machine2);
		robot.pickBasket();

		Report report = new Report();
		report.report(out, machines, robot);
		
		out.close();
	}
}
