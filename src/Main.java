
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static double costOfService(Map<Device, Boolean> mapaPrzegladow) {

		System.out.print("Total cost of services: ");

		return mapaPrzegladow.entrySet().stream().filter((f) -> f.getValue())
				.mapToDouble(w -> w.getKey().getCostOfService()).sum();

	}

	public static Map<Device, Boolean> services(Set<Device> collection, Map<String, Integer> mapOfServices) {

		Map<Device, Boolean> devicesCondition = new TreeMap<>(
				(o1, o2) -> Integer.compare(o1.getWorkTime(), o2.getWorkTime()));

		collection.stream().forEach(s -> {

			devicesCondition.put(s, s.getWorkTime() >= mapOfServices.get(s.getClas()));

			devicesCondition.entrySet().forEach(x -> {
				System.out.println(x.getKey() + " " + x.getValue());
			});

		});

		return devicesCondition;
	}

	public static void main(String[] args) {

		Set<Device> devicesCollection = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
		Device u1 = new Device("WIERTARKA", 21, 125, "A");
		Device u2 = new Device("MLOT PNEUMATYCZNY", 35, 2000, "B");
		Device u3 = new Device("KOPARKA", 88, 15000, "D");
		Device u4 = new Device("KOSIARKA", 52, 500, "C");
		Device u5 = new Device("PILA SPALINOWA", 78, 497, "B");
		Device u6 = new Device("DMUCHAWA", 19, 360, "A");

		devicesCollection.add(u1);
		devicesCollection.add(u2);
		devicesCollection.add(u3);
		devicesCollection.add(u4);
		devicesCollection.add(u5);
		devicesCollection.add(u6);

		Map<String, Integer> mapOfServices = new TreeMap<>();

		mapOfServices.put("A", 20);
		mapOfServices.put("B", 30);
		mapOfServices.put("C", 40);
		mapOfServices.put("D", 50);

		for (Entry<String, Integer> m : mapOfServices.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}

		System.out.println(services(devicesCollection, mapOfServices));

		System.out.println(costOfService(services(devicesCollection, mapOfServices)));
	}

}
